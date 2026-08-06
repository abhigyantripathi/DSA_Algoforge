package Recursion.RecursionOnArrays;

import java.util.Scanner;

public class Main {
    public static void printArray(int[] arr, int idx){
        System.out.println(arr[idx]);
        printArray(arr, idx+1);
    }
    public static void printArrayRev(int[] arr, int idx){
        printArrayRev(arr, idx+1);
        System.out.println(arr[idx]);
    }
    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length) return Integer.MIN_VALUE;
        int smallAns= maxOfArray(arr, idx+1);
        int max= Math.max(smallAns, arr[idx]);
        return max;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr= {1,2,3,4,5};
        printArray(arr, 0);

    }
}
