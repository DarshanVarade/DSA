package Arrays;
import java.util.*;
public class patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =0;
        for(int i=1;i<=6;i++){
            n=2*n+1;
            System.out.println(n);
        }
        System.out.println("Enter the number: ");
        int m = sc.nextInt();
        int count = 0;
        while(m>0){
            count++;
            m=m/10;
        }
        System.out.println(count);
        sc.close();
    }
}
