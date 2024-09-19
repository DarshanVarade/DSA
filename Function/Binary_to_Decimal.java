package Function;
import java.util.*;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the Binary number: ");
        int binary=sc.nextInt();
        binaryToDecimal(binary);
        sc.close();
    }    
    public static void binaryToDecimal(int n){
        int decimal=0;
        int i=0;
        do{
            int lastDigit = n%10;
            decimal+=lastDigit*Math.pow(2,i);
            n/=10;
            i++;
        }while(n>0);
        System.out.println("Decimal equivalent: "+decimal); 
    }
}
