/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labsheet_01;

/**
 *
 * @author ranul
 */
public class TemporaryEmployee extends Employee
        implements EmployeeInterface {

    int workingDays;
    double bonus;
    double totalSalary;

    TemporaryEmployee(int empNo, String name, String dob, String title, int workingDays) {

        super(empNo, name, dob, 25000, title);
        this.workingDays = workingDays;
    }

    public double calculateBonus(int days) {

        if (days >= 25) {
            bonus = salary * 0.05;
        } else {
            bonus = 0;
        }

        return bonus;
    }

    public double calculateSalary() {

        totalSalary = salary + calculateBonus(workingDays);
        return totalSalary;
    }

    public void displayData() {

        System.out.println("----- Temporary Employee -----");
        super.displayData();
        System.out.println("Working Days : " + workingDays);
        System.out.println("Bonus : " + calculateBonus(workingDays));
        System.out.println("Total Salary : " + calculateSalary());
    }
}
