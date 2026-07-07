import java.util.*;
public class nCr {

    public static int fact(int num){

        int res=1;
        for(int mul=1;mul<=num;mul++){
            res=res*mul;
        }
        return res;

    }
    public static int findNcR(int n, int r){
        int nFac= fact(n);
        int rFac= fact(r);
        int NminusRFac= fact(n-r);
        int nCrRes= nFac / (rFac*NminusRFac);
        return nCrRes;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int n= sc.nextInt();
        int r= sc.nextInt();
        
        int result= findNcR(n,r);
        System.out.println("result is: " +  result);
    }

    
}