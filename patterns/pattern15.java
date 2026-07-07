import java.util.*;
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int stars=n;
        int spaces=0;
        int total_no_of_lines=n;
        int curr_no_of_line=1;

        while(curr_no_of_line<=total_no_of_lines){
            //print spaces
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }



            //print stars
            for(int i=1;i<=stars;i++){
                if(curr_no_of_line!=1 && curr_no_of_line <= n/2 && i>1 && i<stars){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }



            //prep for next line
            if(curr_no_of_line<=n/2){
                spaces++;
                stars-=2;
            }
            else{
                spaces--;
                stars+=2;
            }
            System.out.println();
            curr_no_of_line++;
        }
    
    }
    
}
