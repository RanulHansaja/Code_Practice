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

public class LargestValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[100];

        System.out.println("Enter 100 integers:");

        for (int i = 0; i < 100; i++) {
            arr[i] = input.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < 100; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest Value = " + max);

        input.close();
    }
}