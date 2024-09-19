package Pattern;

public class NumberPyramid {
    public static void numPyramid(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
            }
            System.out.println();
            num++;
        }
    }
    public static void main(String[] args) {
        numPyramid(5);
    }
}
