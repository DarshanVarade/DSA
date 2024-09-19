package Loop;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){//here we run the loop till underroot n instade of n-1 because of the repitating factors   
            if(n%i==0){
                //n is multiple of i(that is not 1 or n hence it not a prime number)
                isPrime=false;
                break;  
            }
        }
        if(isPrime==true){
            System.out.println("Entered number is Prime");
        }else{
            System.out.println("Entered number is not a Prime ");
        }
        sc.close();
    }
}
