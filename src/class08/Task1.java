package class08;

public class Task1 {

    public static void main(String[] args) {


        boolean summer=true;
        int temp=75;

        while (summer && temp<=105) {
            if(temp<=100) {
                System.out.println("I love summer because Temperature is " +temp);
            }else {
                System.out.println("It's very hot " +temp);

            }temp+=5;

        }
    }
}
