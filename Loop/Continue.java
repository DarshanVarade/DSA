package Loop;
import java.util.*;
public class Continue {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter your number: ");
            int num=sc.nextInt();
            if(num % 10 == 0){
                continue;
            }
            System.out.println("Entered number is: " + num);
        }while(true);
    }
}
