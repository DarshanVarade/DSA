package D2Array;
import java.util.*;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows and columns of the given matrix: ");
        int n = sc.nextInt(), m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the matrix: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1; 
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startRow;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){                  //this statement is for the numbers which are printed in the top shoud not be printed again
                    return;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){    //this statement is for the numbers which are printed in the right shoud not be printed again
                if(startCol==endCol){
                    return;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }    
    }
    
}
