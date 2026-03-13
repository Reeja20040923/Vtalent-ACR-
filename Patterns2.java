package Vtalent.com.Feb;

public class Patterns2 {
    //diamond
    public static void main(String[] args){
        int size = 10;
        //upper part
        for(int i=1;i<=size;i+=2){
            for(int j=size;j>i;j-=2){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
        //lower part
        for(int i=size-2;i>=1;i-=2){
            for(int j=size;j>i;j-=2){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
