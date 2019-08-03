package com.stackroute;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //The Scanner class is used to get user input, and it is found in the java.util package.
        //2-Dimensional array
        int array[][] = new int[2][3];
        System.out.println("enter the array");
        for (int i = 0; i <= array.length-1; i++) {
            for (int j = 0; j <= array[i].length-1; i++) {
                System.out.println("enter values" + i);
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array[i].length - 1; j++)
                System.out.println(array[i][j]);
        }

    }
}
