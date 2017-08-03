package com.example.chaeyeon.registeration.models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by ChaeYeon on 2017-07-18.
 */

@IgnoreExtraProperties
public class User {

    public String username;
    public String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

}
