package Loop;
import java.util.*;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which table you want: ");
        int n = sc.nextInt();
        System.out.println("Multiplication Table of "+n);
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
        sc.close();
    }
}
