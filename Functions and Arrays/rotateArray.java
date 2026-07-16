public class rotateArray {
    public static void reverseArray(int[] arr, int left, int right){
        int n=arr.length;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;

        }

    }
    public static void rotateRight(int[] arr, int n, int k){
        k=k%n;
        if(k<0){
            k+=n;
        }
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int n=arr.length;
        int k=2;

        rotateRight(arr, n, k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
