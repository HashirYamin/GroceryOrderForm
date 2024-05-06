package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OrderForm extends AppCompatActivity {

    EditText firstname, lastname, telephoneNo, phoneNo, email, appleAmount, bananaAmount, avacadoAmount;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_form);

        firstname=findViewById(R.id.firstname);
        lastname=findViewById(R.id.lastname);
        telephoneNo=findViewById(R.id.phone_no1);
        phoneNo=findViewById(R.id.phone_no2);
        email=findViewById(R.id.email);
        submit=findViewById(R.id.submit);
        appleAmount=findViewById(R.id.apple_amount);
        bananaAmount=findViewById(R.id.amount_banana);
        avacadoAmount=findViewById(R.id.amount_avacado);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderForm.this, DisplayForm.class);
                intent.putExtra("FirstName",firstname.getText().toString());
                intent.putExtra("LastName",lastname.getText().toString());
                intent.putExtra("TelePhoneNo",telephoneNo.getText().toString());
                intent.putExtra("PhoneNo",phoneNo.getText().toString());
                intent.putExtra("Email",email.getText().toString());
                intent.putExtra("AppleAmount",appleAmount.getText().toString());
                intent.putExtra("BananaAmount",bananaAmount.getText().toString());
                intent.putExtra("AvacadoAmount",avacadoAmount.getText().toString());
                startActivity(intent);
                Toast.makeText(OrderForm.this, "Your order Placed Sucessfully!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}