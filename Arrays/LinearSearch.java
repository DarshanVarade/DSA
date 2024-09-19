package Arrays;

public class LinearSearch {
    public static int linearSearch(int numbers[],int key){
        for(int i=1;i<=numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int linearSearchString(String arr[],String value){
        for(int i=1;i<=arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //int numbers[]={2,4,6,8,10,12,14};
        //int key=10;
        //int index = linearSearch(numbers, key);

        String arr[]={"dosa","aalu chips","samosa","kachori"};
        String value = "samosa";
        int index = linearSearchString(arr, value);

        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is found at array index : "+index);
        }
    }
}
