package class08;

public class ContinueKeyDemo {
    public static void main(String[] args) {

        for(int i=0; i<10; i++) {
            if (i%3==0) {
                continue; //skip the if condition
            }else{
                System.out.println(i);
            }System.out.println("Hello Java");
        }

        System.out.println("-----different method for i%3==0------------");

        for(int i=0; i<10; i++) {
            if (i==3 || i==6 || i==9 ) {
                continue; //skip the if condition
            }else{
                System.out.println(i);
            }System.out.println("Hello Java");
        }


    }
}
