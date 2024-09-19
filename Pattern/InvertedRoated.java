package Pattern;

public class InvertedRoated {
    public static void pattern(int rows,int cols){
        for(int i=1;i<=rows;i++){
            int space = cols-i;
            for(int j=1;j<=cols;j++){
                if(space>0){
                    System.out.print("  ");
                    space--;
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4, 4);
    }
}
