import java.util.*;
public class pattern14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int stars=1;
        int spaces=2*n -3;
        int total_no_of_lines=n;
        int curr_no_of_line=1;

        while(curr_no_of_line<=total_no_of_lines){
            int num=1;
            for(int i=1;i<=stars;i++){
                System.out.print(num + " ");
                num++;
            }
            num--;
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }

            if(curr_no_of_line==total_no_of_lines){
                stars--;
                num--;
            }
            for(int i=1;i<=stars;i++){
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
            curr_no_of_line++;
            stars++;
            spaces-=2;
        }
    
    }
    
}
