public class reverseArrayInPlace {
    public static void reverseArray(int[] arr){
        int n=arr.length;
        //int i=0;
        //int j=n-1;

        /* while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;

        }
            */

        //using for loop:
        for(int ele=0;ele<n/2;ele++){
            //ele swap with n-1-ele
            int temp=arr[ele];
            arr[ele]=arr[n-1-ele];
            arr[n-1-ele]=temp;


        }

    }
    public static void main(String[] args) {
        int[] arr={10,9,3,7,11};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
