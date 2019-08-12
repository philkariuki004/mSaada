package com.example.msaada_v1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;


public class Guidlines extends AppCompatActivity {

    PDFView walkthrough;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidlines);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        walkthrough= findViewById(R.id.button21);

        //Load in Walk-through PDF
        walkthrough.fromAsset("MOH.pdf").
                load();
    }
}
