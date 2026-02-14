package Vtalent.com.Feb11;

import java.util.Scanner;

public class CountElmt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n==0){
            count = 1;
        }
        else{
            while(n>0){
                n = n/10;
                count++;
            }
        }
        System.out.println("Number of digits in the given number : " +count);
        sc.close();
    }
}
