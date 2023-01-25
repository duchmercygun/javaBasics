package class11;

public class D2ArrayEnhancedForLoop {
    public static void main(String[] args) {

        // write a program to print all the elements from this 2D array using Enhanced for loop

        int[][] matrix = {{10, 20, 30},
                          {45, 55, 66},
                          {30, 40, 20, 10, 25}
        };

        //Enhanced for loop
        for (int [] arr: matrix) { // to get the complete 1D array from the 2D array

            for(int number:arr){ // method to pick all the numbers inside 2D array
                System.out.println(number+ " ");
        }
            System.out.println();


        }

                }

}