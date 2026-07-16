import java.util.Scanner;

public class SpanOfArray {
    public static int findspan(int[] arr){
        //find max of array
        if(arr.length==0){
            return -1;
        }
        int maxEle= Integer.MIN_VALUE;
        int minEle= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> maxEle){
                maxEle=arr[i];
            }
            if(arr[i]<minEle){
                maxEle=arr[i];
            }
        }
        int span= maxEle-minEle;
        return span;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();

        int[] arr= new int[n];

        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans= findspan(arr);
        System.out.println(ans);
    }
}
