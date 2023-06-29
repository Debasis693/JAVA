import java.util.Scanner;

public class primeNum {
    public static void isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("Not Prime");
                break;
            }else{
                System.out.println("Prime");
            }
        }
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            isPrime(n);
        }
    }
}
