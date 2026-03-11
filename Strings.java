package Vtalent.com.Feb;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.matches("\\d+")){
            System.out.println("String contains only digits");
        }
        else{
            System.out.println("String doesn't contain only digits");
        }
        sc.close();
    }
}
