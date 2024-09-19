package BasicSorting;

public class bubbleSort {
    public static void bubblesort(int arr[]){      
        for(int turn=0;turn<arr.length-1;turn++){
            Boolean swap =false;

            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap =  true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

    public static void displayArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubblesort(arr);
        displayArray(arr);
    }
}
