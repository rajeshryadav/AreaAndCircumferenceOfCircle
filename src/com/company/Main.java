package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter radious");

        Scanner obje = new Scanner(System.in);
        int d = obje.nextInt();

        double d1 ,d2;

        d1=3.14*d*d;
        d2=2*3.14*d;

        System.out.println("Area of circle is  :"+d1);
        System.out.println("Circumference of circle is  :"+d2);

    }
}
