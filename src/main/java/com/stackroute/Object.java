package com.stackroute;

import java.util.Scanner;

public class Object
{
    void add(int num1,int num2){
        int sum=num1+num2;
        System.out.println("sum is"+sum);
    }

    void sub(int num1,int num2){
        int sub=num1-num2;
        System.out.println("Substraction of two num is"+sub);
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //The Scanner class is used to get user input, and it is found in the java.util package.
        System.out.println("enter the num1");
        int num1=scanner.nextInt();
        System.out.println("enter the num2");
        int num2=scanner.nextInt();
        Object object1=new Object();//creating a object
        Object object=new Object();//Creating new object
        object.add(num1,num2);
       object1.sub(num1,num2);

    }
}
