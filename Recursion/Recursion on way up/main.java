/**
 * main
 */
public class main {


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

    public static void main(String[] args) {

        printStairsPaths(4, "");
    }
}