package com.example.myfirst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OwnerDashboardActivity extends AppCompatActivity {

    Button buttonManageUsers, buttonViewBookings, buttonAddService, buttonLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_dashboard);


        buttonManageUsers = findViewById(R.id.buttonManageUsers);
        buttonViewBookings = findViewById(R.id.buttonViewBookings);
        buttonAddService = findViewById(R.id.buttonAddService);
        buttonLogout = findViewById(R.id.buttonLogout);


        buttonManageUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(OwnerDashboardActivity.this, "Manage Users clicked", Toast.LENGTH_SHORT).show();

            }
        });


        buttonViewBookings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(OwnerDashboardActivity.this, "View Bookings clicked", Toast.LENGTH_SHORT).show();

            }
        });


        buttonAddService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(OwnerDashboardActivity.this, "Add New Service clicked", Toast.LENGTH_SHORT).show();

            }
        });


        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(OwnerDashboardActivity.this, "Logged out", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(OwnerDashboardActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
