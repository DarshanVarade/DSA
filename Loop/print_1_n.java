package Loop;
import java.util.*;

public class print_1_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        while(count<=n){
            System.out.println(count);
            count++;
        }
        sc.close();

    }
}
