import java.util.*;
public class LeapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        
        boolean a = (year%4) == 0;
        boolean b = (year%100) != 0;
        boolean c = ((year%100 == 0) && (year%400 == 0));
            
        if(a && (b||c)){
            System.out.println("Entered year is a leap year!");
        }else{
            System.out.println("Entered year is not a leap year!");
        }

        sc.close();
    }
}