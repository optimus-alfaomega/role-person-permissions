package com.co.ao.permission;

import java.util.Calendar;

public interface MetaPermission {

    public MetaPermission setName(String name);

    public String getName();

    public MetaPermission objetive(String objetive);

    public String objetive();

    public MetaPermission start(Calendar string);

    public MetaPermission end(Calendar end);

    public MetaPermission active(boolean active);

    public Calendar getStart();

    public Calendar getEnd();

    public boolean isActive();

}
