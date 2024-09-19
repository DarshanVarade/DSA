package Arrays;

public class ArrayPass {
    public static void update(int marks[],int n){
        n = 10;
        for(int i=0;i<marks.length;i++){
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
        int marks[]={87,89,92};
        int n=5;
        update(marks,n); //when we pass an 'array' it goes 'by reference' and when we pass a 'veriable' is goes 'by value'.
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println(n);
    }
}
