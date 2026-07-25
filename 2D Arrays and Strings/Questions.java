package 2D Arrays and Strings;

public class Questions {

    public static void printSpiral(int[][] mat){
        int m= mat.length;
        int n= mat[0].length;

        int sr=0; //startrow
        int er=m-1;//endrow
        int sc=0;
        int ec=n-1;


        while(sr<=er && sc<=ec){
            //left wall
            for(int row= sr; row<=er; row++){
                System.out.print(mat[row][sc]);
            }
            sc++;
            //bottm wall

            for(int col= sc; col<=ec; col++){
                System.out.print(mat[col][sc]);
            }
            er--;

            //right wall

            for(int row=er; row>=sr; row--){
                System.out.print(mat[row][sc]);
            }
            ec--;

            //top wall

            for(int col=ec; col>=sc; col--){
                System.out.print(mat[col][sc]);
            }
            sr++;
        }


    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b){
        int r1=a.length;
        int c1= a[0].length;

        int r2=b.length;
        int c2=b[0].length;

        if(c1!=r2){
            System.out.println("mul no possible");
        }

        int[][] res= new int[r1][c2];

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                int currAns=0;
                for(int k=0;k<c1;k++){
                    currAns= a[i][k] * b[k][j];
                    res[i][j]= currAns;
                }
            }
        }
        return res;
    }

    //Search in a Row-Column Sorted

    public static boolean matSearch(int mat[][], int x) {
        // code here
        int m= mat.length;
        int n= mat[0].length;

        int row=0;
        int col=m-1; 
        //another starting point can be 0,n-1:

        while(row<n && col >=0){
            if(mat[row][col]==x){
                return true;
            }
            else if(mat[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }

        return false;

        
    }



    public static void main(String[] args) {
        int[][] a= new int[4][3];
        int[][] b= new int[3][2];

        int[][] res= multiplyMatrices(a,b);

    }
    
}
