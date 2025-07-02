package com.example.myfirst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OwnerLoginActivity extends AppCompatActivity {

    EditText editTextUsername, editTextPassword;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_login);

        // Link UI components
        editTextUsername = findViewById(R.id.editTextOwnerUsername);
        editTextPassword = findViewById(R.id.editTextOwnerPassword);
        buttonLogin = findViewById(R.id.buttonOwnerLogin);

        // Login button click
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Hardcoded owner login check (you can connect to database later)
                if (username.equals("owner") && password.equals("admin123")) {
                    Toast.makeText(OwnerLoginActivity.this, "Owner Login Successful!", Toast.LENGTH_SHORT).show();

                    // Redirect to Owner Dashboard (you can create OwnerDashboardActivity later)
                    Intent intent = new Intent(OwnerLoginActivity.this, OwnerDashboardActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(OwnerLoginActivity.this, "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
