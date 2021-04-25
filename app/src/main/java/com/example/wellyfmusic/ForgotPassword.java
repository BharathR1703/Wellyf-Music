package com.example.wellyfmusic;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wellyfmusic.ui.LoginActivity;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword extends AppCompatActivity {

    private FirebaseAuth mauth;
    private EditText Email;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        ImageView imageView = findViewById(R.id.image);
        imageView.setOnClickListener(view -> {
            Intent intent = new Intent(ForgotPassword.this, LoginActivity.class);
            startActivity(intent);
        });
        Email = findViewById(R.id.email);
        Button resetpassword = findViewById(R.id.resetpassword);
        progressBar = findViewById(R.id.progressbar);
        mauth = FirebaseAuth.getInstance();
        resetpassword.setOnClickListener(view -> resetPassword());

    }

    private void resetPassword() {
        String email = Email.getText().toString().trim();

        if (email.isEmpty()) {
            Email.setError("email is required");
            Email.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);
        mauth.sendPasswordResetEmail(email).addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                Toast.makeText(ForgotPassword.this, "check your email to reset your password", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(ForgotPassword.this,"Try again Something went wrong",Toast.LENGTH_LONG).show();
            }
        });
    }

}
