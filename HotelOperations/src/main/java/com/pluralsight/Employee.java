package com.pluralsight;

import java.time.Duration;
import java.time.LocalTime;

public class Employee {
    private int employeeId = 0;
    private String name = "";
    private String department = "";
    private float payRate = 0;
    private float hoursWorked = 0;
    private LocalTime clockIn = null;

    public Employee(int employeeId, String name, String department, float payRate, float hoursWorked, LocalTime clockIn) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.clockIn = clockIn;
    }

    public LocalTime getClockIn() {
        return clockIn;
    }

    public void setClockIn(LocalTime clockIn) {
        this.clockIn = clockIn;
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

//   public void punchTimeCard(String timeCard) {
//       if(timeCard.equalsIgnoreCase("in")) {
//           clockIn = LocalTime.now();
//           System.out.printf("You punched in at %tH:%tM:%tS%n", clockIn, clockIn, clockIn);
//       }else if(timeCard.equalsIgnoreCase("out")) {
//           LocalTime clockOut = LocalTime.now();
//           Duration duration = Duration.between(clockIn, clockOut);
//           float shift = duration.toMinutes();
//           shift /= 60;
//           hoursWorked += shift;
//           System.out.println(hoursWorked);
//
//       }
//
//
//   }

   public void punchIn(double time) {
        int hour = (int) time;
        double doubleMinutes = (time - hour) * 60;
        int minutes = (int) doubleMinutes;
        double doubleSeconds = (doubleMinutes - minutes) * 60;
        int seconds = (int) doubleSeconds;
        this.clockIn = LocalTime.of(hour, minutes, seconds);
        System.out.printf("You punched in at %tH:%tM:%tS%n", clockIn, clockIn, clockIn);
   }

    public LocalTime punchIn() {
        return clockIn = LocalTime.now();
    }

    public void punchOut(double time) {
        int hour = (int) time;
        double doubleMinutes = (time - hour) * 60;
        int minutes = (int) doubleMinutes;
        double doubleSeconds = (doubleMinutes - minutes) * 60;
        int seconds = (int) doubleSeconds;

        LocalTime clockOut = LocalTime.of(hour, minutes, seconds);
        Duration duration = Duration.between(clockIn, clockOut);
        float shift = duration.toMinutes();
        shift /= 60;
        hoursWorked += shift;
        System.out.println(hoursWorked);
   }

    public LocalTime punchOut() {
        return LocalTime.now();
    }


}
