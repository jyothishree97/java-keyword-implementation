package com.stackroute;

import java.util.Scanner;

//example of conditional statements if, nested if and switch conditions
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //The Scanner class is used to get user input, and it is found in the java.util package.
        System.out.println("Enter the value");
        int val = scan.nextInt();

        //it executes when condition is true
        if (val > 100) {
            //given value is even it executes if statements otherwise it executes else part
            if (val % 2 == 0)
                System.out.println("Value is greaterthan 100 and even");
            else
                System.out.println("Value greaterthan 100 and odd");
        } else if (val < 0)
            System.out.println("value is not valid");

        else {
            int val1 = val % 2;
            //The switch statement takes a variable and
            //then has a list of cases or actions to perform for each value that the variable obtains.
            switch (val1) {
                case 0:
                    System.out.println("valid and even");
                    break;
                case 1:
                    System.out.println("valid and odd");
                    break;
                //It uses the word default to perform actions
                // in which the conditions are not met and it uses the word break to stop performing actions.
                default:
                    break;
            }
        }
    }
}
