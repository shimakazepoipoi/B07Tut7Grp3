package com.example.b07tut7grp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.admintools.Admin_Login;

public class MainActivity extends AppCompatActivity {
    Button AdminLoginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdminLoginButton = findViewById(R.id.button);
        AdminLoginButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Admin_Login.class));
            }
        });


    }
}