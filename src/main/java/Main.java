/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int first = input.nextInt();

        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        System.out.print("Enter the third number: ");
        int third = input.nextInt();

        if (first != second || second != third || third != first) {
            if (first >= second && first >= third)
                System.out.println("The largest number is: " + first);

            else if (second >= first && second >= third)
                System.out.println("The largest number is: " + second);

            else if (third >= first && third >= second)
                System.out.println("The largest number is: " + third);
        } else {
            System.out.println("Please enter different numbers.");

        }
    }
}

