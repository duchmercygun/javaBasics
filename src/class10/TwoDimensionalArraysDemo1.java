package class10;

public class TwoDimensionalArraysDemo1 {
    public static void main(String[] args) {

        int [][] matrix={{10,20,30,},
                         {55,22,45},
                         {100,200,450},
        };
        System.out.println(matrix[1][1]); // answer 22

        System.out.println("---------------------------");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +" ");

            }
            System.out.println();
        }
    }
}
