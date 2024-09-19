package Loop;
import java.util.*;
public class Sum_e_o {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int choice=0;
        int evensum=0;
        int oddsum=0;
        do{
            System.out.print("Enter the number: ");
            n=sc.nextInt();
            if(n%2==0){
                evensum+=n;
            }
            else{
                oddsum+=n;
            }
            System.out.println("Do you want to countinue?(Press 1 if Yes)");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("Addition of entered even numbers: "+evensum);
        System.out.println("Addition of entered odd numbers: "+oddsum);
        sc.close();
    }
}
