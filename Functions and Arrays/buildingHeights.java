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
        


    }
    public static void main(String[] args) {
        int[] arr={1,2,9,4,5};
        printBuildings(arr);
    }
}
