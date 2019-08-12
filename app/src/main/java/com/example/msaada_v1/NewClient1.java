package com.example.msaada_v1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.SurfaceView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Stack;

public class NewClient1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private ClientRepository mRepo;


    public void addClientToDatabase(){

        mRepo.insertClient(
                clientProviderNameDB,
                screeningLocationDB,
                cccNumberDB,
                clientNameDB,
                knowDOBDB,
                clientDOBDB,
                age,
                clientLocationDB,
                clientSublocationDB,
                clientVillageDB,
                numberOfChildrenDB,
                numberOfChildrenUnder13DB,
                cervicalCancerScreeningDB,
                cervicalCancerScreeningYearDB,
                typeOfScreeningDB,
                cervicalCancerScreeningResultDB,
                previousTreatmentDB,
                previousTreatmentTypeDB,
                HIVTestDB,
                KnowsHIVTestDateDB,
                HIVTestDateDB,
                HIVTestResultDB,
                HIVCareDB,
                HIVTreatmentCenterDB,
                chronicMedConditionDB,
                chronicMedConditionDescriptionDB,
                interactHealthcare,
                typeOfinteraction,
                usesContraceptivesDB,
                typeOfContraceptionDB,
                pregnantDB,
                cellphoneDB,
                phone1DB,
                phone2DB,
                typeOfFollowupDB,
                languagePreference,
                directions,
                completedSurveyDB,
                qrCodeDB
                );
    }

    // Client object fields
    //Page 1
    private String clientProviderNameDB=null;
    private String screeningLocationDB =null;
    private String cccNumberDB=null;

    //Page 2
    private String clientNameDB = null;
    private String knowDOBDB=null;

    //Page 3
    private String clientDOBDB = null;

    //page 4
    private String age=null;

    //Page 5
    private String clientLocationDB = null;
    private String clientSublocationDB = null;
    private String clientVillageDB = null;

    //Page 6
    private String numberOfChildrenDB = null;
    private String numberOfChildrenUnder13DB = null;

    //Page 7
    private String cervicalCancerScreeningDB = null;

    //Page 8
    private String cervicalCancerScreeningYearDB = null;
    private String typeOfScreeningDB = null;
    private String cervicalCancerScreeningResultDB = null;

    //Page 9
    private String previousTreatmentDB = null;

    //Page 10
    private String previousTreatmentTypeDB = null;

    //Page 11
    private String HIVTestDB = null;

    //Page 12
    private String KnowsHIVTestDateDB = null;

    //Page 13
    private String HIVTestDateDB = null;

    //Page 14
    private String HIVTestResultDB = null;

    //Page 15
    private String HIVCareDB = null;

    //Page 16
    private String HIVTreatmentCenterDB = null;

    //Page 17
    private String chronicMedConditionDB = null;

    //Page 18
    private String chronicMedConditionDescriptionDB = null;

    //Page 19
    private String interactHealthcare=null;

    //Page 20
    private String typeOfinteraction = null;

    //Page 21
    private String usesContraceptivesDB = null;

    //Page 22
    private String typeOfContraceptionDB = null;

    //Page 23
    private String pregnantDB = null;

    //Page 24
    private String cellphoneDB = null;

    //Page 25
    private String phone1DB =null;
    private String phone2DB =null;
    private String typeOfFollowupDB = null;

    //Page 26
    private String languagePreference=null;

    //Page 27
    private String directions=null;


    //Page 28
    private String completedSurveyDB=null;
    private String qrCodeDB=null;
    private String testResultsDB = null;
    private String surveyStatusDB=null;


    // Setting string constants for drop down menus
    private ArrayList<String> Locations = new ArrayList<String>(Arrays.asList(" ", "Kondele", "Kolwa West", "Other"));
    private ArrayList<String> AllSublocations = new ArrayList(Arrays.asList(" ", "Manyatta A", "Nyawita", "Migosi", "Kanyakwar", "Nyalenda B", "Manyatta B", "Nyalenda A"));
    private ArrayList<String> AllVillages = new ArrayList(Arrays.asList(" ", "Russian Quarters", "Magadi", "Corner Mbaya", "Kuoyo North", "Kuoyo Central", "Kuoyo South",
            "Nyawita Market", "Quarry", "Mosque", "Tom Mboya", "K-Met", "Lolwe", "Nairobi Area", "Upper Migosi", "Lower Migosi", "Kenya Ree", "Carwash",
            "Gebo", "Obunga Central One", "Obunga Central Two", "Kasarani", "Sega Sega", "Riat", "Thim", "Holo", "Lower Bimos", "Upper Bimos", "Upper Asango", "Lower Asango", "Kamakowa",
            "Western", "Wasiko C", "Wandhare A", "Mbeya", "Kisiyui A", "Kisiyui B", "Nyangiendo", "Wasiko A", "Wandhare B", "Wasiko B",
            "Mbeme Upper Kanyakwar", "Car Wash", "Gudka", "Koyango", "Kaego", "Siany", "Gesoko Lower Kanyakwar", "Baraka", "Magadi Centre", "Gonda", "Auji", "Kondele", "Flamingo", "Meta Meta", "Corner Mbuta",
            "Dago", "Kanyakwar", "Mbeya ", "Kachok", "Central", "Western ", "Wandare A", "Kisuyui A", "Wandare B", "Kisuyui B", "Nyangiendo", "Other"));
    private ArrayList<String> KondeleSublocations = new ArrayList<String>(Arrays.asList("Manyatta A", "Nyawita", "Migosi", "Kanyakwar", "Other"));
    private ArrayList<String> KolwaWestSublocations = new ArrayList<String>(Arrays.asList("Nyalenda B", "Manyatta B", "Nyalenda A"));
    private ArrayList<String> ManyataAVillages = new ArrayList<String>(Arrays.asList("Russian Quarters", "Magadi", "Corner Mbaya", "Kuoyo North", "Kuoyo Central", "Kuoyo South"));
    private ArrayList<String> NyawitaVillages = new ArrayList<String>(Arrays.asList("Nyawita Market", "Quarry", "Mosque", "Tom Mboya", "K-Met"));
    private ArrayList<String> MigosiVillages = new ArrayList<String>(Arrays.asList("Lolwe", "Nairobi Area", "Upper Migosi", "Lower Migosi", "Kenya Ree", "Carwash"));
    private ArrayList<String> KanyakwarVillages = new ArrayList<String>(Arrays.asList("Gebo", "Obunga Central One", "Obunga Central Two", "Kasarani", "Sega Sega", "Riat", "Thim", "Holo", "Lower Bimos", "Upper Bimos", "Upper Asango", "Lower Asango", "Kamakowa"));
    private ArrayList<String> NyalendaBVillages = new ArrayList<String>(Arrays.asList("Western", "Wasiko C", "Wandhare A", "Mbeya", "Kisiyui A", "Kisiyui B", "Nyangiendo", "Wasiko A", "Wandhare B", "Wasiko B"));
    private ArrayList<String> ManyattaBVillages = new ArrayList<String>(Arrays.asList("Mbeme Upper Kanyakwar", "Car Wash", "Gudka", "Koyango", "Kaego", "Siany", "Gesoko Lower Kanyakwar", "Baraka", "Magadi Centre", "Gonda", "Auji", "Kondele", "Flamingo", "Meta Meta", "Corner Mbuta"));
    private ArrayList<String> NyalendaAVillages = new ArrayList<String>(Arrays.asList("Dago", "Kanyakwar", "Mbeya ", "Kachok", "Central", "Western ", "Wandare A", "Kisuyui A", "Wandare B", "Kisuyui B", "Nyangiendo "));

    Spinner patientLocation, patientVillage, patientSubLocation;
    ArrayAdapter<String> dataAdapter2, dataAdapter3;

    // Set the page number to 0
    int page_track = 0;
    int previousPage = 0;


    Stack<Integer> visitedPages = new Stack<>();

    private ArrayAdapter<String> dataAdapter1;
    private ArrayAdapter<String> tempSublocationAdapter;
    private ArrayAdapter<String> tempLocationAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRepo=new ClientRepository(getApplication());

        setContentView(R.layout.activity_new_client1);
        //

    }


    public void onClickNext(View view) {

        if(page_track == 0){

            visitedPages.push(0);

            //Get Values for page 1
            Spinner provider_Name= findViewById(R.id.provider);
            Spinner screening_Location =findViewById(R.id.screening_location);
            EditText ccNo =findViewById(R.id.editTextcc);

            //Come back and Make Sure that they are not empty

            if (provider_Name.getSelectedItem().toString().equals("")){

                Toast.makeText(this, "Select the provider Name please", Toast.LENGTH_SHORT).show();
                page_track = 0;
                return;
            }

            if(screening_Location.getSelectedItem().toString().equals("")){

                Toast.makeText(this, "Select the Screening Location Please", Toast.LENGTH_SHORT).show();
                page_track = 0;
                return;
            }


            //To Be saved to database.
            clientProviderNameDB=provider_Name.getSelectedItem().toString();
            screeningLocationDB=screening_Location.toString();
            cccNumberDB=ccNo.toString();


            page_track = 1;

            setContentView(R.layout.activity_new_client2);

        }

        else if(page_track==1){

            visitedPages.push(1);

            //Get Values for page 2
            EditText name=findViewById(R.id.editTextname);
            RadioButton yesButton =findViewById(R.id.radio_yesbirth);
            RadioButton noButton =findViewById(R.id.radio_nobirth);

            //Come Back and Make sure They aren't empty.
            if(name.getText().toString().matches("")){

                Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show();
                page_track = 1;
                return;

            }


            if(!yesButton.isChecked() && noButton.isChecked()){
                Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show();
                page_track = 1;
                return;

            }

            //SetDBManenoz
            clientNameDB=name.toString();
            if (yesButton.isChecked()){

                knowDOBDB="yes";
            }else if(noButton.isChecked()){
                knowDOBDB ="no";

            }


            page_track = 2;

            setContentView(R.layout.activity_new_client3);


        }

        else if(page_track==2){
            visitedPages.push(2);

            page_track = 3;

            setContentView(R.layout.activity_new_client4);

        }

        else if(page_track==3){
            visitedPages.push(3);

            page_track = 4;

            setContentView(R.layout.activity_new_client5);

            selectingLocation();


        }


        else if(page_track==4){
            visitedPages.push(4);

            page_track = 5;


            setContentView(R.layout.activity_new_client6);

        }
        else if(page_track==5){

            visitedPages.push(5);

            page_track = 6;


            setContentView(R.layout.activity_new_client7);

        }
        else if(page_track==6){
            RadioButton yesButton = findViewById(R.id.radio_1);
            RadioButton noButton = findViewById(R.id.radio_2);
            RadioButton otherButton = findViewById(R.id.radio_3);

            //Force user to select one button before continuing
            if (!yesButton.isChecked()){
                if (!noButton.isChecked() && (!otherButton.isChecked())){
                    Toast.makeText(this, "Please select an answer before continuing", Toast.LENGTH_SHORT).show();
                    page_track = 6;
                    return;
                }
            }

            if(noButton.isChecked()){


            }else if(yesButton.isChecked()){


            }

            visitedPages.push(6);

            page_track = 7;

            setContentView(R.layout.activity_new_client8);

        }
        else if(page_track==7){


            visitedPages.push(7);

            page_track = 8;

            setContentView(R.layout.activity_new_client9);
        }

        else if(page_track==8){

            visitedPages.push(8);

            page_track = 9;

            setContentView(R.layout.activity_new_client10);
        }

        else if(page_track==9){

            visitedPages.push(9);

            page_track = 10;

            setContentView(R.layout.activity_new_client11);

        }

        else if(page_track==10){

            visitedPages.push(10);

            page_track = 11;


            setContentView(R.layout.activity_new_client12);

        }

        else if(page_track==11){

            visitedPages.push(11);

            page_track = 12;

            setContentView(R.layout.activity_new_client13);

        }

        else if(page_track==12){

            visitedPages.push(12);

            page_track = 13;

            setContentView(R.layout.activity_new_client14);
        }
        else if(page_track==13){

            visitedPages.push(13);

            page_track = 14;

            setContentView(R.layout.activity_new_client15);
        }

        else if(page_track==14){

            visitedPages.push(14);

            page_track = 15;


            setContentView(R.layout.activity_new_client16);
        }

        else if(page_track==15){

            visitedPages.push(15);

            page_track = 16;

            setContentView(R.layout.activity_new_client17);

        }

        else if(page_track==16){

            visitedPages.push(16);

            page_track = 17;

            setContentView(R.layout.activity_new_client18);
        }

        else if(page_track==17){


            visitedPages.push(17);

            page_track = 18;

            setContentView(R.layout.activity_new_client19);

        }

        else if(page_track==18){

            visitedPages.push(18);

            page_track = 19;

            setContentView(R.layout.activity_new_client20);
        }

        else if(page_track==19){

            visitedPages.push(19);

            page_track = 20;
            setContentView(R.layout.activity_new_client21);

        }


        else if(page_track==20){

            visitedPages.push(20);
            page_track = 21;


            setContentView(R.layout.activity_new_client22);
        }

        else if(page_track==21){
            visitedPages.push(21);
            page_track = 22;

            setContentView(R.layout.activity_new_client23);

        }

        else if(page_track==22){
            visitedPages.push(22);
            page_track = 23;

            setContentView(R.layout.activity_new_client24);
        }

        else if(page_track==23){
            visitedPages.push(23);
            page_track = 24;

            setContentView(R.layout.activity_new_client25);
        }

        else if(page_track==24){
            visitedPages.push(24);
            page_track = 25;

            setContentView(R.layout.activity_new_client26);
        }

        else if(page_track==25){
            visitedPages.push(25);
            page_track = 26;

            setContentView(R.layout.activity_new_client27);

        }

        else if(page_track==26){
            visitedPages.push(26);
            page_track = 27;

            setContentView(R.layout.activity_new_client28);
        }


    }

    public void onClickBack(View view) {

        if (visitedPages.isEmpty()){
            Intent mainIntent = new Intent(this, MainActivity.class);
            startActivity(mainIntent);
        }else{
            previousPage = visitedPages.pop();

        }


        if(previousPage == 0){

            page_track = 0;
            setContentView(R.layout.activity_new_client1);

            //Get Values for page 1
            Spinner provider_Name= findViewById(R.id.provider);
            Spinner screening_Location =findViewById(R.id.screening_location);
            EditText ccNo =findViewById(R.id.editTextcc);

            //Data persistence?



        }

        else if(previousPage == 1){

            page_track = 1;
            setContentView(R.layout.activity_new_client2);

        }else if(previousPage == 2){
            page_track = 2;
            setContentView(R.layout.activity_new_client3);
        }else if(previousPage == 3){
            page_track = 3;
            setContentView(R.layout.activity_new_client4);
        }else if(previousPage == 4){
            page_track = 4;
            setContentView(R.layout.activity_new_client5);
            selectingLocation();
        }else if(previousPage == 5){
            page_track = 5;
            setContentView(R.layout.activity_new_client6);
        }else if(previousPage == 6){
            page_track = 6;
            setContentView(R.layout.activity_new_client7);
        }else if(previousPage == 7){
            page_track = 7;
            setContentView(R.layout.activity_new_client8);
        }else if(previousPage == 8){
            page_track = 8;
            setContentView(R.layout.activity_new_client9);
        }else if(previousPage == 9){
            page_track = 9;
            setContentView(R.layout.activity_new_client10);
        }else if(previousPage == 10){
            page_track = 10;
            setContentView(R.layout.activity_new_client11);
        }else if(previousPage == 11){
            page_track = 11;
            setContentView(R.layout.activity_new_client12);
        }else if(previousPage == 12){
            page_track = 12;
            setContentView(R.layout.activity_new_client13);
        }else if(previousPage == 13){
            page_track = 13;
            setContentView(R.layout.activity_new_client14);
        }else if(previousPage == 14){
            page_track = 14;
            setContentView(R.layout.activity_new_client15);
        }else if(previousPage == 15){
            page_track = 15;
            setContentView(R.layout.activity_new_client16);
        }else if(previousPage == 16){
            page_track = 16;
            setContentView(R.layout.activity_new_client17);
        }else if(previousPage == 17){
            page_track = 17;
            setContentView(R.layout.activity_new_client18);
        }else if(previousPage == 18){
            page_track = 18;
            setContentView(R.layout.activity_new_client19);
        }else if(previousPage == 19){
            page_track = 19;
            setContentView(R.layout.activity_new_client21);
        }
        else if(previousPage == 20){
            page_track = 20;
            setContentView(R.layout.activity_new_client22);
        }

        else if(previousPage == 21){
            page_track = 21;
            setContentView(R.layout.activity_new_client23);
        }

        else if(previousPage == 22){
            page_track = 22;
            setContentView(R.layout.activity_new_client24);
        }

        else if(previousPage == 23){
            page_track = 23;
            setContentView(R.layout.activity_new_client25);
        }

        else if(previousPage == 24){
            page_track = 24;
            setContentView(R.layout.activity_new_client26);
        }

        else if(previousPage == 25){
            page_track = 25;
            setContentView(R.layout.activity_new_client27);
        }
        else if(previousPage == 26){
            page_track = 26;
            setContentView(R.layout.activity_new_client28);
        }



    }



    private void setadapter2(int a) { //NEED TO REARRANGE UI
        switch (a) {
            case 0:

                dataAdapter3 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, Locations); //Manyata A
                dataAdapter2 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, KondeleSublocations);
                dataAdapter2.setDropDownViewResource(R.layout.spinner_item);
                dataAdapter3.setDropDownViewResource(R.layout.spinner_item);
                patientSubLocation.setAdapter(dataAdapter2);
                patientLocation.setAdapter(dataAdapter3);
                patientSubLocation.setSelection(0);
                patientLocation.setSelection(1);
                break;
            case 1:
                dataAdapter3 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, Locations); //Nyawita
                dataAdapter2 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, KondeleSublocations);
                dataAdapter2.setDropDownViewResource(R.layout.spinner_item);
                dataAdapter3.setDropDownViewResource(R.layout.spinner_item);
                patientSubLocation.setAdapter(dataAdapter2);
                patientLocation.setAdapter(dataAdapter3);
                patientSubLocation.setSelection(1);
                patientLocation.setSelection(1);
                break;
            case 2:
                dataAdapter3 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, Locations); //Misogi
                dataAdapter2 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, KondeleSublocations);
                dataAdapter2.setDropDownViewResource(R.layout.spinner_item);
                dataAdapter3.setDropDownViewResource(R.layout.spinner_item);
                patientSubLocation.setAdapter(dataAdapter2);
                patientLocation.setAdapter(dataAdapter3);
                patientSubLocation.setSelection(2);
                patientLocation.setSelection(1);
                break;
            case 3:
                dataAdapter3 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, Locations); //Nyalenda B
                dataAdapter2 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, KolwaWestSublocations);
                dataAdapter2.setDropDownViewResource(R.layout.spinner_item);
                dataAdapter3.setDropDownViewResource(R.layout.spinner_item);
                patientSubLocation.setAdapter(dataAdapter2);
                patientLocation.setAdapter(dataAdapter3);
                patientSubLocation.setSelection(0);
                patientLocation.setSelection(2);
                break;
            case 4:
                dataAdapter3 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, Locations); //Manyatta B
                dataAdapter2 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, KolwaWestSublocations);
                dataAdapter2.setDropDownViewResource(R.layout.spinner_item);
                dataAdapter3.setDropDownViewResource(R.layout.spinner_item);
                patientSubLocation.setAdapter(dataAdapter2);
                patientLocation.setAdapter(dataAdapter3);
                patientSubLocation.setSelection(1);
                patientLocation.setSelection(2);
                break;
            case 5:
                dataAdapter3 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, Locations); //Nyalenda A
                dataAdapter2 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, KolwaWestSublocations);
                dataAdapter2.setDropDownViewResource(R.layout.spinner_item);
                dataAdapter3.setDropDownViewResource(R.layout.spinner_item);
                patientSubLocation.setAdapter(dataAdapter2);
                patientLocation.setAdapter(dataAdapter3);
                patientSubLocation.setSelection(2);
                patientLocation.setSelection(2);
                break;
            case 6:
                dataAdapter3 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, Locations); //Kanyakwar
                dataAdapter2 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, KondeleSublocations);
                dataAdapter2.setDropDownViewResource(R.layout.spinner_item);
                dataAdapter3.setDropDownViewResource(R.layout.spinner_item);
                patientSubLocation.setAdapter(dataAdapter2);
                patientSubLocation.setSelection(3);
                patientLocation.setSelection(1);
                break;
            case 7:
                dataAdapter3 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, Locations); //Other
                dataAdapter2 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, KondeleSublocations);
                dataAdapter2.setDropDownViewResource(R.layout.spinner_item);
                dataAdapter3.setDropDownViewResource(R.layout.spinner_item);
                patientSubLocation.setAdapter(dataAdapter2);
                patientSubLocation.setSelection(4);
                patientLocation.setSelection(3);
                break;
        }
    }


    private void selectingLocation(){

        // Associate survey answers to spinner answers

        patientLocation = findViewById(R.id.location_spinner);
        patientSubLocation = findViewById(R.id.sublocation_spinner);
        patientVillage = findViewById(R.id.village_spinner);

        dataAdapter1 = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, AllVillages);
        dataAdapter1.setDropDownViewResource(R.layout.spinner_item);

        tempSublocationAdapter = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, AllSublocations);
        tempSublocationAdapter.setDropDownViewResource(R.layout.spinner_item);

        tempLocationAdapter = new ArrayAdapter<String>(getApplication(), R.layout.spinner_item, Locations);
        tempLocationAdapter.setDropDownViewResource(R.layout.spinner_item);

        patientLocation.setAdapter(tempLocationAdapter);
        patientLocation.setEnabled(false);
        patientSubLocation.setAdapter(tempSublocationAdapter);
        patientSubLocation.setEnabled(false);
        patientVillage.setAdapter(dataAdapter1);
        patientVillage.setOnItemSelectedListener(this);
        //patientVillage.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);


    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // The Location item selected determines which options the user will be served for the Sublocation spinner
        String selectedItem = parent.getItemAtPosition(position).toString();
        System.out.println(selectedItem);
        switch (selectedItem) {
            case "Russian Quarters":
                setadapter2(0);
                break;
            case "Magadi":
                setadapter2(0);
                break;
            case "Corner Mbaya":
                setadapter2(0);
                break;
            case "Kuoyo North":
                setadapter2(0);
                break;
            case "Kuoyo Central":
                setadapter2(0);
                break;
            case "Kuoyo South":
                setadapter2(0);
                break;

            case "Nyawita Market":
                setadapter2(1);
                break;
            case "Quarry":
                setadapter2(1);
                break;
            case "Mosque":
                setadapter2(1);
                break;
            case "Tom Mboya":
                setadapter2(1);
                break;
            case "K-Met":
                setadapter2(1);
                break;

            case "Lolwe":
                setadapter2(2);
                break;
            case "Nairobi Area":
                setadapter2(2);
                break;
            case "Upper Migosi":
                setadapter2(2);
                break;
            case "Lower Migosi":
                setadapter2(2);
                break;
            case "Kenya Ree":
                setadapter2(2);
                break;
            case "Carwash":
                setadapter2(2);
                break;

            case "Gebo":
                setadapter2(6);
                break;
            case "Obunga Central One":
                setadapter2(6);
                break;
            case "Obunga Central Two":
                setadapter2(6);
                break;
            case "Kasarani":
                setadapter2(6);
                break;
            case "Sega Sega":
                setadapter2(6);
                break;
            case "Riat":
                setadapter2(6);
                break;
            case "Thim":
                setadapter2(6);
                break;
            case "Holo":
                setadapter2(6);
                break;
            case "Lower Bimos":
                setadapter2(6);
                break;
            case "Upper Bimos":
                setadapter2(6);
                break;
            case "Upper Asango":
                setadapter2(6);
                break;
            case "Lower Asango":
                setadapter2(6);
                break;
            case "Kamakowa":
                setadapter2(6);
                break;

            case "Western":
                setadapter2(3);
                break;
            case "Wasiko C":
                setadapter2(3);
                break;
            case "Wandhare A":
                setadapter2(3);
                break;
            case "Mbeya":
                setadapter2(3);
                break;
            case  "Kisiyui A":
                setadapter2(3);
                break;
            case "Kisiyui B":
                setadapter2(3);
                break;
            case "Nyangiendo":
                setadapter2(3);
                break;
            case "Wasiko A":
                setadapter2(3);
                break;
            case "Wandhare B":
                setadapter2(3);
                break;
            case "Wasiko B":
                setadapter2(3);
                break;

            case "Mbeme Upper Kanyakwar":
                setadapter2(4);
                break;
            case "Car Wash":
                setadapter2(4);
                break;
            case "Gudka":
                setadapter2(4);
                break;
            case "Koyango":
                setadapter2(4);
                break;
            case "Kaego":
                setadapter2(4);
                break;
            case "Siany":
                setadapter2(4);
                break;
            case "Gesoko Lower Kanyakwar":
                setadapter2(4);
                break;
            case "Baraka":
                setadapter2(4);
                break;
            case "Magadi Centre":
                setadapter2(4);
                break;
            case "Gonda":
                setadapter2(4);
                break;
            case "Auji":
                setadapter2(4);
                break;
            case "Kondele":
                setadapter2(4);
                break;
            case "Flamingo":
                setadapter2(4);
                break;
            case "Meta Meta":
                setadapter2(4);
                break;
            case "Corner Mbuta":
                setadapter2(4);
                break;

            case "Dago":
                setadapter2(5);
                break;
            case "Kanyakwar":
                setadapter2(5);
                break;
            case  "Kachok":
                setadapter2(5);
                break;
            case  "Mbeya ":
                setadapter2(5);
                break;
            case "Central":
                setadapter2(5);
                break;
            case  "Western ":
                setadapter2(5);
                break;
            case "Wandare A":
                setadapter2(5);
                break;
            case "Kisuyui A":
                setadapter2(5);
                break;
            case "Wandare B":
                setadapter2(5);
                break;
            case "Kisuyui B":
                setadapter2(5);
                break;
            case  "Nyangiendo ":
                setadapter2(5);
                break;
            case "Other":
                setadapter2(7);
                break;

        }
    }



    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public void onClickScanCode(View view) {
    }

    public void onClickSubmit(View view) {

        Intent gohome =new Intent(this,MainActivity.class);
        startActivity(gohome);

    }

    public void onClickNew(View view) {


    }

    public void onClickHome(View view) {
    }
}
