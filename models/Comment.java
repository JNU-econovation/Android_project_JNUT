package com.example.chaeyeon.registeration.models;

/**
 * Created by ChaeYeon on 2017-07-18.
 */
//댓글 model
public class Comment {
    public String uid;
    public String author;
    public String text;

    public Comment() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public Comment(String uid, String author, String text) {
        this.uid = uid;
        this.author = author;
        this.text = text;
    }
}
