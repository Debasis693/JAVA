import java.util.*;
public class calculator {
    public static void main(String[] args){
       try (Scanner sc = new Scanner(System.in)) {

           System.out.println("enter first number");
           int num1 = sc.nextInt();

           System.out.println("enter second number");
           int num2 = sc.nextInt();
           
           System.out.println("enter +, -,*,/");
           String operator = sc.next();

           switch(operator){
            case "+": System.out.println(num1+num2);
            break;
            case "-": System.out.println(num1-num2);
            break;
            case "*": System.out.println(num1*num2);
            break;
            case "/": System.out.println(num1/num2);
            break;
            default: System.out.println("Invalid");
           }
    }
    }
}
