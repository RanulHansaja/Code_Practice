/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labsheet_01;

/**
 *
 * @author ranul
 */
public class TestEmployee {

    public static void main(String[] args) {

        PermanentEmployee p1 = new PermanentEmployee(
                101,
                "Ranul",
                "2004-05-10",
                "Manager",
                15);

        p1.displayData();

        System.out.println();

        TemporaryEmployee t1 = new TemporaryEmployee(
                201,
                "Kamal",
                "2000-08-15",
                "Intern",
                26);

        t1.displayData();
    }
}
