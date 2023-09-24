package com.practice;
import java.util.Scanner;

public class Kilometer_to_Miles {
    public static void main(String[] args) {
        System.out.println("Kilometer to Miles Converter");
        Scanner sc = new Scanner(System.in);
        float km, mile;
        System.out.print("Enter distance in Kilometers: ");
        km = sc.nextFloat();
        mile = (float) (km * 0.621371);
        System.out.println("Equivalent distance in Miles: " + mile);
        sc.close();
    }
}
