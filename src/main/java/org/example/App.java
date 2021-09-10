package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 19 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{
    private static final double constant = 703;

    public static void main( String[] args ) {
        boolean flag;
        String stringHeight;
        String stringWeight;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("What is your height, in inches? ");
            stringHeight = scan.nextLine();
            try {
                Double.parseDouble(stringHeight);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Enter only numeric values");
                flag = true;
            }

        } while (flag);


        do {
            System.out.print("What is your weight, in pounds? ");
            stringWeight = scan.nextLine();
            try {
                Double.parseDouble(stringWeight);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Enter only numeric values");
                flag = true;
            }

        } while (flag);

        double height = Double.parseDouble(stringHeight);
        double weight = Double.parseDouble(stringWeight);

        double BMI = (weight / (height * height)) * constant;


        System.out.println("Your BMI is "+String.format("%.1f",BMI));
        if(BMI >= 18.5 && BMI <= 25)
        {
            System.out.println("You are within the ideal weight range.");
        }
        else if(BMI > 25)
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
        else if(BMI < 18.5)
        {
            System.out.println("You are underweight. You should see your doctor.");
        }

    }
}