package com.example.msaada_v1;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ClientDao {

    @Insert
    Long insertClient(Client client);

    @Query("SELECT * FROM client_table ORDER BY clientName ASC")
    LiveData<List<Client>> fetchAllClients();

    @Update
    void updateTask(Client client);


    @Delete
    void deleteTask(Client client);

    @Query("DELETE FROM client_table")
    void deleteAll();



}
