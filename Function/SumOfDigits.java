package Function;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sumOfDigits(n);
        sc.close();
    }
    public static void sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum +=lastDigit;
            n/=10;
        }
        System.out.print("Sum of Digits : "+sum);
    }
}
