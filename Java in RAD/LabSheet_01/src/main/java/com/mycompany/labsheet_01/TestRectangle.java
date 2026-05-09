/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labsheet_01;

import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enther the Length : ");
        double length = input.nextDouble();

        System.out.print("Enther the Width : ");
        double width = input.nextDouble();
        Rectangle rect = new Rectangle(length, width);

        rect.display();
    }
}
