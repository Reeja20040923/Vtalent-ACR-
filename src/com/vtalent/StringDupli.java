package com.vtalent;

public class StringDupli {
    public static void main(String[] args){
        String s = "swiss";

        for(int i=0;i<s.length();i++){
            boolean isRepeat = false;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    isRepeat = true;
                    break;
                }
            }
            if(!isRepeat){
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println("No Repeating character found");
    }
}
