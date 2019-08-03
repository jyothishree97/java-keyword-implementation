package com.stackroute.oopsconcept;

import java.util.Scanner;


interface Calculator {
    public void mul();

    public void div();
}

interface Calculator1 {
    public void add();

    public void sub();
}

//java supports multiple interface but not multiple inheritance
class MyCalculator1 implements Calculator, Calculator1 {

    @Override
    public void mul() {
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
    }

    @Override
    public void div() {
        int a = 20;
        int b = 10;
        int c = a / b;

    }

    @Override
    public void add() {
        int a = 10, b = 20;
        int c = a + b;
        System.out.println(c);
    }

    @Override
    public void sub() {
        int a = 10, b = 20;
        int c = a - b;
        System.out.println(c);
    }
}

class MyCalCulator2 extends MyCalculator1 implements Calculator {

    @Override
    public void mul() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the val of num1");
        int val1 = scan.nextInt();
        System.out.println("enter val2");
        int val2 = scan.nextInt();
        int sum = val1 * val2;
        System.out.println(sum);

    }

    @Override
    public void div() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the val of num1");
        int val1 = scan.nextInt();
        System.out.println("enter val2");
        int val2 = scan.nextInt();
        int sum = val1 / val2;
        System.out.println(sum);


    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Calculator cal1 = new MyCalculator1();
        cal1 = new MyCalCulator2();
        cal1.mul();
        cal1.div();
        Calculator1 cal = new MyCalculator1();
        cal = new MyCalCulator2();
        cal.add();
        cal.sub();
    }
}
