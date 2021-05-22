package com.mobile.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Form_Activity2 extends AppCompatActivity {

    EditText txtNom = (EditText) findViewById(R.id.txtNom);
    EditText txtEmail = (EditText) findViewById(R.id.txtEmail);
    EditText txtTel = (EditText) findViewById(R.id.txtTel);
    Button btnValider = (Button) findViewById(R.id.btnValider);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);
    }
}