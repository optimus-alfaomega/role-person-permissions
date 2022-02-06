package com.co.ao.person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.co.ao.role.Consult;
import com.co.ao.role.Role;

public class External implements Person {

    private String name;
    private String id;
    private int age;
    private LocalDate birthdate;
    private Person partner;
    private String status;
    private String description = "user worker by external way for a Company";
    private List<Role> roles;

    public External() {
        this.name = "";
        this.id = "";
        this.age = 0;
        birthdate = LocalDate.now();
        partner = new Simple();
        partner.setName("sin identificar");
        partner.setId("sin identificar");
        partner.setAge(0);
        status = "single";
        this.roles = new ArrayList<Role>();
        this.roles.add(new Consult());

    }

    public External(String name, String id, int age, int yearBithdate, int monthBirthdate, int dayBirthdate,
            String civilStatus, Role role) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.birthdate = LocalDate.of(yearBithdate, monthBirthdate, dayBirthdate);
        this.status = civilStatus;
        this.roles = new ArrayList<Role>();
        this.roles.add(role);

    }

    public External(String name, String id, int age, int yearBithdate, int monthBirthdate, int dayBirthdate,
            Person partner, String civilStatus, Role role) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.birthdate = LocalDate.of(yearBithdate, monthBirthdate, dayBirthdate);
        this.partner = partner;
        this.status = civilStatus;
        this.roles = new ArrayList<Role>();
        this.roles.add(role);
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
        this.age = age;

    }

    @Override
    public int getAge() {

        return this.getAge();
    }

    @Override
    public void setPartner(Person partner) {
        this.partner = partner;

    }

    @Override
    public Person getPartner() {
        return this.partner;
    }

    @Override
    public void setCivilStatus(String status) {
        this.status = status;

    }

    @Override
    public String getCivilStatus() {
        return status;
    }

    @Override
    public List<Person> getSons() {
        System.out.println("este tipo de persona no puede registrar hijos");
        return null;
    }

    @Override
    public void setSons(List<Person> sons) {
        System.out.println("este tipo de persona no puede registrar hijos");
    }

    @Override
    public LocalDate getBirthday() {
        return this.birthdate;
    }

    @Override
    public void setBirthday(int year, int month, int day) {
        this.birthdate = LocalDate.of(year, month, day);
    }

    public String getDescription() {
        return this.description;
    }

    public List<Role> getRoles() {
        return this.roles;
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }

}
