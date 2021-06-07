/*
 *  UCF COP3330 Summer 2021 Assignment 17 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.util.Scanner;

public class bloodalc {
    public static void main(String[] args){

        int  gender, ounces, pounds, hours;
        double alclevel;
        System.out.println("Enter 1 if you're a boy and 2 if you're a girl");
        Scanner scanner = new Scanner(System.in);
        String newgender = scanner.next();
        System.out.println("How many ounces of alcohol did you have?");
        Scanner scanner1 = new Scanner(System.in);
        String newounces = scanner1.next();
        System.out.println("What is your weight in pounds?");
        Scanner scanner2 = new Scanner(System.in);
        String newpounds = scanner2.next();
        System.out.println("How many hours has it been since you drank?");
        Scanner scanner3 = new Scanner(System.in);
        String newhours = scanner3.next();

        gender = Integer.parseInt(newgender);
        ounces = Integer.parseInt(newounces);
        pounds = Integer.parseInt(newpounds);
        hours = Integer.parseInt(newhours);

        if(gender == 1 ){
            alclevel = (ounces * 5.14 / pounds * 0.73) - .015 * hours;
            System.out.println("Your BAC is " + alclevel);
            if(alclevel >= 0.08) {
                System.out.println("It is illegal for you to drive.");
            }
                else{
                    System.out.println(" It is legal for you to drive");
                }

        }
        if (gender == 2){
            alclevel = (ounces * 5.14 / pounds * 0.66) - .015 * hours;
            System.out.println("Your BAC is " + alclevel);
            if(alclevel >= 0.08) {
                System.out.println("It is illegal for you to drive.");
            }
            else{
                System.out.println(" It is legal for you to drive");
            }
        }
        if(gender >= 3 ){
            System.out.println("That is not what we asked for. Question 1 is not valid.");
        }

    }
}
