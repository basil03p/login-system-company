package com.suii.employeelogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText et1, et2;
    String s1, s2;
    String err = "Invalid username or password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.usnm);
        et2 = findViewById(R.id.pas);
        b1 = findViewById(R.id.logbut);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = et1.getText().toString().trim();
                s2 = et2.getText().toString().trim();

                if (s1.isEmpty() || s2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Fields cannot be empty", Toast.LENGTH_SHORT).show();
                } else if (s1.equals("admin") && s2.equals("12345")) {
                    Intent in = new Intent(MainActivity.this, emppage.class);
                    startActivity(in);
                } else {
                    Toast.makeText(getApplicationContext(), err, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
