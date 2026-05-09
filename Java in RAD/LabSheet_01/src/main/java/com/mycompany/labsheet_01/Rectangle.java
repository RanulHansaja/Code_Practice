package com.mycompany.labsheet_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class Rectangle {

    double length;
    double width;


    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    double perimeter() {
        return 2 * (length + width);
    }


    double area() {
        return length * width;
    }


    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + perimeter());
        System.out.println("Area: " + area());
    }
}