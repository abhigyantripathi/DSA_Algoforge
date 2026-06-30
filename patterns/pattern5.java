

/*  n=3
 
      *                        spaces=3, stars=1
    * * *                      spaces=2, stars+=2 i.e 3
  * * * * *                    spaces=1, stars+=2 i.3 5
* * * * * * *                  spaces=0, stars+=2 i.3 7       yha tk space-- and stars+=2  
  * * * * *                    spaces=1, stars-=2 i.3 5
    * * *                      spaces=2, stars-=2 i.3 3
      *                        spaces=3, stars-=2 i.3 1


*/

import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int total_no_of_lines=2*n + 1;
        int current_no_of_line=1;

        int stars=1;
        int spaces=n;

        while (current_no_of_line<=total_no_of_lines) {
            for(int i=1;i<=spaces;i++){
                System.out.print("  ");
            }

            for(int i=1;i<=stars;i++){
                System.out.print("* ");
            }

            System.out.println();
            if(current_no_of_line<=n){
                spaces--;
                stars+=2;
            }
            else{
                spaces++;
                stars-=2;
            }
            current_no_of_line++;
            
        }
    }
}
