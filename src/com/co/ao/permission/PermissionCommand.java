package com.co.ao.permission;

import com.co.ao.command.Command;
import com.co.ao.person.Person;
import com.co.ao.role.Role;

public interface PermissionCommand extends MetaPermission {
   public PermissionCommand setCommand(Command command);

   public PermissionCommand setRole(Role role);

   public PermissionCommand start(String start);

   public PermissionCommand end(String end);

   public String getStartoString();

   public String getEndtoString();

   public boolean confirmExec(Person person) throws Exception;

}
