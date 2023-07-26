package com.developerdevz.mvc;

public abstract class Grade {
    //Fields
    private String name;
    private String subject;
    private String score;

    //Constructors
    public Grade(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public Grade(){
        this.name = "";
        this.subject = "";
        this.score = "";
    }
    

    //Getters and Setters 
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }


}

    