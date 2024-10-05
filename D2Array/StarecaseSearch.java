package D2Array;
import java.util.*;

public class StarecaseSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a Matrix: ");
        int n = sc.nextInt(),m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the elements of a Matrix: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the key you want to search: ");
        int key = sc.nextInt();
        starecaseSearch(matrix,key);
        sc.close();
    }
    public static boolean starecaseSearch(int matrix[][],int key){
        int row = matrix.length-1,col = 0;
        while(row>=0 && col <matrix[0].length){
            if(matrix[row][col] == key){
                System.out.println("Key is found at ("+row+","+col+")");
                return true;
            }else if(matrix[row][col]<key){
                col++;
            }else{
                row--;
            }
        }
        System.out.println("Key not found");
        return false;
    }
}
