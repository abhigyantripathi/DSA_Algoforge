import java.util.Scanner;

/**
 * main
 */
public class main {





    public static int maximumPathSum(int[][] grid, int sr,int sc){
        int m= grid.length;
        int n=grid[0].length;
        int rightMaxSum=0;
        int downMaxSum=0;

        if(sr==m-1 && sc==n-1) {//INVALID STATE
            return grid[sr][sc];
        }

        if(sc+1<n){
            rightMaxSum= maximumPathSum(grid, sr, sc+1);
        }
        if(sr+1<n){
            downMaxSum= maximumPathSum(grid, sr+1, sc);
        }
        int ans= Math.max(rightMaxSum, downMaxSum) + grid[sr][sc];
        return ans;

    }
    public static void printEncodings(String str, String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        //we can take one char at a time
        int firstNum=str.charAt(0) - '0';

        if(firstNum==0){
            return;
        }
        char convertedLetter= (char)('a' + (firstNum-1));
        String smallerString= str.substring(1);
        printEncodings(smallerString, asf + convertedLetter);

        //we can take two char at a time
        if(str.length()>=2){
            String first2Letters= str.substring(0,2);
            int first2Num=Integer.parseInt(first2Letters);

            if(first2Num<=26){
                convertedLetter= (char)('a' + (first2Num-1));
                smallerString=str.substring(2);

                printEncodings(smallerString, asf +convertedLetter);
            }
        }

    }


   /*
     public static void printMazePaths(int sr, int sc, int dr, int dc, String psf){
        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc ){
            System.out.println(psf + ",");
        }
        printMazePaths(sr, sc+1, dr, dc, psf + "h");
        printMazePaths(sr+1, sc+1, dr, dc, psf + "v");

    }



    public static void printStairsPaths(int n, String psf){
         if(n < 0){
            return;
        }

        if(n == 0){
            System.out.println(psf);
            return;
        }

        printStairsPaths(n-1, psf + "1");
        printStairsPaths(n-2, psf + "2");
        printStairsPaths(n-3, psf + "3");
    }
    }
*/
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //printStairsPaths(4, "");

        //printEncodings("1234", "");
        int[][] grid1= {{3,6,1}, {2,3,4}, {5,5,1}};

        int maxSum= maximumPathSum(grid1, 0, 0);
        System.out.print(maxSum);
    }
}