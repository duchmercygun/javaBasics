package class05;

import java.util.Scanner;

public class HomeWorkJan7T3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("quiz");
        double quiz=scan.nextDouble();

        System.out.println("midterm");
        double midterm=scan.nextDouble();

        System.out.println("final score");
        double finalScore=scan.nextDouble();

        double averageScore=(quiz+midterm+finalScore)/3;
        System.out.println("averageScore: "+averageScore);


        if (averageScore>=90){
            System.out.println("A");
        }else if (averageScore>=70 && averageScore<90){
            System.out.println("B");
        }else if (averageScore>=50 && averageScore<70){
            System.out.println("C");
        }else if (averageScore<50){
            System.out.println("F");
        }

    }
}
