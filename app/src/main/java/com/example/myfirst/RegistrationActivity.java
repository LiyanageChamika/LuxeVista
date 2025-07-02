package com.example.myfirst;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    EditText editTextName, editTextNic, editTextEmail, editTextPassword, editTextConfirmPassword;
    Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration); // Check the correct layout is being used

        // Linking UI components
        editTextName = findViewById(R.id.editTextName);
        editTextNic = findViewById(R.id.editTextNic);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        // Register button click listener
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("RegistrationActivity", "Register button clicked!");  // Debugging log

                String name = editTextName.getText().toString().trim();
                String nic = editTextNic.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                String confirmPassword = editTextConfirmPassword.getText().toString().trim();

                // Check if passwords match
                if (password.equals(confirmPassword)) {
                    Log.d("RegistrationActivity", "Passwords match! Proceeding with registration...");
                    // Normally, you'd save user info in a database or send to a server
                    Toast.makeText(RegistrationActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                    // After successful registration, you can redirect to the Login screen
                    finish(); // Close the registration screen and return to the previous screen (Login)
                } else {
                    Log.d("RegistrationActivity", "Passwords do not match");
                    Toast.makeText(RegistrationActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
