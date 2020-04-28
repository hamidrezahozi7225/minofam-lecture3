package com.company;

public class Int implements MyInt {
    private int x;

    public void setX(int x) {
        this.x = x;
    }
    public void even(){
        if(x>0 && x%2==0)
            System.out.println("even");
    }
    public void odd(){
        if(x>0 && x%2==1)
            System.out.println("odd");
    }
    public void positive(){
        if(x>0)
            System.out.println("mosbat");
    }
    public void negetive(){
        if (x<0)
            System.out.println("manfi");
    }
    public void zero(){
        if (x==0)
            System.out.println("sefr");
    }
}
