package com.stackroute;

import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //The Scanner class is used to get user input, and it is found in the java.util package.
        System.out.println("enter the num");
        int num = scan.nextInt();
        //for(Intialization;condition / testing statements; Increment Or Decrement)
        for (int i = 0; i <= num; i++) {
                System.out.print(i);
        }

        while (num!=0){
            System.out.print(num);
            //decrementing number by 1
            num--;
        }
    }
}

