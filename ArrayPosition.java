package Vtalent.com.Feb11;

import java.util.Scanner;

public class ArrayPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        int elmt = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==elmt){
                System.out.println("The position of the element : " +(arr[i+1]));
                found = true;
                break;
            }

        }
        if(!found){
            System.out.println("Element not found");
        }
        sc.close();
    }
}
