package com.example.msaada_v1;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Walkthrough extends AppCompatActivity {

    PDFView walkthrough;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            String value = extras.getString("key");
            if (value.equals("en")) {

                setContentView(R.layout.activity_walkthrough);


                walkthrough = findViewById(R.id.button_pdf);

                //Load in Walk-through PDF
                walkthrough.fromAsset("English_EDU.pdf").
                        load();


            }
            else if(value.equals("sw")){
                setContentView(R.layout.activity_walkthrough);


                walkthrough = findViewById(R.id.button_pdf);

                //Load in Walk-through PDF
                walkthrough.fromAsset("Kiswahili_EDU.pdf").
                        load();


            }else if(value.equals("luo")){
                setContentView(R.layout.activity_walkthrough);


                walkthrough = findViewById(R.id.button_pdf);

                //Load in Walk-through PDF
                walkthrough.fromAsset("Luo_EDU.pdf").
                        load();

            }



        }

    }
}
