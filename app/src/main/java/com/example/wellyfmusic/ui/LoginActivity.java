package com.example.wellyfmusic.ui;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.wellyfmusic.ForgotPassword;
import com.example.wellyfmusic.R;
import com.example.wellyfmusic.homeActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView   register, forgotPassword;
    private EditText Email,password;
    private Button signin;

    private FirebaseAuth mAuth;
    private ProgressBar progressbar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register = findViewById(R.id.Register);
        register.setOnClickListener(this);
        signin = findViewById(R.id.login);
        signin.setOnClickListener(this);
        Email = findViewById(R.id.email);
        password = findViewById(R.id.Password);
        progressbar = findViewById(R.id.progressbar);
        mAuth = FirebaseAuth.getInstance();
        forgotPassword = findViewById(R.id.Forgotpassword);
        forgotPassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Register:
                startActivity(new Intent(this, Register.class));
                break;
            case R.id.login:
                userLogin();
                break;
            case R.id.Forgotpassword:
                startActivity(new Intent(this, ForgotPassword.class));
                break;
            default:
                break;
        }
    }

    private void userLogin() {
        String email = Email.getText().toString().trim();
        String Password = password.getText().toString().trim();

        if(email.isEmpty()){
            Email.setError("email is required");
            Email.requestFocus();
            return;
        }
        if(Password.isEmpty()){
            password.setError("password is required");
            password.requestFocus();
            return;
        }
        if(Password.length() < 6) {
            password.setError("Min password length is 6 characters");
            password.requestFocus();
            return;
        }

        progressbar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(email, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()){
                    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                    startActivity(new Intent(LoginActivity.this, homeActivity.class));
                }
                else {
                    Toast.makeText(LoginActivity.this,"Failed to login!please check your credentials!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
