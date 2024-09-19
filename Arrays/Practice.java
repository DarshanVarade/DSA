package Arrays;

public class Practice {

    public static boolean duplicate(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static int findgtarget(int numbers[],int target){
        int start=0,end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==target){
                return mid;
            }else if(numbers[mid]>target){
                end = mid - 1; 
            }else if(numbers[mid]<target){
                start = mid + 1;
            }else{
                return -1;
            }
        }
        return -1;
    }
    public static int trappedWater(int numbers[]){
        int maxLeft[] = new int[numbers.length];
        int maxRight[] = new int[numbers.length];
        maxLeft[0]=numbers[0];
        maxRight[numbers.length-1]=numbers[numbers.length-1];
        for(int i=1;i<numbers.length;i++){
            maxLeft[i] = Math.max(maxLeft[i-1], numbers[i]);
        }
        for(int i=numbers.length-2;i>=0;i--){
            maxRight[i] = Math.max(maxRight[i+1], numbers[i]);
        }
        int Water=0;
        for(int i=0;i<numbers.length;i++){
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            Water += waterLevel-numbers[i];
        }
        return Water;
    }

    public static void main(String[] args) {
        //int numbers[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        //System.out.println(duplicate(numbers));

        // int numbers[] = {4, 5, 6, 7, 0, 1, 2};
        // int target = 0;
        // System.out.println(findgtarget(numbers, target));

        // int numbers[] ={4, 2, 0, 3, 2, 5}; //{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        // System.out.println(trappedWater(numbers));

        

    }
}
