package com.example.myfirst;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class GalleryActivity extends AppCompatActivity {
    private TextView galleryTitle;
    private ImageView h2, r1, r4, r5, h5, h6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        galleryTitle = findViewById(R.id.galleryTitle);
        h2 = findViewById(R.id.img1);
        r1 = findViewById(R.id.img2);
        r4 = findViewById(R.id.img3);
        r5 = findViewById(R.id.img4);
        h5 = findViewById(R.id.img5);
        h6 = findViewById(R.id.img6);

        h2.setImageResource(R.drawable.h2);
        r1.setImageResource(R.drawable.h5);
        r4.setImageResource(R.drawable.r1);
        r5.setImageResource(R.drawable.r4);
        h5.setImageResource(R.drawable.r5);
        h6.setImageResource(R.drawable.h6);

        galleryTitle.setText("Our Resort Gallery");
    }
}
