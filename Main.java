package Vtalent.com.Feb;

import java.util.Scanner;

class InvalidMarkException extends Exception{
    InvalidMarkException(String message){
        super(message);
    }
}
class StudentMarks{
    void validateMarks(int marks[]) throws InvalidMarkException{
        for(int i=0;i<marks.length;i++){
            if(marks[i]<0||marks[i]>100){
                throw new InvalidMarkException("Error: Invalid Mark Found");
            }
        }
        System.out.println("Valid Marks");
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n];
        for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }
        StudentMarks sm = new StudentMarks();
        try{
            sm.validateMarks(marks);
        }
        catch(InvalidMarkException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}