import java.util.Scanner;
public class GCDLCM {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();

        int a=num1;
        int b=num2;
        while (a>0) {
            int rem= a%b;
            b=a;
            a=rem;
            
        }
        int gcd=b;
        int lcm= (num1*num2)/gcd;
        System.out.println("LCM IS" + lcm + "and hcf is :" + gcd);
    }
}