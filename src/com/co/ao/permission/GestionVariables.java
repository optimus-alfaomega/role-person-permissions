package com.co.ao.permission;

import java.time.Clock;
import java.util.Calendar;

import com.co.ao.command.Command;
import com.co.ao.person.Person;
import com.co.ao.role.Role;

public class Init implements PermissionCommand {

    private String name;
    private String objetive;
    private Clock start;
    private Clock end;
    private boolean active;

    @Override
    public MetaPermission setName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MetaPermission objetive(String objetive) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String objetive() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MetaPermission start(Calendar string) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MetaPermission end(Calendar end) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MetaPermission active(boolean active) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Calendar getStart() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Calendar getEnd() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isActive() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public PermissionCommand setCommand(Command command) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PermissionCommand setRole(Role role) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PermissionCommand start(String start) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PermissionCommand end(String end) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getStartoString() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getEndtoString() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean confirmExec(Person person) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

}
