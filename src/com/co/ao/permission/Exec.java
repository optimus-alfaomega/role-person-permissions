package com.co.ao.permission;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.co.ao.command.Command;
import com.co.ao.person.External;
import com.co.ao.person.Person;
import com.co.ao.role.Role;

/**
 * Ejemplo de permiso para ejecución
 */

public class Exec implements PermissionCommand {

    private String name;
    private String objetive;
    private Calendar start;
    private Calendar end;
    private boolean active;
    private Command command;
    private Role role;
    private Person person;

    public Exec(String name, String objetive) {
        this.name = name;
        this.objetive = objetive;
    }

    @Override
    public MetaPermission setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public MetaPermission objetive(String objetive) {
        this.objetive = objetive;
        return this;
    }

    @Override
    public String objetive() {
        return this.objetive;
    }

    @Override
    public MetaPermission start(Calendar start) {
        this.start = start;
        return this;
    }

    @Override
    public MetaPermission end(Calendar end) {
        this.end = end;
        return this;
    }

    @Override
    public MetaPermission active(boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public boolean isActive() {
        return this.active;
    }

    @Override
    public PermissionCommand setCommand(Command command) {
        this.command = command;
        return this;
    }

    @Override
    public PermissionCommand setRole(Role role) {
        this.role = role;
        return this;
    }

    @Override
    public boolean confirmExec(Person person) throws Exception {
        Method method = person.getClass().getMethod("getRoles");
        ArrayList<Role> l = (ArrayList<Role>) method.invoke(person);
        boolean confirm = false;
        for (Role r : l) {
            confirm = r.getRoleName().equals(this.role.getRoleName()) ? true : false;
        }
        return confirm;
    }

    @Override
    public PermissionCommand start(String start) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(start);
            Calendar startDate = Calendar.getInstance();
            startDate.setTime(date);
            this.start = startDate;

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return this;
    }

    @Override
    public PermissionCommand end(String end) {
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(end);
            Calendar endDate = Calendar.getInstance();
            endDate.setTime(date);
            this.end = endDate;

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return this;
    }

    @Override
    public Calendar getStart() {
        return this.start;
    }

    @Override
    public Calendar getEnd() {
        return this.end;
    }

    @Override
    public String getStartoString() {
        return this.start.getTime() + "";
    }

    @Override
    public String getEndtoString() {
        return this.end.getTime() + "";
    }

}
