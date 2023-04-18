package com.psalms.platenumberocr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddOfficer extends AppCompatActivity {

    private EditText edtOfficerUsername;
    private EditText edtOfficerFullname;
    private EditText edtOfficerPassword;
    private EditText edtOfficerRank;
    private Button adminAddOfficer;
    private DbHandler dbHandler;
    private Intent intent;

    String officerUsername;
    String officerFullname;
    String officerPassword;
    String officerRank;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_officer);

        //Find Views
        edtOfficerUsername = findViewById(R.id.edtOfficerUsername);
        edtOfficerFullname = findViewById(R.id.edtOfficerFullname);
        edtOfficerPassword = findViewById(R.id.edtOfficerPassword);
        edtOfficerRank = findViewById(R.id.edtOfficerRank);
        adminAddOfficer = findViewById(R.id.adminButtonAddOfficer);

        adminAddOfficer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHandler = new DbHandler(AddOfficer.this);

                officerUsername = edtOfficerUsername.getText().toString();
                officerFullname = edtOfficerFullname.getText().toString();
                officerPassword = edtOfficerPassword.getText().toString();
                officerRank = edtOfficerRank.getText().toString();

                dbHandler.addNewOfficer(officerUsername,officerPassword,officerRank,officerFullname);
                Toast.makeText(getApplicationContext(),"Officer Added Successfully",Toast.LENGTH_LONG).show();

            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        intent = new Intent(getApplicationContext(),AdminMenu.class);
        startActivity(intent);
        finish();
    }
}