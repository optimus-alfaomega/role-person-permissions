package com.co.ao.role;

import com.co.ao.person.Person;

public class AdminProyect implements Role {

    private String role;
    private Person person = null;

    public AdminProyect() {
        this.role = "Admin of a proyect";
    }

    @Override
    public void setRoleName(String role) {
        this.role = role;
    }

    @Override
    public String getRoleName() {
        return this.role;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return this.person;
    }
}
