package D2Array;
import java.util.*;
public class LargestNSmallest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length,m = matrix[0].length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum : "+max);
        System.out.println("Maximum : "+min);
        sc.close();
    }
}
