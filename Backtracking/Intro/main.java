package Backtracking.Intro;

public class main {
    public static void floodFill(int row, int col, int n, int m, int[][] matrix, boolean[][] visited, String psf){
        if(row < 0 ||col < 0  || row >= n || col >=m || visited[row][col] == true || matrix[row][col] == 1){
            return;
        }

        if(row == n-1 && col == m-1){
            System.out.println(psf);
            return;
        }

        visited[row][col] = true; // so that we are not visiting any cells of current recursive path again

        // 4 recursive calls
        floodFill(row-1, col, n, m, matrix, visited, psf + "t");
        floodFill(row, col-1, n, m, matrix, visited, psf + "l");
        floodFill(row+1, col, n, m, matrix, visited, psf + "d");
        floodFill(row, col+1, n, m, matrix, visited, psf + "r");

        

        visited[row][col] = false; // backtracking -> will allow current cell to be part of some other recursive path 
    }

    public static void printVisitedMatrix(boolean[][] vis){
        for(int i=0;i<vis.length;i++){
            for(int j=0;j<vis[0].length;j++){
                if(vis[i][j]==true){
                    System.out.print("(" + i + "," + j + ")");
                }
            }
        }
    }
    public static boolean isPossibleToPlaceHere(int row, int col, boolean[][] vis) {
        int n=vis.length;
        int[][] dirs={{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
        for(int radius=1 ; radius<n ; radius++){
            for(int[] dir: dirs){
            int nRow= row+ radius * dir[0];
            int nCol= col+ radius * dir[1];
            if(nRow>=0 && nCol>=0 && nRow<n && nCol<n && (vis[nRow][nCol]==true)){
                return false;
            }

            }


        }

        return true;
        
    }

    public static void NQueens(int row, int n, boolean[][] vis) {
        if(row==n){
            printVisitedMatrix(vis);
            return;
        }



        for(int col=0;col<n;col++){
            if(isPossibleToPlaceHere(row,col,vis)==true){
                vis[row][col]=true;
            }
            NQueens(row+1, n, vis);


            vis[row][col]=false;
        }
        
    }




    public static void main(String[] args){
       /*
        int[][] matrix = {{0,0,0,1,0},{0,1,0,1,0},{0,0,0,0,0},{0,1,0,1,0},{0,1,0,1,0},{0,0,0,1,0}};
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[][] visited= new boolean[][];
        floodFill(0, 0, n, m, matrix, visited, "");

        */
       
       int n=4;
       boolean[][] vis= new boolean[n][n];
       NQueens(0,n,vis);

    }
    
}
