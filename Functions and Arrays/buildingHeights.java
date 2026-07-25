public class buildingHeights {
    public static void printBuildings(int[] arr){
        int n=arr.length;
        int maxHeight= Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int currBuildingHeight= arr[i];


            maxHeight= Math.max(currBuildingHeight,maxHeight);


        }

        int total_no_of_lines= maxHeight;

        int currFloor= total_no_of_lines;

        while(currFloor>0){
            //goto every building and check if current floor is there
            for(int i=0;i<n;i++){
                int currBuildingHeight= arr[i];

                if(currFloor<= currBuildingHeight){
                    System.out.print("* ");
                }

            }





            //prepare for next line
            System.out.println();
            currFloor--;
        }
    }

    public static int[] addTwoArray(int[] arr1, int[] arr2){
        int n1= arr1.length;
        int n2= arr2.length;

        int resSize= Math.max(n1, n2) +1;
        int[] res= new int[resSize];

        int i= arr1.length-1;
        int j= arr2.length-1;

        int k= res.length-1;

        int carry=0;

        while(k>=0){
            int csum=0;

            if(i>=0){
                csum+=arr1[i];
            }

            if(j>=0){
                csum+=arr2[j];
            }
            csum+=carry;

            if(csum>9){
                csum=csum%10;
                carry=1;
            }
            else{
                carry=0;
            }

            res[k]=csum;

            i--;
            j--;
            k--;

        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,9,4,5};
        printBuildings(arr);
    }
}
