package com.example.tbddlab7.model;

public class Contact {
    int id;
    String name;

    public Contact() {
    }

    public Contact(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Contact(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
