import java.util.*;
public class Main {


    public static int[] findAllIndices(int[] arr, int target, int idx, int fsf //foundsofar){
        if(idx=arr.length){
            int[] baseArray= new int[fsf];
            return baseArray;
        }
        int[] arr;
        if(arr[idx]==target){
            ans= findAllIndices(arr, target, idx+1, fsf+1);
        }
        else{
            ans= findAllIndices(arr, target, idx+1, fsf);
        }


        if(arr[idx]==target){
            ans[fsf]=idx;
        }
        return ans;

    }


    public static int findLastIndex(int[] arr, int target, int idx){
        if(idx==arr.length) return -1;
        int furtherLastIndex= findLastIndex(arr, target, idx+1);
        if(furtherLastIndex==-1 && arr[idx]==target){
            return idx;
        }
        return furtherLastIndex;
    }

    public static int findFirstIndex(int[] arr, int target, int idx){
        if(idx==arr.length) return -1;
        if(arr[idx]==target){
            return idx;
        }
        int furtherFirstIndex= findFirstIndex(arr, target, idx+1);
        return furtherFirstIndex;
    }

    public static ArrayList<String> getKeypadCombinantions(){
        
    }
    public static ArrayList<String> getStairsPaths(int n){


        if(n<0){ //no ans from here
            ArrayList<String> Baseans= new ArrayList<>();
            return Baseans;

        }

        if(n==0){ // " " empty string 
            ArrayList<String> Baseans= new ArrayList<>(); 
            Baseans.add(" ");

            return Baseans;
        }
        ArrayList<String> oneStepPaths= getStairsPaths(n-1);
        ArrayList<String> twoStepPaths= getStairsPaths(n-2);
        ArrayList<String> threeStepPaths= getStairsPaths(n-3);

        ArrayList<String> allPaths= new ArrayList<>();

        //adding 1:
        for(String path: oneStepPaths){
            allPaths.add("1" + path);
        }
        //adding 1:
        for(String path: twoStepPaths){
            allPaths.add("2" + path);
        }
        //adding 1:
        for(String path: threeStepPaths){
            allPaths.add("3" + path);
        }


        return allPaths;
    }



    public static ArrayList<String> getSubsequences(String str){


        if(str.length()== 0){
           ArrayList<String> Baseans= new ArrayList<>(); 
           Baseans.add(" ");

           return Baseans;
        }
        ArrayList<String> ans= new ArrayList<>();

        char firstChar= str.charAt(0);
        String smallerString= str.substring(1);
        List<String> smallerAns = getSubsequences(smallerString);

        //first char said no
        for(String sub: smallerAns){
            ans.add(sub);
        }

        for(String sub: smallerAns){
            ans.add(firstChar+ sub);
        }

        return ans;


    }
    public static void main(String[] args) {

        System.out.println(getSubsequences("abc"));
    }
}
