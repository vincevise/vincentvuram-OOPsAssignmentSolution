package com.greatlearning;

import com.greatlearning.AdminDepartment.AdminDepartment;
import com.greatlearning.HRDepartment.HrDepartment;
import com.greatlearning.TechDepartment.TechDepartment;

public class Main {

    public static void main(String[] args) {

        // Creating object of each subclass
        AdminDepartment employee1 = new AdminDepartment();
        HrDepartment employee2 = new HrDepartment();
        TechDepartment employee3 = new TechDepartment();

        // concatenate all the strings of a class into one
        String AdminEmployee = "Welcome to "+ employee1.departmentName() + employee1.getTodaysWork() + employee1.getWorkDeadline() + employee1.isTodayAHoliday();
        String HrEmployee =    "Welcome to "+ employee2.departmentName() + employee2.doActivity() + employee2.getTodaysWork() + employee2.getWorkDeadline() + employee1.isTodayAHoliday();
        String TechEmployee =  "Welcome to "+ employee3.departmentName() + employee3.getTodaysWork() + employee3.getWorkDeadline() + employee3.getTechStackInformation() + employee1.isTodayAHoliday();

        // Printing
        System.out.println(AdminEmployee);
        System.out.println(HrEmployee);
        System.out.println(TechEmployee);

    }
}

