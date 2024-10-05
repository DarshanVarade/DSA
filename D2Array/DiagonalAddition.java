package D2Array;
import java.util.*;
public class DiagonalAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];
            if(i != n-i-1){
                sum += matrix[i][n-i-1];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
