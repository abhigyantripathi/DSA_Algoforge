import java.util.Scanner;

class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num=n;
        int sum=0;
        while(num>0){
            //getting the last digit
            int r= num%10;
            sum+=r;
            //removing the last digit
            num=num/10;
        }
        System.out.println(sum);
        
    }
}