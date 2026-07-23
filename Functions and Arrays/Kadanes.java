public class Kadanes {

    //leetcode 53
    public static  int  MaxSubArray(int[] arr){
        int meh=0;
        int maxSum=Integer.MIN_VALUE;
        int maxSumSi=-1;
        int maxSumEi=-1;

        int currentStart=0;
        
        for(int i=0;i<arr.length;i++){
            meh+=arr[i];
            maxSum= Math.max(maxSum, meh);
            maxSumSi=currentStart;
            maxSumEi=i;

            if(meh<0){
                meh=0;
                currentStart=i+1;
            }
        }
        return maxSum;

    }

    public static void main(String[] args){
        
    }
}