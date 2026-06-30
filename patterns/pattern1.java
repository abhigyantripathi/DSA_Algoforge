/*
input n=4
*
* *
* * *
* * * *
 */
import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int total_no_of_lines=n;
        int current_no_of_line=1;
        int stars=1;

        while(current_no_of_line<=total_no_of_lines){
            //print stars:
            
            for(int i=1;i<=stars;i++){
                System.out.print("* ");
            }
            System.out.println();
            stars++;

            current_no_of_line++;
        }
    }

    
}
