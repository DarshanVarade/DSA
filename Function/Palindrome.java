package Function;
import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rev = rev(n);
        if(n==rev){
            System.out.println("Entered number is palindrome");
        }else{
            System.out.println("Entered number is not a palindrome");
        }
        sc.close();
    }
    public static int rev(int n){
        int rev=0;
        while(n>0){
            int lastDigit = n%10;
            rev=rev*10+lastDigit;
            n/=10;
        }
        return rev;
    }
}