package com.co.ao.role;

import com.co.ao.person.Person;

public class Reviewer implements Role {

    private String role;
    private Person person = null;

    public Reviewer() {
        this.role = "Reviewer";
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
