package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText findUsername, findPassword;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findUsername=findViewById(R.id.username);
        findPassword=findViewById(R.id.password);

        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = findUsername.getText().toString();
                String password = findPassword.getText().toString();
                if(username.length()>4 & password.length()>6){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,OrderForm.class));
                }else if(username.isEmpty() || password.isEmpty()){
                    Toast.makeText(MainActivity.this, "Field Cannot be blank", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}