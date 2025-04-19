package com.example.hw04_gymlog_v300.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.hw04_gymlog_v300.database.entities.User;

import java.util.List;

@Dao
public interface UserDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(User... user);
    /*This is a Var Arg, it will take zero or more user objects, so it
   SHOULD be able to handle an array or list or something similar
   (says DR. C)
   */

    @Delete
    void delete(User user);

    @Query("SELECT * FROM " + GymLogDatabase.USER_TABLE + " ORDER BY username")
    List<User> getAllUsers();

    @Query("DELETE FROM " + GymLogDatabase.USER_TABLE)
    void deleteAll();
}
