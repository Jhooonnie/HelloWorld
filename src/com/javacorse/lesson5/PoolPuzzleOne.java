package com.javacorse.lesson5;

public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x<4){

            if (x < 1){
                System.out.print("a ");
                System.out.print("noise");
            }

            if (x>1){
                System.out.print("an");
                System.out.print(" oyster");
                x=x+1;

            }
            if (x==1){
                System.out.print("annoys");
            }
            if (x>3){
                x=x-2;
            }
            System.out.println("");
            x=x+1;
        }
    }
}
/*
x>0
x<1





x=x+2;
x=x-2;

x=x-1;

System.out.print(" ");      System.out.print("noys ");
    System.out.print("oise ");
System.out.print("n ");



 */