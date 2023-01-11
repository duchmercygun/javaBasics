package class06;

import java.util.Scanner;

public class WhileLoops2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int number=1;
        int sum=0;
        while (number<=5) {
            sum=sum+number;
            number++;}
        System.out.println(sum);
    }
}



