package com.co.ao.role;

public class SimpleUser implements Role {

    private String role;

    public SimpleUser() {
        this.role = "simple user with less permission";
    }

    @Override
    public void setRoleName(String role) {
        this.role = role;
    }

    @Override
    public String getRoleName() {
        return this.role;
    }
}
