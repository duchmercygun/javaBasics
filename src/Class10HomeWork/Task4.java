package Class10HomeWork;

public class Task4 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
