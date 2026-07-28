import java.util.Scanner;

public class StringsQuestions {

    public static String compressedString(String s){
        int n= s.length();
        String res= ""+ s.charAt(0);
        int count=1;

        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                if(count>1){
                    res+=count;
                }
                res+=s.charAt(i);
                count=1;
            }

        }
        if(count>1){
            res+=count;
        }

        return res;


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String ans= compressedString(s);
        System.out.println(ans);
        

    }
}
