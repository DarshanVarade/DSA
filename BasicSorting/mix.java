package BasicSorting;

public class mix {

    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Bubble sort: ");
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smlPos = i;
            for(int j=i;j<arr.length;j++){
                if(arr[smlPos]>arr[j]){
                    smlPos = j;
                }
            }
            int temp = arr[smlPos];
            arr[smlPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("\nSelection sort: ");
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.println("\nInsertion sort: ");
    }
    public static void displayArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        int arr1[] = {5,4,1,3,2};
        int arr2[] = {5,4,1,3,2};
        bubbleSort(arr);
        displayArray(arr);
        selectionSort(arr1);
        displayArray(arr1);
        insertionSort(arr2);
        displayArray(arr2);
    }
}
