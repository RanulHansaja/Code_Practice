/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labsheet_01;

/**
 *
 * @author ranul
 */
public class PermanentEmployee extends Employee
        implements EmployeeInterface {

    int servicePeriod;
    double bonus;
    double totalSalary;

    PermanentEmployee(int empNo, String name, String dob, String title, int servicePeriod) {

        super(empNo, name, dob, 50000, title);
        this.servicePeriod = servicePeriod;
    }

    public double calculateBonus(int years) {

        if (years > 20) {
            bonus = salary * 0.25;
        } else if (years >= 10) {
            bonus = salary * 0.10;
        } else if (years >= 5) {
            bonus = salary * 0.05;
        } else {
            bonus = 0;
        }

        return bonus;
    }

    public double calculateSalary() {

        totalSalary = salary + calculateBonus(servicePeriod);
        return totalSalary;
    }

    public void displayData() {

        System.out.println("----- Permanent Employee -----");
        super.displayData();
        System.out.println("Service Period : " + servicePeriod);
        System.out.println("Bonus : " + calculateBonus(servicePeriod));
        System.out.println("Total Salary : " + calculateSalary());
    }
}
