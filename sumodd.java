import java.util.Scanner;

public class sumodd {
    public static void sumOdd(int num) {
        // initialize sum as 0
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                // Add the odd number
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Taking input upto which u have to print sum of odd num
            int num = sc.nextInt();
            sumOdd(num);
        }
    }
}
