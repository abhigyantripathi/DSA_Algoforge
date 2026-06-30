import java.util.*;;
public class roatateAnum {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int k=sc.nextInt();
    int len=0;
    int temp=n;
    while(temp>0){
        temp=temp/10;
        len++;
    }
    k=k%len;
    if(k<0){
        k=k+len;
    }
    int div= (int)(Math.pow(10, k));
    int mul= (int)(Math.pow(10, len-k));
    int lastDigits= temp % div;
    int frontDigits= temp/div;

    int roatateAnum= lastDigits*mul + frontDigits;
    System.out.println(roatateAnum);

}
    
}