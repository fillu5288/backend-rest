package com.example.rest.util;

public class PersonNotCreated extends RuntimeException{
    public PersonNotCreated(String msg) {
        super(msg);
    }
}
