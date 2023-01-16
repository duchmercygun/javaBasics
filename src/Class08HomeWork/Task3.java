package Class08HomeWork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is the start of the range?");
        int startRange = scan.nextInt();
        System.out.println("What is the end of the range?");
        int endRange = scan.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = startRange; i <= endRange; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("The sum of all even numbers: " + evenSum);
        System.out.println("The sum of all odd numbers: " + oddSum);
    }
}
