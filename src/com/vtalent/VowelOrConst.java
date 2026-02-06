package com.vtalent;

import java.util.Scanner;

public class VowelOrConst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Input letter is a vowel " + ch);
                break;
            default:
                if(Character.isLetter(ch)){
                    System.out.println("Given is consonant " + ch);
                }
                else{
                    System.out.println("Given is not a letter");
                }
                break;
        }
        sc.close();




    }
}
