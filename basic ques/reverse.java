import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int n=num;
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=rev*10 + lastDigit;
            n=n/10;
        }
        System.out.println(rev);
    }
    
}
