
import java.util.*;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int total_no_of_lines=2*n + 1;
        int current_no_of_line=1;

        int stars=1;
        int spaces=n;
        int startNum=1;

        while (current_no_of_line<=total_no_of_lines) {
            for(int i=1;i<=spaces;i++){
                System.out.print("  ");
            }
            int num=startNum;
            for(int i=1;i<=stars;i++){
                System.out.print(num + " ");
                if(i<=stars/2){
                    num++;
                }
                else{
                    num--;
                }
            }


            System.out.println();
            if(current_no_of_line<=n){
                spaces--;
                stars+=2;
                startNum++;
            }
            else{
                spaces++;
                stars-=2;
                startNum--;
            }
            current_no_of_line++;
            
        }
    }
}
