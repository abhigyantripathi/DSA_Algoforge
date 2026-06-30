import java.util.Scanner;

class NumofDigit{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num=n;
        int digit=0;
        while(num>0){
            num=num/10;
            digit++;
        }
        System.out.println("the number of digits are" + digit);
    }
}