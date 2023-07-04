import java.util.Scanner;

public class Twodarrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number of rows");
            int rows = sc.nextInt();
            System.out.println("enter the number of columns");
            int cols = sc.nextInt();
            // storing the number of rows and colums in num array
            int[][] num = new int[rows][cols];
            System.out.println("Enter the number");
            // Taking input the rows and columns
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    num[i][j] = sc.nextInt();
                }
            }
            // Output
            System.out.println("u have entered");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(num[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
