
import java.util.Stack;
import java.util.ArrayList;
public class Main {
    public static boolean isDuplicateBracket(String str){
        Stack<Character> st= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);

            if(ch==')'){
                if (st.isEmpty()) {
                    return false;
                }
                if(st.peek()=='('){
                    return true;
                }

            while(!st.isEmpty() && st.peek()!='('){
                st.pop();
            }
            // Remove opening bracket
                if (!st.isEmpty()) {
                    st.pop();
                }

            
        } else{
            st.push(ch);
        }

        }

        return false;

    }

    //=======next greater element==============
    public ArrayList<Integer> nextGreaterElement(int[] arr){

        int n=arr.length;
        int [] ngr= new int[n];

        Stack<Integer> st= new Stack<>(); //we will store elements but its better to store index\
        
        for(int i=n-1; i>=0;i--){
            int currElement= arr[i];
            while(st.size()>0 && st.peek()<=currElement ){
                st.pop();
            }
             if(st.size()==0){
                ngr[i]=-1;
             }else{
                ngr[i]=st.peek();
             }
             st.push(currElement);

        }
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(ngr[i]);
        }


        return res;
    }

    //=======next greater element============== moving from L TO R
    public ArrayList<Integer> nextGreaterElement(int[] arr){
        int n=arr.length;
        int [] ngr= new int[n];
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<n;i++){
            int currElement=arr[i];
            while(st.size()>0 && st.peek()< currElement){
                ngr[st.peek()]=currElement;
                st.pop();
            }
            st.push(i);
        }

        while (st.size()>0) {
            ngr[st.peek()]=-1;
            
        }
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(ngr[i]);
        }
        return res;
    }


    //prev smaller element moving from Left to right

    public ArrayList<Integer> prevSmallerElement(int[] arr){
        int n=arr.length;
        int[] psm= new int[n];
        Stack<Integer> st= new Stack<>();
        st.push(-1);
        for(int i=0;i<n;i++){
            int currElement=arr[i]
            while (st.peek()!=-1 && st.peek()>=currElement) {
                st.pop();
                
            }
            psm[i]=st.peek();
            st.push(currElement);

        }
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(psm[i]);
        }
        return res;
    }



    public static void main (String[] args){
        String str = "((a+b)+c) - (d+f)))))";

        boolean isDuplicate= isDuplicateBracket(str);

        if(isDuplicate){
            System.out.println("duplicate bracs");
        }
        else{
            System.out.println("not duplicate bracs");
        }

    }
    
}
