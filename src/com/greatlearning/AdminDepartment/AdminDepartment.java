package com.greatlearning.AdminDepartment;

import com.greatlearning.SuperDepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

    public String departmentName() {
        return "Admin Department" + "\n";
    }

    public String getTodaysWork() {
        return "Complete your documents submission" + "\n";
    }

    public String getWorkDeadline() {
        return "Complete by EOD" + "\n";
    }
}
