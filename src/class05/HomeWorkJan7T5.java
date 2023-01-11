package class05;

import java.util.Scanner;

public class HomeWorkJan7T5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter input 1");
        double  input1=scan.nextDouble();
        System.out.println("Enter input 2");
        double input2=scan.nextDouble();
        System.out.println("enter input 3");
        double input3=scan.nextDouble();

        if(input1>input2 && input1>input3) {
            System.out.println("The largest number is " +input1 );
        }else if(input2>input1 && input2>input3){
            System.out.println("The largest number is " +input2);
        }else{
            System.out.println("The largest number is " +input3);
        }


    }
}
