package com.example.myfirst;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLogin, btnRegiter, btnServices, btnBookNow, btnRooms, btnGallery, btnContact, btnOwner;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        btnRegiter = findViewById(R.id.btnregister);
        btnServices = findViewById(R.id.btnServices);
        btnBookNow = findViewById(R.id.btnBookNow);
        btnRooms = findViewById(R.id.btnRooms);
        btnGallery = findViewById(R.id.btnGallery);
        btnContact = findViewById(R.id.btnContact);
        btnOwner = findViewById(R.id.btnOwner);

        btnLogin.setOnClickListener(v ->{
            startActivity(new Intent(MainActivity.this,LoginActivity.class));
        });

        btnRegiter.setOnClickListener(v ->{
            startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
        });

        btnServices.setOnClickListener(v ->{
            startActivity(new Intent(MainActivity.this, ServisesActivity.class));
        });

        btnBookNow.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, BookingActivity.class));
        });

        btnRooms.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, RoomActivity.class));
        });

        btnGallery.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, GalleryActivity.class));
        });

        btnContact.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ContactActivity.class));
        });

        btnOwner.setOnClickListener(v->{
            startActivity(new Intent(MainActivity.this, OwnerLoginActivity.class));
        });

    }
}