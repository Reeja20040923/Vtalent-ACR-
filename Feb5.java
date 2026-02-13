package com.Vtalent;

public class Feb5 {
    public static void main(String[] args){
        int a = 10;
        int b = 25;
        int c = 15;

        if (a>b){
            System.out.println("a is greater than b");
        } else if (b>c) {
            System.out.println("b is greater than c");
        }else if (b>a) {
            System.out.println("b is greater than c");
        }else if (a>c) {
            System.out.println("a is greater");
        } else if (c>b) {
            System.out.println("c is greater");
        }else{
            System.out.println("c is greater");
        }
    }
}
