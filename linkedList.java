import java.util.LinkedList;
import java.util.Scanner;

public class linkedList {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of LinkedList");
            int t = sc.nextInt();// enter the size of LinkedList
            System.out.println("Enter the number u want to push into Linked List");
            for (int i = 0; i < t; i++) {
                int num = sc.nextInt();// taking input from user
                list.add(num);// adding number to LinkedList
            }
        }
        for (int j = 0; j < list.size(); j++) {
            // get the number present at index j store that number to n
            int n = list.get(j);
            if (n == 3) {
                System.out.println("Number present at index no " + j);
            }
        }
    }
}
