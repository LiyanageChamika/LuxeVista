package com.example.myfirst;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RoomActivity extends AppCompatActivity {

    private Button btnRoom1, btnRoom2, btnRoom3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room); // your layout

        // Initialize buttons
        btnRoom1 = findViewById(R.id.btnRoom1);
        btnRoom2 = findViewById(R.id.btnRoom2);
        btnRoom3 = findViewById(R.id.btnRoom3);

        // Handle Room 1 booking
        btnRoom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoomActivity.this, BookingActivity.class);
                intent.putExtra("roomType", "Luxury Suite");
                intent.putExtra("price", "$200 per night");
                startActivity(intent);
            }
        });

        // Handle Room 2 booking
        btnRoom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoomActivity.this, BookingActivity.class);
                intent.putExtra("roomType", "Standard Room");
                intent.putExtra("price", "$150 per night");
                startActivity(intent);
            }
        });

        // Handle Room 3 booking
        btnRoom3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RoomActivity.this, "Your Room Booking is Successful", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RoomActivity.this, BookingActivity.class);
                intent.putExtra("roomType", "Deluxe Room");
                intent.putExtra("price", "$250 per night");
                startActivity(intent);
            }
        });
    }
}
