package com.co.ao.permission;

import java.util.Calendar;
import java.util.Date;

import com.co.ao.person.External;
import com.co.ao.person.Person;
import com.co.ao.role.Consult;

public class Demo {
    public static void main(String[] args) {

        PermissionCommand exec = new Exec("comando de ejecución", "permite la ejecución de un comando");
        Date date = new Date();
        Calendar startDate = Calendar.getInstance();
        startDate.setTime(date);
        Calendar endDate = Calendar.getInstance();
        endDate.add(Calendar.MONTH, 3);
        // exec.setRole(new Consult()).active(true).start(startDate).end(endDate);
        exec.setRole(new Consult());
        exec.start("01/10/2021");
        exec.end("02/10/2021");
        System.out.println(exec.getEndtoString());
        System.out.println(exec.getStart().getTime());
        /*
         * MetaPermission mexec = exec;
         * 
         * System.out.println(mexec.getStart().getTime());
         * System.out.println(exec.getStartoString());
         */
        /*
         * Person person = new External();
         * try {
         * boolean response = exec.confirmExec(person);
         * System.out.println(response);
         * } catch (Exception e) {
         * e.printStackTrace();
         * }
         */
    }
}
