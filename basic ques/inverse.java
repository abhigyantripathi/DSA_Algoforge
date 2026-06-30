//pos : 4 3 2 1
//num : 3 1 4 2  ===== 3000+100+40+2
// inverse: 4*10^2 + 3*10^0 + 2*10^3 +1*10^1 = 2413
import java.util.Scanner;
public class inverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        int inversedNum=0;
        int pos=1;

        while(num>0){
        int lastDigit=num%10;
        int multiplier=  (int)Math.pow(10, lastDigit-1);
        inversedNum= inversedNum + (pos*multiplier);

        num=num/10;
        pos++;
        }
        System.out.println(inversedNum);
    }
}