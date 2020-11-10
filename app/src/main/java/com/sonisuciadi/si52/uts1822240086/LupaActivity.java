package com.sonisuciadi.si52.uts1822240086;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LupaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa);
        ImageView ivCp=findViewById(R.id.iccp);
        ivCp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri="08117858100";
                Intent intentDial=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+uri));
                startActivity(intentDial);
            }
        });
        ImageView ivEmail=findViewById(R.id.icemail);
        ivEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri="SonySuciadi@gmail.com";
                Intent intentEmail = new Intent(Intent.ACTION_MAIN);
                intentEmail.addCategory(Intent.CATEGORY_APP_EMAIL);
                startActivity(intentEmail);
                startActivity(Intent.createChooser(intentEmail, uri));


            }
        });

    }
    public void onClickBackLupa(View view){
        Intent intentLupa= new Intent(LupaActivity.this,LoginActivity.class);
        startActivity(intentLupa);
    }

}