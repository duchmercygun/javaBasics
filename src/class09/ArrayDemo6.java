package class09;

public class ArrayDemo6 {

    public static void main(String[] args) {

        // create an array and store, 10, 20 ,30 , 4, 5, 6, 7 and 80
        // add all the elements which are multiple of two

        int [] num={10, 20, 30, 4, 5, 6, 7, 80};

        int sum=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2==0){
                sum=sum+num[i];
            }
        }
        System.out.println(sum);
    }
}
