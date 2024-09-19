package Arrays;

public class SubArrays{
    public static void printSubArrays(int numbers[]){
        int minSum=Integer.MAX_VALUE,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=numbers[k];
                    System.out.print(numbers[k]+" ");
                }
                System.out.print(" = "+sum);
                if(sum<minSum){
                    minSum=sum;
                }else if(sum>maxSum){
                    maxSum=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Minimum sum : "+minSum+"\nMaximum sum : "+maxSum);
    }
    public static void prefixSum(int numbers[]){
        int prefix[] = new int[numbers.length];
        int sum=0,maxSum=Integer.MIN_VALUE;

        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            prefix[i]= prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                
                sum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum sum : "+maxSum);
    }
    public static void kadaneSumAlgorithm(int numbers[]){
        int sum=0, maxSum=Integer.MIN_VALUE,maxnig=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
            if(sum < 0){
                sum = 0;
            }
            maxSum = Math.max(sum, maxSum);
            maxnig=Math.max(maxnig,numbers[i]);
        }
        if(maxSum>0){
            System.out.println("Maximum sum : " + maxSum);
        }else{
            System.out.println("Maximum sum : " + maxnig);
        }
    }
    
    public static void main(String[] args) {
        //int numbers[]={2,4,6,8,10};               //for all
        //int numbers[]={-2,-3,4,-1,-2,1,5,-3};     //for kadane 
        int numbers[]={-1,-2,-3,-4};                //for kadane negative
        //printSubArrays(numbers);                  //TC = O(n^3)
        //prefixSum(numbers);                       //TC = O(n^2)   
        kadaneSumAlgorithm(numbers);                //TC = O(n)
    }
}