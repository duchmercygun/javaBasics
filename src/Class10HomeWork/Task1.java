package Class10HomeWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] numbers=new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("The sum of all the numbers is " + sum);
    }
}
