package com.company;
import com.sun.org.apache.bcel.internal.util.InstructionFinder;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        Karmand[] karmand=new Karmand[2];
        System.out.println("enter information:");
        System.out.print("name:");
        String n=scanner.next();
        System.out.print("family:");
        String f=scanner.next();
        System.out.print("age:");
        int a=scanner.nextInt();


        System.out.println("enter information:");
        System.out.print("name:");
        String name=scanner.next();
        System.out.print("family:");
        String family=scanner.next();
        System.out.print("age:");
        int age=scanner.nextInt();


        try {
            karmand[0].setName(n);
            karmand[0].setFamily(f);
            karmand[0].setAge(a);
            karmand[1].setName(name);
            karmand[1].setFamily(family);
            karmand[1].setAge(age);
        }catch (Exception e){
              System.out.println(e.getMessage());
             System.out.println("barabar");
        }
    }
}

