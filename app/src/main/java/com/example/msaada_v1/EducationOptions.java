package com.example.msaada_v1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EducationOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_options);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }



    public void onClickScreening(View view){

        Intent guide = new Intent(this, Guidlines.class);
        startActivity(guide);


    }

    public void onClickEducation(View view){
        Intent edu = new Intent(this, LanguageOptions.class);
        startActivity(edu);



    }

    public void onClickHome(View view){

        Intent gohome =new Intent(this,MainActivity.class);
        startActivity(gohome);

    }

}
