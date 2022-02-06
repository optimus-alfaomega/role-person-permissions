package com.co.ao.role;

import com.co.ao.person.Person;

public class Salesman implements Role {

    private String role;
    private Person person = null;

    public Salesman() {
        this.role = "Salesman user";
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
