package Pattern;

public class InvertedNumbers {
    public static void invertedNumbers(int n){
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=n;j>=i;j--){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedNumbers(5);
    }
}
