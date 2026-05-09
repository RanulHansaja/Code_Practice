/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labsheet_01;

/**
 *
 * @author ranul
 */
public class Employee {

    int empNo;
    String name;
    String dob;
    double salary;
    String title;

    Employee() {

    }

    Employee(int empNo, String name,
             String dob, double salary,
             String title) {

        this.empNo = empNo;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.title = title;
    }

    void displayData() {

        System.out.println("Employee No : " + empNo);
        System.out.println("Name : " + name);
        System.out.println("DOB : " + dob);
        System.out.println("Salary : " + salary);
        System.out.println("Title : " + title);
    }
}