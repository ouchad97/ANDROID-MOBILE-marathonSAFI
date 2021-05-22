package com.mobile.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Form_Activity2 extends AppCompatActivity {

    private EditText txtNom;
    private EditText txtEmail;
    private EditText txtTel;
    private Button btnValider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);

        txtNom = (EditText) findViewById(R.id.txtNom);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtTel = (EditText) findViewById(R.id.txtTel);
        btnValider = (Button) findViewById(R.id.btnValider);
    }
}