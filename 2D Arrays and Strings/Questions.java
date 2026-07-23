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

    public static void main(String[] args) {
        
    }
    
}
