package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("zarib x^2:");
        int x = scanner.nextInt();
        System.out.print("zarib x:");
        int y = scanner.nextInt();
        System.out.print("zarib:");
        int z = scanner.nextInt();
        Moadele moadele=new Moadele(x,y,z);
        try {
            moadele.f();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println("bedon jvb!!!");
        }
    }

}