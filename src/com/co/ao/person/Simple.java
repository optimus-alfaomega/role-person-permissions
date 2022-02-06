package com.co.ao.person;

import java.time.LocalDate;
import java.util.List;

public class Simple implements Person {

    private String name;
    private String id;

    public Simple() {
        this.name = "simple name person";
        this.id = "123456";
    }

    public Simple(String name, String id) {
        this.name = name;
        this.id = id;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(String id) {
        this.id = id;

    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setAge(int age) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public LocalDate getBirthday() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setBirthday(int year, int month, int day) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setPartner(Person partner) {
        // TODO Auto-generated method stub

    }

    @Override
    public Person getPartner() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setCivilStatus(String status) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getCivilStatus() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Person> getSons() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setSons(List<Person> sons) {
        // TODO Auto-generated method stub

    }

}
