package com.freeit.lesson6;

import java.util.Date;

/**
 * Created by Artem Peshko on 22.08.2022
 * E-Mail artem.peshko@alseda.by
 * E-Mail artem.peshko@gmail.com
 */
public class Note {
    private String name;
    private Date createdDate;
    private String description;
    private String signature;
    private static int counter = 0;

    public Note() {
        counter++;
    }

    public Note(String name, String description, String signature) {
        this.name = name;
        this.createdDate = new Date();
        this.description = description;
        this.signature = signature;
    }

    public Note(String name, Date createdDate, String description, String signature) {
        this.name = name;
        this.createdDate = createdDate;
        this.description = description;
        this.signature = signature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void greeting() {
        System.out.println("Say hello " + counter);
    }

    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                ", createdDate=" + createdDate +
                ", description='" + description + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
