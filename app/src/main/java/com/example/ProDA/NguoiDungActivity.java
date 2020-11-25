package com.example.ProDA;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class NguoiDungActivity extends AppCompatActivity {
    Button btnThemNguoiDung;

    EditText edUser, edPass,edRePass, edPhone, edFullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nguoi_dung);
        setTitle("THÊM NGƯỜI DÙNG");
        btnThemNguoiDung = (Button) findViewById(R.id.btnAddUser);
        edUser = (EditText) findViewById(R.id.edUserName);
        edPass = (EditText) findViewById(R.id.edPassword);
        edPhone = (EditText) findViewById(R.id.edPhone);
        edFullName = (EditText) findViewById(R.id.edFullname);
        edRePass = (EditText) findViewById(R.id.edRePassword);
    }

    public void showUsers(View view) {
        finish();
    }


}