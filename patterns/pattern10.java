import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int total_no_of_lines= n;
        int curr_no_of_line=1;
        int stars=1;
        int innerSpace=-1;
        int outterSpace=n/2;


        while(curr_no_of_line<=total_no_of_lines){
            for(int i=0;i<=outterSpace;i++){
                System.out.print(" ");
            }
            
                System.out.print("* ");
        
            for(int i=0;i<=innerSpace;i++){
                System.out.print(" ");
            }

            if(curr_no_of_line!=1 && curr_no_of_line!=total_no_of_lines){
                System.out.print("* ");
            }

            if(curr_no_of_line<=n/2){
                outterSpace--;
                innerSpace+=2;
            }else{
                outterSpace++;
                innerSpace-=2;
            }
            System.out.println();
            curr_no_of_line++;
        }
    }
}
