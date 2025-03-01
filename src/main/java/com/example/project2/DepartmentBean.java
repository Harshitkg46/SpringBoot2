package com.example.project2;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String departmentName = "Engineering";

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
