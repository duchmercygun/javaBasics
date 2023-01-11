package repls;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you need a loan?");
        boolean loan = scanner.nextBoolean();
        int score=0;
        if (loan) {
            System.out.println("What is your credit score?");
             score=scanner.nextInt();
        } else if (score < 600) {
            System.out.println("The eligibility is Not eligible");
        } else if (score == 600 && score <= 700) {
            System.out.println("The eligibility is Maybe eligible");
        } else if (score == 701 && score <= 800) {
            System.out.println("The eligibility is Eligible");
        } else if (score > 800) {
            System.out.println("The eligibility is Definitely eligible");
        } else {
            System.out.println("Unknown");
        }


    }
}
