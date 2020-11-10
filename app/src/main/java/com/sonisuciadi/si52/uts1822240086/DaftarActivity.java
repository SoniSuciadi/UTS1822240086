package com.sonisuciadi.si52.uts1822240086;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DaftarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
    }
    public void onClickSimpan(View view){
        Intent intentSimpan= new Intent(DaftarActivity.this,LoginActivity.class);
        startActivity(intentSimpan);
    }
    public void onClickBackDaftar(View view){
        Intent intentBack= new Intent(DaftarActivity.this,LoginActivity.class);
        startActivity(intentBack);
    }
}