package class08;

import java.sql.SQLOutput;

public class LoopRecap {
    public static void main(String[] args) {


        System.out.println("----------WHILE LOOPS------------");
        int  number=10;
        while(number>=2){
            System.out.println(number);
            number=-2;
        }

        System.out.println("-------------DO WHILE--------");
        int number2=10;
        do {
            System.out.println(number2);
            number2=number2-2;

        }while (number2>=2);

        System.out.println("--------------FORLOOPS--------------");

        for(int number3=10; number3>=2; number3-=2){
            System.out.println(number3);
        }
    }
}
