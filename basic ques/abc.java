import java.util.*;
class Prime{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no.");
        int n= sc.nextInt();
        boolean isPrime= true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime= false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the number is not prime");
        }

    }
}