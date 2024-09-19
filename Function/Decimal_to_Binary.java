package Function;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        decToBi(7);
    }
    public static void decToBi(int dec){
        int binary=0;
        int i=0;
        while(dec>0){
            int r = dec%2;
            binary=binary+(r*(int)Math.pow(10,i));
            dec/=2;
            i++;
        }
        System.out.println(binary);
    }
}
