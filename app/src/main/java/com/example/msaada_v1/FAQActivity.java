package com.example.msaada_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Context;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.content.res.Resources;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import android.app.Activity;
import android.widget.EditText;
import android.content.Intent;
import java.util.HashMap;
import android.app.SearchManager;
import android.widget.SearchView;

public class FAQActivity extends Activity implements SearchView.OnQueryTextListener, SearchView.OnCloseListener{

    private ExpandableListView expandableListView;
    private SecondLevelAdapter expandableListAdapter;
    private SearchView search;
    private List<String> expandableListDataHeader;
    private HashMap<String, List<String>> expandableListHash;
    private String numView ="";


    //creating question and answer arrays for expandablelistview
    String[] parent = new String[]{"Causes of HPV Infection and cervical cancer", "Impacts", "Transmission", "Screening",
            "Treatment", "HPV Vaccination", "Men", "HIV-Related", "Other-General" };
    String[] faqs_group_1;
    String[] faqs_group_2;
    String[] faqs_group_3;
    String[] faqs_group_4;
    String[] faqs_group_5;
    String[] faqs_group_6;
    String[] faqs_group_7;
    String[] faqs_group_8;
    String[] faqs_group_9;
    String[] faqs_group_10;
    String[] faqs_group_11;
    String[] answers_group_1;
    String[] answers_group_2;
    String[] answers_group_3;
    String[] answers_group_4;
    String[] answers_group_5;
    String[] answers_group_6;
    String[] answers_group_7;
    String[] answers_group_8;
    String[] answers_group_9;
    String[] answers_group_10;
    String[] answers_group_11;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq_root);
        numView = "root";

        //pulling from resources to fill question and answer arrays
        Resources res = getResources();
        faqs_group_1 = res.getStringArray(R.array.faqs1);
        faqs_group_2 = res.getStringArray(R.array.faqs2);
        faqs_group_3 = res.getStringArray(R.array.faqs3);
        faqs_group_4 = res.getStringArray(R.array.faqs4);
        faqs_group_5 = res.getStringArray(R.array.faqs5);
        faqs_group_6 = res.getStringArray(R.array.faqs6);
        faqs_group_7 = res.getStringArray(R.array.faqs7);
        faqs_group_8 = res.getStringArray(R.array.faqs8);
        faqs_group_9 = res.getStringArray(R.array.faqs9);
        faqs_group_10 = res.getStringArray(R.array.faqs10);
        faqs_group_11 = res.getStringArray(R.array.faqs11);
        answers_group_1 = res.getStringArray(R.array.answers1);
        answers_group_2 = res.getStringArray(R.array.answers2);
        answers_group_3 = res.getStringArray(R.array.answers3);
        answers_group_4 = res.getStringArray(R.array.answers4);
        answers_group_5 = res.getStringArray(R.array.answers5);
        answers_group_6 = res.getStringArray(R.array.answers6);
        answers_group_7 = res.getStringArray(R.array.answers7);
        answers_group_8 = res.getStringArray(R.array.answers8);
        answers_group_9 = res.getStringArray(R.array.answers9);
        answers_group_10 = res.getStringArray(R.array.answers10);
        answers_group_11 = res.getStringArray(R.array.answers11);
    }

    public boolean onClose(){
        expandableListAdapter.filterData("");
        return false;
    }

    @Override //when typing in search bar, call filterdata in SecondLevelAdapter
    public boolean onQueryTextChange(String newText){
        expandableListAdapter.filterData(newText);
        return false;
    }

    @Override //when press enter in search bar, call filterdata in SecondLevelAdapter
    public boolean onQueryTextSubmit(String query){
        expandableListAdapter.filterData(query);
        return false;
    }

    public void initData(){ //create expandablelistview for each questions category page based on which button is clicked
        expandableListDataHeader = new ArrayList<>();
        expandableListHash = new HashMap<>();
        List<String> temp = new ArrayList<>();

        if(numView == "0"){
            for(int i = 0; i < faqs_group_1.length; i++){
                expandableListDataHeader.add(faqs_group_1[i]);
            }
            for(int i = 0; i < answers_group_1.length; i++){
                temp.add(answers_group_1[i]);
            }
        } else if(numView == "1"){
            for(int i = 0; i < faqs_group_2.length; i++){
                expandableListDataHeader.add(faqs_group_2[i]);
            }
            for(int i = 0; i < answers_group_2.length; i++){
                temp.add(answers_group_2[i]);
            }
        } else if(numView == "2"){
            for(int i = 0; i < faqs_group_3.length; i++){
                expandableListDataHeader.add(faqs_group_3[i]);
            }
            for(int i = 0; i < answers_group_3.length; i++){
                temp.add(answers_group_3[i]);
            }
        } else if(numView == "3"){
            for(int i = 0; i < faqs_group_4.length; i++){
                expandableListDataHeader.add(faqs_group_4[i]);
            }
            for(int i = 0; i < answers_group_4.length; i++){
                temp.add(answers_group_4[i]);
            }
        } else if(numView == "4"){
            for(int i = 0; i < faqs_group_5.length; i++){
                expandableListDataHeader.add(faqs_group_5[i]);
            }
            for(int i = 0; i < answers_group_5.length; i++){
                temp.add(answers_group_5[i]);
            }
        } else if(numView == "5"){
            for(int i = 0; i < faqs_group_6.length; i++){
                expandableListDataHeader.add(faqs_group_6[i]);
            }
            for(int i = 0; i < answers_group_6.length; i++){
                temp.add(answers_group_6[i]);
            }
        } else if(numView == "6"){
            for(int i = 0; i < faqs_group_7.length; i++){
                expandableListDataHeader.add(faqs_group_7[i]);
            }
            for(int i = 0; i < answers_group_7.length; i++){
                temp.add(answers_group_7[i]);
            }
        } else if(numView == "7"){
            for(int i = 0; i < faqs_group_8.length; i++){
                expandableListDataHeader.add(faqs_group_8[i]);
            }
            for(int i = 0; i < answers_group_8.length; i++){
                temp.add(answers_group_8[i]);
            }
        } else if(numView == "8"){
            for(int i = 0; i < faqs_group_9.length; i++){
                expandableListDataHeader.add(faqs_group_9[i]);
            }
            for(int i = 0; i < answers_group_9.length; i++){
                temp.add(answers_group_9[i]);
            }
        } else if(numView == "9"){
            for(int i = 0; i < faqs_group_10.length; i++){
                expandableListDataHeader.add(faqs_group_10[i]);
            }
            for(int i = 0; i < answers_group_10.length; i++){
                temp.add(answers_group_10[i]);
            }
        } else if(numView == "10"){
            for(int i = 0; i < faqs_group_11.length; i++){
                expandableListDataHeader.add(faqs_group_11[i]);
            }
            for(int i = 0; i < answers_group_11.length; i++){
                temp.add(answers_group_11[i]);
            }
        }

        for(int i = 0; i < expandableListDataHeader.size(); i++){
            expandableListHash.put(expandableListDataHeader.get(i), Collections.singletonList(temp.get(i)));
        }
    }

    public void afterOnClick(){ //init search bar, so that user can search through the questions
        initData();

        //init adapter using SecondLevelAdapter
        expandableListAdapter = new SecondLevelAdapter(this, expandableListDataHeader, expandableListDataHeader, expandableListHash);

        SearchManager searchManager = (SearchManager) this.getSystemService(Context.SEARCH_SERVICE);

        if(numView == "0"){
            search = (SearchView) findViewById(R.id.inputSearch1);
            expandableListView = findViewById(R.id.expandableListView1);
        } else if(numView == "1") {
            search = (SearchView) findViewById(R.id.inputSearch2);
            expandableListView = findViewById(R.id.expandableListView2);
        } else if(numView == "2"){
            search = (SearchView) findViewById(R.id.inputSearch3);
            expandableListView = findViewById(R.id.expandableListView3);
        } else if(numView == "3") {
            search = (SearchView) findViewById(R.id.inputSearch4);
            expandableListView = findViewById(R.id.expandableListView4);
        } else if(numView == "4"){
            search = (SearchView) findViewById(R.id.inputSearch5);
            expandableListView = findViewById(R.id.expandableListView5);
        } else if(numView == "5"){
            search = (SearchView) findViewById(R.id.inputSearch6);
            expandableListView = findViewById(R.id.expandableListView6);
        } else if(numView == "6"){
            search = (SearchView) findViewById(R.id.inputSearch7);
            expandableListView = findViewById(R.id.expandableListView7);
        } else if(numView == "7"){
            search = (SearchView) findViewById(R.id.inputSearch8);
            expandableListView = findViewById(R.id.expandableListView8);
        } else if(numView == "8"){
            search = (SearchView) findViewById(R.id.inputSearch9);
            expandableListView = findViewById(R.id.expandableListView9);
        } else if(numView == "9"){
            search = (SearchView) findViewById(R.id.inputSearch10);
            expandableListView = findViewById(R.id.expandableListView10);
        } else if(numView == "10"){
            search = (SearchView) findViewById(R.id.inputSearch11);
            expandableListView = findViewById(R.id.expandableListView11);
        }

        search.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        search.setIconifiedByDefault(false);
        search.setOnQueryTextListener(this);
        search.setOnCloseListener(this);

        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousGroup = -1;

            //keep track of which question is expanded and when click on another question, close the current question
            @Override
            public void onGroupExpand(int groupPosition) {
                if(groupPosition != previousGroup){
                    expandableListView.collapseGroup(previousGroup);
                }
                previousGroup = groupPosition;
            }
        });

    }

    //on click triggers for each question sub-category button
    public void onClickCauses(View view){
        setContentView(R.layout.activity_faq);
        numView = "0";
        afterOnClick();
    }

    public void onClickSymptoms(View view){
        setContentView(R.layout.activity_faq1);
        numView = "1";
        afterOnClick();
    }

    public void onClickTransmission(View view){
        setContentView(R.layout.activity_faq3);
        numView = "3";
        afterOnClick();
    }

    public void onClickScreening(View view){
        setContentView(R.layout.activity_faq4);
        numView = "4";
        afterOnClick();
    }

    public void onClickTreatment(View view){
        setContentView(R.layout.activity_faq5);
        numView = "5";
        afterOnClick();
    }

    public void onClickVaccination(View view){
        setContentView(R.layout.activity_faq6);
        numView = "6";
        afterOnClick();
    }

    public void onClickMen(View view){
        setContentView(R.layout.activity_faq7);
        numView = "7";
        afterOnClick();
    }

    public void onClickHIV(View view){
        setContentView(R.layout.activity_faq8);
        numView = "8";
        afterOnClick();
    }

    public void onClickOther(View view){
        setContentView(R.layout.activity_faq9);
        numView = "9";
        afterOnClick();
    }
    public void onClickAll(View view){
        setContentView(R.layout.activity_faq10);
        numView = "10";
        afterOnClick();
    }

    //take back to main questions page
    public void onClickBack(View view){
        setContentView(R.layout.activity_faq_root);
    }

    //take back to home screen
    public void onClickHome(View view){
        Intent backIntent = new Intent(this, MainActivity.class);
        startActivity(backIntent);
    }
}