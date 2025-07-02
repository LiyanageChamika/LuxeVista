package com.example.myfirst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BookingActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private Spinner spinnerGuests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        // Initialize views
        datePicker = findViewById(R.id.datePicker);
        spinnerGuests = findViewById(R.id.spinnerGuests);
        Button btnConfirmBooking = findViewById(R.id.btnConfirmBooking);

        // Button action to confirm booking
        btnConfirmBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookingActivity.this, "Your Booking is Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(BookingActivity.this, MainActivity.class);
                // Logic to confirm booking
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1;
                int year = datePicker.getYear();
                String guests = spinnerGuests.getSelectedItem().toString();

            }
        });
    }
}