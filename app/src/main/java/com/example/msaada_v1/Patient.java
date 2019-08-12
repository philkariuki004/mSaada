package com.example.msaada_v1;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

//Patient Class to be saved in the Firebase Database

public class Patient implements Serializable {


    public String providerName;
    public String screeningLocation;
    public String cccNumber;
    public String patientName;
    public Integer patientAge;
    public String patientDOB = null;
    public String patientLocation;
    public String patientSublocation;
    public String patientVillage;
    public Integer numberOfChildren;
    public Integer numberOfChildrenUnder13;
    public String cervicalCancerScreening;
    public String cervicalCancerScreeningYear;
    public ArrayList<String> typeOfScreening;
    public String cervicalCancerScreeningResult;
    public String previousTreatment;
    public String previousTreatmentType;
    public String HIVTest;
    public String knowsHIVTestDate;
    public String HIVTestDate;
    public String HIVTestResult;
    public String HIVCare;
    public String HIVTreatmentCenter;
    public String chronicMedCondition;
    public ArrayList<String> chronicMedConditionDescription;
    public String usesContraceptives;
    public ArrayList<String> typeOfContraception;
    public String pregnant;
    public String lastUpdated = null;
    public String cellphone;
    public String phone1;
    public String phone2;
    public ArrayList<String> typeOfFollowup;
    public String completedSurvey = null;
    public String qrCode;
    public String testResults;
    public String surveyStatus;

    public Patient() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    //Create a Patient object
    public Patient(String providerName, String screeningLocation,String cccNumber,String patientName, String patientDOB, String patientLocation, String patientSublocation,
                   String patientVillage, Integer numberOfChildren, Integer numberOfChildrenUnder13, String cervicalCancerScreening,
                   String cervicalCancerScreeningYear, ArrayList<String> typeOfScreening, String cervicalCancerScreeningResult, String previousTreatment,
                   String previousTreatmentType, String HIVTest, String KnowsHIVTestDate, String HIVTestDate, String HIVTestResult,
                   String HIVCare, String HIVTreatmentCenter, String chronicMedCondition, ArrayList<String> chronicMedConditionDescription,
                   String usesContraceptives, ArrayList<String> typeOfContraception, String pregnant, String lastUpdated, String cellphone,
                   String phone1, String phone2, ArrayList<String> typeOfFollowupDB, String completedSurvey, String qrCode, String testResults, String surveyStatus) {

        this.providerName=providerName;
        this.screeningLocation=screeningLocation;
        this.cccNumber=cccNumber;
        this.patientName = patientName;
        this.patientDOB = patientDOB;
        this.patientLocation = patientLocation;
        this.patientSublocation = patientSublocation;
        this.patientVillage = patientVillage;
        this.numberOfChildren = numberOfChildren;
        this.numberOfChildrenUnder13 = numberOfChildrenUnder13;
        this.cervicalCancerScreening = cervicalCancerScreening;
        this.cervicalCancerScreeningYear = cervicalCancerScreeningYear;
        this.typeOfScreening = typeOfScreening;
        this.cervicalCancerScreeningResult = cervicalCancerScreeningResult;
        this.previousTreatment = previousTreatment;
        this.previousTreatmentType = previousTreatmentType;
        this.HIVTest = HIVTest;
        this.knowsHIVTestDate = KnowsHIVTestDate;
        this.HIVTestDate = HIVTestDate;
        this.HIVTestResult = HIVTestResult;
        this.HIVCare = HIVCare;
        this.HIVTreatmentCenter = HIVTreatmentCenter;
        this.chronicMedCondition = chronicMedCondition;
        this.chronicMedConditionDescription = chronicMedConditionDescription;
        this.usesContraceptives = usesContraceptives;
        this.typeOfContraception = typeOfContraception;
        this.pregnant = pregnant;
        this.lastUpdated = lastUpdated;
        this.cellphone = cellphone;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.typeOfFollowup = typeOfFollowupDB;
        this.completedSurvey = completedSurvey;
        this.qrCode = qrCode;
        this.testResults = testResults;
        this.surveyStatus = surveyStatus;

    }

    //Used in ExistingPatientActivity.Java to display Patient data
    public String getPatientVillage() { return patientVillage; }

    //Used in ExistingPatientActivity.Java to display Patient data
    //Used in NewPatientActivity to check for duplicate entries
    public String getPatientName() { return patientName; }

    //Used in NewPatientActivity to check for duplicate entries
    public String getPatientDOB() { return patientDOB; }

    public String getLastUpdated() { return lastUpdated;}

    public String getCompletedSurvey() { return completedSurvey;}

    //Access Patient HIV status
    public String getStatus() { return HIVTestResult;}


}
