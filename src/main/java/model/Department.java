package model;

import java.util.Date;

public class Department {
    String departmentName;
    Date createdOn;
    public Department(String departmentName,Date createdOn)
    {
        this.departmentName = departmentName;
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
