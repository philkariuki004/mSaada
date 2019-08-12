package com.example.msaada_v1;

import android.app.Application;
import android.os.AsyncTask;


import androidx.lifecycle.LiveData;
import androidx.room.Room;

import java.util.Date;
import java.util.List;

public class ClientRepository {

    private ClientDao mclientDao;

    private String DB_NAME = "db_client";

    private ClientDatabase clientDatabase;

    //Creating the database
    public ClientRepository(Application application) {
        clientDatabase = Room.databaseBuilder(application, ClientDatabase.class, DB_NAME).build();
    }


    public void insertClient(String clientProviderName,
                           String screeningLocation,
                           String ccNumber,
                           String clientName,
                           String knowDOB,
                           String clientDOB,
                           String age,
                           String clientLocation,
                           String clientSublocation,
                           String clientVillage,
                           String numberofChildren,
                           String numberofChildren13,
                           String cervicalcancerScreening,
                           String cervicalCanceryear,
                           String typeofScreen,
                           String screenResult,
                           String prevtreatment,
                           String prevtreatmentType,
                           String hivtest,
                           String knowshivdate,
                           String hivdate,
                           String hivresult,
                           String hivcare,
                           String hivtreatment,
                           String chronicmed,
                           String chronicmedlist,
                           String interact,
                           String typeofInteract,
                           String usecontraceptive,
                           String typeofcontra,
                           String pregnant,
                           String cellphone,
                           String phone1,
                           String phone2,
                           String typeofFollowup,
                           String langpref,
                           String directions,
                           String complete,
                           String qrcode
    )

    {

        Client newClient = new Client();
        newClient.setProviderName(clientProviderName);
        newClient.setScreeningLocation(screeningLocation);
        newClient.setCccNumber(ccNumber);
        newClient.setClientName(clientName);
        newClient.setKnowDOB(knowDOB);
        newClient.setKnowDOB(clientDOB);
        newClient.setAge(age);
        newClient.setLocation(clientLocation);
        newClient.setSublocation(clientSublocation);
        newClient.setVillage(clientVillage);
        newClient.setNumberOfChildren(numberofChildren);
        newClient.setChildrenUnder13(numberofChildren13);
        newClient.setScreenBefore(cervicalcancerScreening);
        newClient.setYearOfScreening(cervicalCanceryear);
        newClient.setYearOfScreening(typeofScreen);
        newClient.setScreeningResults(screenResult);
        newClient.setPreviousTreatment(prevtreatment);
        newClient.setTypeOfTreatment(prevtreatmentType);
        newClient.setTestForHIV(hivtest);
        newClient.setRememberHIVDate(knowshivdate);
        newClient.setHIVDateTest(hivdate);
        newClient.setHIVresults(hivresult);
        newClient.setCareForHIV(hivcare);
        newClient.setTreatmentCenterHIV(hivtreatment);
        newClient.setHaveChronicConditions(chronicmed);
        newClient.setChronicMedicalConditions(chronicmedlist);
        newClient.setInteractMed(interact);
        newClient.setInteractMedList(typeofInteract);
        newClient.setUseContraceptives(usecontraceptive);
        newClient.setTypeContra(typeofcontra);
        newClient.setPregnant(pregnant);
        newClient.setHavePhone(cellphone);
        newClient.setCellPhoneNumber(phone1);
        newClient.setAltNumber(phone2);
        newClient.setNotifyHPVPositive(typeofFollowup);
        newClient.setLangText(langpref);
        newClient.setCompleteTest(complete);
        newClient.setDirections(directions);
        newClient.setBarcode(qrcode);

        insert(newClient);

    }


    // Like this, Room ensures that you're not doing any long running operations on the main
    // thread, blocking the UI.
    void insert(Client client) {
        new insertAsyncTask(mclientDao).execute(client);
    }



    private static class insertAsyncTask extends AsyncTask<Client, Void, Void> {

        private ClientDao mAsyncTaskDao;

        insertAsyncTask(ClientDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Client... params) {
            mAsyncTaskDao.insertClient(params[0]);
            return null;
        }
    }





}

