package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        student.setName("hamid");
        student.setKarbari("hozi");
        student.setId(971113011);

        System.out.print("name:");
        String name=scanner.next();
        System.out.print("namekarbari:");
        String namekarbari=scanner.next();
        System.out.print("id:");
        long id=scanner.nextLong();
        try {
            if (!student.getName().equals(name) && !student.getKarbari().equals(namekarbari) && student.getId()!=id)
                throw new Exception();
            System.out.println("dorost vared shode");
        }catch (Exception e) {
            System.out.println("aaa");
        }
    }
}
