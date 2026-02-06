package com.vtalent;

public class Duplicates {
    public static void main(String[] args){
        String s = "programming";
        //int n = s.length();

        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(current==s.charAt(j)){
                    System.out.println(current);
                    break;

                }
            }
        }
    }
}
