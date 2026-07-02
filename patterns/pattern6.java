/* n= 2
* * *   * * * 
* *       * * 
*           * 
* *       * * 
* * *   * * * 
*/



import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int total_no_of_lines= 2*n + 1;
        int curr_no_of_line=1;
        int stars=n+1;
        int spaces=1;

        while(curr_no_of_line<=total_no_of_lines){
            //print stars
            for(int i=1;i<=stars;i++){
                System.out.print("* ");
            }
            // print spaces:
            for(int i=1;i<=spaces;i++){
                System.out.print("  ");
            }
            //print stars
            for(int i=1;i<=stars;i++){
                System.out.print("* ");
            }
            //prepare for the next line
            System.out.println();
            if(curr_no_of_line<=n){
                stars--;
                spaces+=2;
            }
            else{
                stars++;
                spaces-=2;
            }
            curr_no_of_line++;
        }
    }
}
