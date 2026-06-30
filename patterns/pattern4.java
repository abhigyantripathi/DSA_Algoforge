/*
* * *
  * *
    *
*/
import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int total_no_of_lines=n;
        int current_no_of_line=1;

        int stars=n;
        int spaces=0;

        while (current_no_of_line<=total_no_of_lines) {

            // print spaces
            for(int i=1;i<=spaces;i++){
                System.out.print("  ");
            }
            
            // print stars
            for(int i=1;i<=stars;i++){
                System.out.print("* ");
            }

         //prepare for next line:
            System.out.println();
            stars--;
            spaces++;
            current_no_of_line++;
            
        }
    }
    
}
