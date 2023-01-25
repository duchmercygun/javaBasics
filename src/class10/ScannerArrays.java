package class10;

import java.util.Arrays;
import java.util.Scanner;
public class ScannerArrays {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] numbers=new int[5];

        numbers[0]= scan.nextInt();
        numbers[1]= scan.nextInt();
        numbers[2]= scan.nextInt();
        numbers[3]= scan.nextInt();
        numbers[4]= scan.nextInt();

        System.out.println("---------------------------");

        //below code loop uses a normal for loop to ask the user for input from the user

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
    }
}
