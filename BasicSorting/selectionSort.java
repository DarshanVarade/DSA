package BasicSorting;

public class selectionSort {
    
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smlPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smlPos]>arr[j]){       //arr[smlPos]>arr[j] for ascending order
                    smlPos = j;               //arr[smlPos]<arr[j] for descending order
                } 
            }
            int temp = arr[smlPos];
            arr[smlPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void displayArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionsort(arr);
        displayArray(arr);
    }
}

