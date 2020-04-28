package com.company;

public class Moadele {
   private int a,b,c;

    public Moadele(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public  void f() throws Exception{
        if ((b*b)-(4*a*c)<0)
             throw new Exception();
        else if (b*b-4*a*c>0)
            System.out.println("2rishe");
        else
            System.out.println("1rishe");

    }
}
