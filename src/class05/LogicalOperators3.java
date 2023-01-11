package class05;

public class LogicalOperators3 {
    public static void main(String[] args) {

        if(10>5 || 4>6){
            System.out.println("1");
        }else{
            System.out.println("2");
        }

        String names="Adam";
        int age=31;
        if (names.equals("Adam")&& age==30) {
            System.out.println("You are the Adam from Batch 13");
        }else{
            System.out.println("i don't know you");
        }

        boolean isTrue=false;
        boolean condition=!isTrue;

        System.out.println(condition);

        if (isTrue) {
            System.out.println(!isTrue);
        }else {
            System.out.println("Need more practice");
        }
    }
}
