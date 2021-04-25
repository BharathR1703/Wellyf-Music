package com.example.wellyfmusic.ui;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wellyfmusic.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private TextView banner, registerUser;
    private EditText Fullname, Email,password;
    private ProgressBar progressbar;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        banner = (TextView)findViewById(R.id.banner);
        banner.setOnClickListener(this);

        registerUser = (TextView)findViewById(R.id.Register);
        registerUser.setOnClickListener(this);

        Fullname = (EditText)findViewById(R.id.fullname);
        Email= (EditText) findViewById(R.id.email);
        password = (EditText)findViewById(R.id.Password);

        progressbar = (ProgressBar)findViewById(R.id.progressbar);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.banner:
                startActivity(new Intent(this,LoginActivity.class));
                break;
            case R.id.Register:
                registerUser();
                break;
        }
    }

    private void registerUser() {
        String email= Email.getText().toString().trim();
        String Password= password.getText().toString().trim();
        String fullname= Fullname.getText().toString().trim();

        if(fullname.isEmpty()){
            Fullname.setError("Full name is required");
            Fullname.requestFocus();
            return;
        }

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


        progressbar.setVisibility(View.VISIBLE);

        mAuth.createUserWithEmailAndPassword(email,Password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            User user = new User(fullname,email);

                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if (task.isSuccessful()){
                                            Toast.makeText(Register.this,"User has been registered successfully",Toast.LENGTH_LONG).show();
                                        }else{
                                            Toast.makeText(Register.this,"Failed to register! try again!",Toast.LENGTH_LONG).show();
                                        }
                                        progressbar.setVisibility(View.GONE);
                                    }
                                });
                            }else {
                                Toast.makeText(Register.this,"Failed to register! try again!",Toast.LENGTH_LONG).show();
                                progressbar.setVisibility(View.GONE);
                            }
                        }
                    });

    }
}