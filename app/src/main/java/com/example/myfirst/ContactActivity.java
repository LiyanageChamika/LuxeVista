package com.example.myfirst;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast; // <-- You forgot to import this!
import androidx.appcompat.app.AppCompatActivity;
public class ContactActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editTextName, editTextEmail, editTextMassege;
    private ImageView imageView9, imageView10, imageView11;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        textView = findViewById(R.id.textView);
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextMassege = findViewById(R.id.editTextMassege);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String message = editTextMassege.getText().toString().trim();

                if (name.isEmpty() || email.isEmpty() || message.isEmpty()) {
                    Toast.makeText(ContactActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ContactActivity.this, "Submitted Successfully!", Toast.LENGTH_SHORT).show();

                    // Optional: clear the fields after submission
                    editTextName.setText("");
                    editTextEmail.setText("");
                    editTextMassege.setText("");
                }
            }
        });
    }
}
