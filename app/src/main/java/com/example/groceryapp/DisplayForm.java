package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayForm extends AppCompatActivity {

    TextView showDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_form);

        showDetails=findViewById(R.id.show_details);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("FirstName");
        String lastName = intent.getStringExtra("LastName");
        String telephoneNo = intent.getStringExtra(("TelePhoneNo"));
        String phoneNo = intent.getStringExtra("PhoneNo");
        String email = intent.getStringExtra("Email");
        String appleAmount = intent.getStringExtra("AppleAmount");
        String bananaAmount = intent.getStringExtra("BananaAmount");
        String avacadoAmount = intent.getStringExtra("AvacadoAmount");


        showDetails.setText("First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "TelephoneNo: " + telephoneNo + "\n" +
                "PhoneNo: " + phoneNo + "\n" +
                "Email: " + email + "\n" +
                "AppleAmount: " + appleAmount + "\n" +
                "BananaAmount: " + bananaAmount + "\n" +
                "AvacadoAmount: " + avacadoAmount);



    }
}