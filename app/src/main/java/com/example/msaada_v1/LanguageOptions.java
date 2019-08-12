package com.example.msaada_v1;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;

import android.view.View;

public class LanguageOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_options);

    }

    public void onClickEnglish(View view) {
       Intent walk_en =new Intent(this,Walkthrough.class);
       walk_en.putExtra("key","en");
       startActivity(walk_en);

    }

    public void OnClickSwahili(View view) {
        Intent walk_sw =new Intent(this,Walkthrough.class);
        walk_sw.putExtra("key","sw");
        startActivity(walk_sw);


    }
    public void OnClickLuo(View view) {

        Intent walk_luo =new Intent(this,Walkthrough.class);
        walk_luo.putExtra("key","luo");
        startActivity(walk_luo);




    }
    public void OnClickDone(View view) {


        Intent gohome =new Intent(this,MainActivity.class);
        startActivity(gohome);

    }


}
