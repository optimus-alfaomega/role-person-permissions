package com.co.ao.person;

import java.time.LocalDate;
import java.util.List;

public interface Person {

    public String getName();

    public void setName(String name);

    public void setId(String id);

    public String getId();

    public void setAge(int age);

    public int getAge();

    public LocalDate getBirthday();

    public void setBirthday(int year, int month, int day);

    public void setPartner(Person partner);

    public Person getPartner();

    public void setCivilStatus(String status);

    public String getCivilStatus();

    public List<Person> getSons();

    public void setSons(List<Person> sons);

}
