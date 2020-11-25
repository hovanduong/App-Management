package com.example.ProDA;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
    EditText edUserName, edPassword;
    Button btnLogin, btnCancel;
    CheckBox chkRememberPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("ĐĂNG NHẬP");

        edUserName = (EditText) findViewById(R.id.edUserName);
        edPassword = (EditText) findViewById(R.id.edPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                   startActivity(intent);
              //  Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                String username = edUserName.getText().toString().trim();
//                String password = edPassword.getText().toString().trim();
//                if (username.equals("admin") && password.equals("123")) {
//                    //Toast.makeText(LoginActivity.this, "Đăng nhập thành công", Toast.LENGTH_LONG).show();
//                    Log.d("kiemtra","sai");
//                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                    startActivity(intent);
//                } else {
//                    Toast.makeText(LoginActivity.this, "Bạn không phải là Admin", Toast.LENGTH_LONG).show();
//                }
            }

        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

