import java.util.Scanner;

public class evenodd {
    public static void isEven(int n){
        if(n%2==0){
           System.out.println("even");
        }else{
          System.out.println("odd");
        }
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            isEven(n);
        }
    }
}
