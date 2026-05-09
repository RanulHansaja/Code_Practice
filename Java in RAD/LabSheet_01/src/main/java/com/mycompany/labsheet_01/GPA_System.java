package com.mycompany.labsheet_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ranul
 */
import java.util.Scanner;

public class GPA_System {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Grade : ");
        char grade = input.next().charAt(0);

        double gpa;

        switch (grade) {
            case 'A':
            case 'a':
                gpa = 4.00;
                break;

            case 'B':
            case 'b':
                gpa = 3.00;
                break;

            case 'C':
            case 'c':
                gpa = 2.00;
                break;

            case 'F':
            case 'f':
                gpa = 0.00;
                break;

            default:
                gpa = -1;
                System.out.println("Invalid Grade");
        }

        if (gpa != -1) {
            System.out.println("GPA = " + gpa);
        }

        input.close();
    }
}
