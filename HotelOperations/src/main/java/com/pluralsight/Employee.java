package com.pluralsight;

public class Employee {
    private int employeeId = 0;
    private String name = "";
    private String department = "";
    private float payRate = 0;
    private float hoursWorked = 0;

    public Employee(int employeeId, String name, String department, float payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float totalPay() {
        return payRate * hoursWorked;
    }

    public float getRegularHours() {
        float regularHours = hoursWorked;
        if(hoursWorked > 40) {
            regularHours = 40;
        }
        return regularHours;
    }

    public float getOvertimeHours() {
        float regularHours = getRegularHours();
        float overtimeHours = 0;

        if(hoursWorked > 40) {
            overtimeHours = Math.abs(hoursWorked - regularHours);
        }
        return overtimeHours;
    }
}
