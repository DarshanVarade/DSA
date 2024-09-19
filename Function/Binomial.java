package Function;
import java.util.*;
public class Binomial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n': ");
        int n = sc.nextInt();
        System.out.print("Enter the value of 'r': ");
        int r = sc.nextInt();
        binCoeff(n,r);
        sc.close();
    }
    public static void binCoeff(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int binomialCoefficient=fact_n/(fact_r*(fact_nmr));
        System.out.println("Binomial Coefficient : "+binomialCoefficient);
    }
    public static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
}
