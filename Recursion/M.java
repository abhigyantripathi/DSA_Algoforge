package Recursion;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
    }
    
}
public static void TOH(int n, int A, int C, int B){
    if(n==0) return;

    TOH(n-1,A, B, C);

    System.out.println("moving disk " + n + "from" + A + "to" + C);

    TOH(n-1, B, C, A);
}