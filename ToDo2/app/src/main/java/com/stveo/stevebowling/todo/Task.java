package com.stveo.stevebowling.todo;

import java.util.Date;

/**
 * Created by stevebowling on 10/25/16.
 */

public class Task implements Comparable<Task> {
    private String name;
    private String text;
    private String dateModified;
    private String category;
    private String dueDate;

    public Task(String name, String text, String dateModified, String dueDate, String category) {
        this.name = name;
        this.dateModified = dateModified;
        this.text = text;
        this.category = category;
        this.dueDate=dueDate;


    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    @Override
    public int compareTo(Task another) {
        return another.getDateModified().compareTo(getDateModified());
        //return getDateModified().compareTo(another.getDateModified());
    }

}