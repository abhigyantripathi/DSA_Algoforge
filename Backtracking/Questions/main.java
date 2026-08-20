package Backtracking.Questions;

import java.util.List;

public class main {

    public static void targetSumSubset(int[] arr, int idx, int targetSum, String asf){
        //if(targetSum<0) return; //if we have positive integers

        if(idx==arr.length){
            if(targetSum==0){
                System.out.println(asf);
            }
            return;
        }

        //take the element
        targetSumSubset(arr, idx+1, targetSum-arr[idx], asf + arr[idx] + ",");
        // leave the element
        targetSumSubset(arr, idx+1, targetSum, asf);



    }
    public static void main(String[] args) {
        int[] arr= {2,2,3,11,1,4};
        int target=5;
        targetSumSubset(arr,0, target, "");
        
    }
}
