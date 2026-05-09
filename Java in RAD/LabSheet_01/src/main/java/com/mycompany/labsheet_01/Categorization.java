/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labsheet_01;

/**
 *
 * @author ranul
 */
import java.util.Scanner;

public class Categorization {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Integer: ");
        int value = input.nextInt();

        if (value > 75) {
            System.out.println("Category: High");
        }
        else if (value >= 50) {
            System.out.println("Category: Medium");
        }
        else {
            System.out.println("Category: Low");
        }

        input.close();
    }
}