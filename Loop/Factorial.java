package Loop;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int n = sc.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        System.out.println("\nFactorial of given number is: "+fac);
        sc.close();
    
    }
}
