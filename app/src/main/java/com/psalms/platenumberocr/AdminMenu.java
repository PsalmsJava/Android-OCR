package com.psalms.platenumberocr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminMenu extends AppCompatActivity {
    private Button buttonAddOfficer;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);

        buttonAddOfficer = findViewById(R.id.buttonAddOfficer);

        buttonAddOfficer.setOnClickListener(v -> {
            intent = new Intent(getApplicationContext(),AddOfficer.class);
            startActivity(intent);
            finish();
        });

    }
}