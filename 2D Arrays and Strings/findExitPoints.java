public class findExitPoints {

    public static int[] findExitPoints(int[][] arr){
        int m= arr.length;
        int n= arr[0].length;
        int row=0;
        int col=0;
        int dir=0;

        while(row>=0 && row<m  && col>=0 && col<n){
            if(arr[row][col]==1){
                arr[row][col]=0;
                dir=(dir+1)%4;
            }
            if(dir==0) col++;
            if(dir==1) row++;
            if(dir==2) col--;
            else{
                row--;
            }
        }
        
        if(dir==0)
            col++;
        else if(dir==1)
            row++;
        else if(dir==2)
            col--;
        else
            row--;


        return new int[] {row,col};

    }

    public static void main(String[] args) {
        
    }
}
