import java.util.Scanner;

public class BinaryToDecimal {
    public static int convertToDecimal(int binaryNum){
        int res=0;
        int pow2=1;
        while(binaryNum>0){
            int lastDigit= binaryNum%10;

            int decimal= lastDigit*pow2;

            res+=decimal;
            binaryNum/=10;
            pow2*=2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int binaryNum= sc.nextInt();

        int decimalNum= convertToDecimal(binaryNum);
        System.out.println( decimalNum);
    }
}
