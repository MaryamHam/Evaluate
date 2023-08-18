package com.example.evaluate;

public class Item {

    private String question;
    private String question2;
    private float rating;
    private String comment;





    public Item(String question,float rating, String comment,String question2) {
        this.question = question;
        this.rating = rating;
        this.comment = comment;
        this.question2 = question2;

    }

    public String getQuestion() {
        return question;
    }

    public float getRate() {
        return rating;
    }
    public String getComment() {
        return comment;
    }

    public String getQuestion2() {
        return question2;
    }



}
