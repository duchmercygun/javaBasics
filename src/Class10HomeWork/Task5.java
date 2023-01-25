package Class10HomeWork;

public class Task5 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[i][j] % 2 == 0) {
                    sumEven += arr[i][j];
                } else {
                    sumOdd += arr[i][j];
                }
            }
        }

        System.out.println("The sum of even numbers is " + sumEven + " and the sum of odd numbers is " + sumOdd);
    }
}
