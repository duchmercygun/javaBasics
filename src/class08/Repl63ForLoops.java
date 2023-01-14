package class08;

import java.util.Scanner;

public class Repl63ForLoops {

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);

        System.out.println("Please enter number");

        int x=scan.nextInt();
        for (int i=0; i<x; i++ ){
            System.out.print(i+" ");
        }

    }
}
