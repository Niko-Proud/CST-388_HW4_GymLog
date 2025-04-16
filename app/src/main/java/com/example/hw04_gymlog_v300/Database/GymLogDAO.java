package com.example.hw04_gymlog_v300.Database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy

import com.example.hw04_gymlog_v300.Database.entities.GymLog;

@Dao
public interface GymLogDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE);
    public void insert(GymLog gymlog);
}
