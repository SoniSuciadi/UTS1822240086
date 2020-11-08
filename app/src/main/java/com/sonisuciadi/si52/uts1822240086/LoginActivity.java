package com.sonisuciadi.si52.uts1822240086;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onClickLupa(View view){
        Intent intenlupa=new Intent(LoginActivity.this,LupaActivity.class);
        startActivity(intenlupa);
    }
    public void onClickDaftar(View view){
        Intent intentdaftar=new Intent(LoginActivity.this,DaftarActivity.class);
        startActivity(intentdaftar);
    }
    public void onClickBatal(View view){
        EditText username=findViewById(R.id.etUsername);
        EditText password=findViewById(R.id.etPassword);
        username.setText("");
        password.setText("");
    }
    public void onClickLogin (View view){
        Intent login=new Intent(LoginActivity.this, MainActivity.class);
        startActivity(login);

    }
}