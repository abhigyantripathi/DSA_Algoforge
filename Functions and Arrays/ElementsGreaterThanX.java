import java.util.Scanner;

public class ElementsGreaterThanX {
    public static int countElementGreaterThanX(int[] arr, int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int[] arr= new int[n];


        System.out.println("enter" + n + "elements of the array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter val of X");
        int x= sc.nextInt();


        int res= countElementGreaterThanX(arr,x);

        System.out.println(res);

    }
}
