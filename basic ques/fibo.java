import java.util.*;
public class fibo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int prevPrev=0;
        int prev=1;
        for(int i=1;i<=n-2;i++){
            int curr= prev+prevPrev;
            prevPrev=prev;
            prev=curr;
        }
        System.out.println("Nth term of fibonacci series of" + n + "terms is :" + prev);
    }
    
}
