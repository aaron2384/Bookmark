package com.example.bookmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView markertxt, desc;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        markertxt = findViewById(R.id.marker);
        desc = findViewById(R.id.descriptiontxt);
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        String space = "\n";
        markertxt.setText(space + title);
        desc.setText(description);

        back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetailsActivity.this, MapsActivity.class);
                startActivity(i);
            }
        });
    }
}