package com.example.msaada_v1;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "client_table")

public class Client {

    //Page one
    private String providerName;
    private String screeningLocation;
    private String cccNumber;

    //page2
    @PrimaryKey
    @NonNull
    private String clientName;
    private String knowDOB;

    //Page 3
    private String dateOfBirth;

    //Page 4
    private String age;

    //page5
    private String village;
    private String location;
    private String sublocation;

    //page 6
    private String numberOfChildren;
    private String childrenUnder13;

    //page 7
    private String screenBefore;

    //page 8
    private String yearOfScreening;
    private String typeOfScreening;
    private String screeningResults;

    //page 9
    private String previousTreatment;

    //page 10
    private String typeOfTreatment;

    //page 11
    private String testForHIV;

    //page 12
    private String rememberHIVDate;

    //page 13
    private String  HIVDateTest;

    //page 14
    private String HIVresults;

    //page 15
    private String careForHIV;

    //page 16
    private String treatmentCenterHIV;

    //page 17
    private String haveChronicConditions;

    //page 18
    private String chronicMedicalConditions;///ReWrite This.


    //page 19
    private String interactMed;

    //page 20
    private String interactMedList;///reWrite This

    //page 21
    private String useContraceptives;

    //page 22
    private String typeContra;///ReWrite This.

    //page 23
    private String pregnant;

    //page 24
    private String havePhone;

    //page 25
    private String cellPhoneNumber;
    private String altNumber;
    private String notifyHPVNegative;//Rewrite
    private String notifyHPVPositive;

    //page 26
    private String langText;

    //page 27
    private String directions;

    //page 28
    private String completeTest;
    private String barcode;
    private String surveyAdmin;


   public Client(){

   }

   /* Getters and Setters for Page1*/
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setScreeningLocation(String screeningLocation) {
        this.screeningLocation = screeningLocation;
    }

    public String getScreeningLocation() {
        return screeningLocation;
    }

    public void setCccNumber(String cccNumber) {
        this.cccNumber = cccNumber;
    }

    public String getCccNumber() {
        return cccNumber;
    }

    /* Getters and Setters for Page 2*/

    public void setClientName(@NonNull String clientName) {
        this.clientName = clientName;
    }

    @NonNull
    public String getClientName() {
        return clientName;
    }


    public String getKnowDOB() {
        return knowDOB;
    }

    public void setKnowDOB(String knowDOB) {
        this.knowDOB = knowDOB;
    }

    /* Getters and Setters for Page 3*/

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /* Getters and Setters for Page 4*/

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
    /* Getters and Setters for Page 5*/

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setSublocation(String sublocation) {
        this.sublocation = sublocation;
    }

    public String getSublocation() {
        return sublocation;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getVillage() {
        return village;
    }
    /* Getters and Setters for Page 6*/

    public void setNumberOfChildren(String numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public String getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setChildrenUnder13(String childrenUnder13) {
        this.childrenUnder13 = childrenUnder13;
    }

    public String getChildrenUnder13() {
        return childrenUnder13;
    }
    /* Getters and Setters for Page 7*/

    public void setScreenBefore(String screenBefore) {
        this.screenBefore = screenBefore;
    }

    public String getScreenBefore() {
        return screenBefore;
    }
    /* Getters and Setters for Page 8*/

    public void setYearOfScreening(String yearOfScreening) {
        this.yearOfScreening = yearOfScreening;
    }

    public String getYearOfScreening() {
        return yearOfScreening;
    }

    public void setTypeOfScreening(String typeOfScreening) {
        this.typeOfScreening = typeOfScreening;
    }

    public String getTypeOfScreening() {
        return typeOfScreening;
    }

    public void setScreeningResults(String screeningResults) {
        this.screeningResults = screeningResults;
    }

    public String getScreeningResults() {
        return screeningResults;
    }

    /* Getters and Setters for Page 9*/

    public void setPreviousTreatment(String previousTreatment) {
        this.previousTreatment = previousTreatment;
    }

    public String getPreviousTreatment() {
        return previousTreatment;

    }

    public String getNotifyHPVNegative() {
        return notifyHPVNegative;
    }

    public void setNotifyHPVNegative(String notifyHPVNegative) {
        this.notifyHPVNegative = notifyHPVNegative;
    }

    public String getTypeOfTreatment() {
        return typeOfTreatment;
    }

    public void setTypeOfTreatment(String typeOfTreatment) {
        this.typeOfTreatment = typeOfTreatment;
    }

    public String getTestForHIV() {
        return testForHIV;
    }

    public void setTestForHIV(String testForHIV) {
        this.testForHIV = testForHIV;
    }

    public String getRememberHIVDate() {
        return rememberHIVDate;
    }

    public void setRememberHIVDate(String rememberHIVDate) {
        this.rememberHIVDate = rememberHIVDate;
    }

    public String getHIVDateTest() {
        return HIVDateTest;
    }

    public void setHIVDateTest(String HIVDateTest) {
        this.HIVDateTest = HIVDateTest;
    }

    public String getHIVresults() {
        return HIVresults;
    }

    public void setHIVresults(String HIVresults) {
        this.HIVresults = HIVresults;
    }

    public String getCareForHIV() {
        return careForHIV;
    }

    public void setCareForHIV(String careForHIV) {
        this.careForHIV = careForHIV;
    }

    public String getTreatmentCenterHIV() {
        return treatmentCenterHIV;
    }

    public void setTreatmentCenterHIV(String treatmentCenterHIV) {
        this.treatmentCenterHIV = treatmentCenterHIV;
    }

    public String getHaveChronicConditions() {
        return haveChronicConditions;
    }

    public void setHaveChronicConditions(String haveChronicConditions) {
        this.haveChronicConditions = haveChronicConditions;
    }

    public String getChronicMedicalConditions() {
        return chronicMedicalConditions;
    }

    public void setChronicMedicalConditions(String chronicMedicalConditions) {
        this.chronicMedicalConditions = chronicMedicalConditions;
    }

    public String getInteractMed() {
        return interactMed;
    }

    public void setInteractMed(String interactMed) {
        this.interactMed = interactMed;
    }

    public String getInteractMedList() {
        return interactMedList;
    }

    public void setInteractMedList(String interactMedList) {
        this.interactMedList = interactMedList;
    }

    public String getUseContraceptives() {
        return useContraceptives;
    }

    public void setUseContraceptives(String useContraceptives) {
        this.useContraceptives = useContraceptives;
    }

    public String getTypeContra() {
        return typeContra;
    }

    public void setTypeContra(String typeContra) {
        this.typeContra = typeContra;
    }

    public String getPregnant() {
        return pregnant;
    }

    public void setPregnant(String pregnant) {
        this.pregnant = pregnant;
    }

    public String getHavePhone() {
        return havePhone;
    }

    public void setHavePhone(String havePhone) {
        this.havePhone = havePhone;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getAltNumber() {
        return altNumber;
    }

    public void setAltNumber(String altNumber) {
        this.altNumber = altNumber;
    }

    public String getNotifyHPVPositive() {
        return notifyHPVPositive;
    }

    public void setNotifyHPVPositive(String notifyHPVPositive) {
        this.notifyHPVPositive = notifyHPVPositive;
    }

    public String getLangText() {
        return langText;
    }

    public void setLangText(String langText) {
        this.langText = langText;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getCompleteTest() {
        return completeTest;
    }

    public void setCompleteTest(String completeTest) {
        this.completeTest = completeTest;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSurveyAdmin() {
        return surveyAdmin;
    }

    public void setSurveyAdmin(String surveyAdmin) {
        this.surveyAdmin = surveyAdmin;
    }






}
