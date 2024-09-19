package Loop;
import java.util.*;

//Sum of first n natural numbers

public class Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int sum = 0;
        while(count<=n){
            sum += count;
            count++;
        }
        System.out.println(sum);
        sc.close();
    }    
}
