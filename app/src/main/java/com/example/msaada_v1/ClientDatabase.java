package com.example.msaada_v1;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Client.class},version = 1, exportSchema = false)
public abstract class ClientDatabase extends RoomDatabase {

    public abstract ClientDao clientDao();



}
