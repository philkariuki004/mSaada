package com.example.msaada_v1;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;


import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void onClickScreening(View view){

        Intent edoptions = new Intent(this,EducationOptions.class);

        startActivity(edoptions);
    }




    public void OnClickAddClient(View view) {
        Intent edoptions = new Intent(this,NewClient1.class);

        startActivity(edoptions);


    }

    public void onClickFAQS(View view) {
        Intent faq = new Intent(this,FAQActivity.class);

        startActivity(faq);

    }

}
