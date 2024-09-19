import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int n1=sc.nextInt(),n2=sc.nextInt();
        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);
        
        switch (operator) {
            case '+':
                System.out.println(n1+n2);                
                break;
            case '-':
                System.out.println(n1-n2);                
                break;
            case '*':
                System.out.println(n1*n2);                
                break;
            case '/':
                System.out.println(n1/n2);                
                break;
            case '%':
                System.out.println(n1%n2);
                break;
            default:
                System.out.println("Wrong input!!!");
                break;
        }
        sc.close();
    }
}
