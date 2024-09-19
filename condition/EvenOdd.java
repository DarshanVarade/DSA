import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();    

        //Even odd without using modulo operator

        if(n==n/2*2){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
        //Even Odd without using if-else

        String type = n%2==0 ? "Even" : "Odd";
        System.out.println(type);
        
        sc.close();

    }
}
