package class10;

public class EnhancedForLoop2 {

    public static void main(String[] args) {

        // print odd numbers

        int [] arr={10, 13, 20, 25, 45, 50};

        for (int i = 0; i < arr.length; i++) {
            if( arr[i]%2!=0){
                System.out.println(arr[i]);
            }

        }
    }}
