package com.co.ao.role;

import com.co.ao.person.Person;

public class AdminPlatform implements Role {

    private String role;
    private Person person = null;

    public AdminPlatform() {
        this.role = "Admin Platform";
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
