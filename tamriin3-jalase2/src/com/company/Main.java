package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your number:");
        int i=scanner.nextInt();
        MyInt yourint=new Int();
        ((Int) yourint).setX(i);
        yourint.even();
        yourint.odd();
        yourint.positive();
        yourint.negetive();
        yourint.zero();
    }
}
