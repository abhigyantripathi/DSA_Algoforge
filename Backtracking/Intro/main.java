package Backtracking.Intro;
import java.util.*;

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
     // Leetcode 51 =========================================
    class Solution {
        public boolean isPossibleToPlaceHere(int row, int col, boolean[][] vis){
            int n = vis.length;

            int[][] dirs = {{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
            // {-1,-1},{-1,0},{-1,1} only these directions are required

            for(int rad=1; rad<n; rad++){
                for(int[] dir: dirs){
                    int nRow = row + rad*dir[0];
                    int nCol = col + rad*dir[1];

                    if(nRow >=0 && nCol >=0 && nRow < n && nCol < n && vis[nRow][nCol] == true){
                        return false;
                    }
                }
            }

            return true;
        }

        public void convertBooleanVisitedToList(boolean[][] vis, List<List<String>> ans){
            List<String> currentAns = new ArrayList<>();

            for(int i=0; i<vis.length; i++){

                String currentRow = "";
                for(int j=0; j<vis.length; j++){
                    if(vis[i][j] == true){
                        currentRow += "Q";
                    } else {
                        currentRow += ".";
                    }
                }

                currentAns.add(currentRow);
            }

            ans.add(currentAns);
        }

        public void NQueens(int row, int n, boolean[][] vis,List<List<String>> ans){
            if(row == n){
                convertBooleanVisitedToList(vis,ans);
                return;
            }

            for(int col=0; col<n; col++){
                if(isPossibleToPlaceHere(row,col,vis) == true){
                    vis[row][col] = true;

                    NQueens(row + 1, n, vis, ans);

                    vis[row][col] = false;
                }
            }
        }

        public List<List<String>> solveNQueens(int n) {
            List<List<String>> ans = new ArrayList<>();
            boolean[][] vis = new boolean[n][n];

            NQueens(0,n,vis,ans);    

            return ans;
        }
    }


    // knight Tour
    public static void printKnightTour(int sr, int sc){
@@ -205,15 +274,132 @@ public static void nQueensOptimized(int row,boolean[] colVis, boolean[]diagVis,
        }
    }

    // Leetcode 52 ========================
    public static void printAllSolutions(int n) {
        boolean[] colVis = new boolean[n];
        boolean[] diagVis = new boolean[2*n-1];
        boolean[] aDiagVis = new boolean[2*n-1];

        nQueensOptimized(0,colVis,diagVis,aDiagVis,"",n);
        nQueensOptimized(0,colVis,diagVis,aDiagVis,"",n);        
    }


    // Leetcode 52 =====================================
    class Solution {
        int ans=0;
        public void nQueensOptimized(int row,boolean[] colVis, boolean[]diagVis, boolean[] aDiagVis, int n){
            if(row == n){
                ans++;
                return;
            }

            for(int col = 0; col < n; col++){
                if(colVis[col] == false && diagVis[col-row+n-1]==false && aDiagVis[row+col] == false){
                    colVis[col] = true;
                    diagVis[col-row+n-1] = true;
                    aDiagVis[row+col] = true;

                    nQueensOptimized(row+1,colVis,diagVis,aDiagVis,n);

                    colVis[col] = false;
                    diagVis[col-row+n-1] = false;
                    aDiagVis[row+col] = false;
                }
            }
        }

        public int totalNQueens(int n) {
            ans = 0;
            boolean[] colVis = new boolean[n];
            boolean[] diagVis = new boolean[2*n-1];
            boolean[] aDiagVis = new boolean[2*n-1];

            nQueensOptimized(0,colVis,diagVis,aDiagVis,n);

            return ans;
        }
    }

    class Solution {
        public int nQueensOptimized(int row,boolean[] colVis, boolean[]diagVis, boolean[] aDiagVis, int n){
            if(row == n){
                return 1;
            }

            int ans = 0;
            for(int col = 0; col < n; col++){
                if(colVis[col] == false && diagVis[col-row+n-1]==false && aDiagVis[row+col] == false){
                    colVis[col] = true;
                    diagVis[col-row+n-1] = true;
                    aDiagVis[row+col] = true;

                    ans += nQueensOptimized(row+1,colVis,diagVis,aDiagVis,n);

                    colVis[col] = false;
                    diagVis[col-row+n-1] = false;
                    aDiagVis[row+col] = false;
                }
            }
            return ans;
        }

        public int totalNQueens(int n) {
            boolean[] colVis = new boolean[n];
            boolean[] diagVis = new boolean[2*n-1];
            boolean[] aDiagVis = new boolean[2*n-1];

            return nQueensOptimized(0,colVis,diagVis,aDiagVis,n);
        }
    }

    // N-Queens Most optimized => O(1 + rec) space, canPlaceHere => O(1) time ==============================
    public int setKthBit(int num, int k){
        int mask = (1 << k);
        int newNum = num | mask;

        return newNum;   
    }

    public int unsetKthBit(int num, int k){
        int mask = ~(1 << k);
        int newNum = num & mask;

        return newNum;
    }

    public boolean ifKthBitIsOn(int num, int k){
        int mask = (1 << k);

        int res = num & mask;
        return res > 0;
    }

    public int nQueensMostOptimized(int row, int colVis, int diagVis, int aDiagVis, int n){
        
        if(row == n){
            return 1;
        }

        int ans = 0;
        for(int col=0; col<n; col++){
            if(ifKthBitIsOn(colVis,col) == false && !ifKthBitIsOn(diagVis,col-row+n-1) && !((aDiagVis & (1 << col + row)) > 0)){
                // visited mark
                colVis = setKthBit(colVis,col);
                diagVis = setKthBit(diagVis,col-row+n-1);
                aDiagVis = aDiagVis | (1 << (row+col));

                ans += nQueensMostOptimized(row+1,colVis,diagVis,aDiagVis,n);

                // unmark
                colVis = unsetKthBit(colVis,col);
                diagVis = diagVis & ~(1 << (col-row+n-1));
                aDiagVis = aDiagVis & ~(1 << (col + row));
            }
        }

        return ans;
    }


    public int totalNQueens(int n) {
        int colVis = 0;
        int diagVis = 0;
        int aDiagVis = 0;

        return nQueensMostOptimized(0,colVis,diagVis,aDiagVis,n);
    }
}
