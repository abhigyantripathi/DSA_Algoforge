package HashMap and Heap.HashMap.Questions;
import java.util.HashMap;
public class questions {
    public static void main(String[] args){

        public static char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character, Integer> mp= new  HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);

            if(mp.containsKey(ch)==false){
                mp.put(ch,1);
            }
            else{
                int olderFreq= mp.get(ch);
                mp.put(ch, olderFreq+1);
            }
        }

        char ans='\0';

        int maxFreq=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);

            if(mp.get(ch) > maxFreq){
                ans=ch;
                maxFreq=mp.get(ch);
            }
            else if(mp.get(ch) == maxFreq && ans>ch){
                ans=ch;
            }
        }

        return ans;
        
    }
    //leetcode 349
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp= new HashMap<>();
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(mp.containsKey(nums1[i])==false){
                mp.put(nums1[i],1);
            }
            else{
                mp.put(nums1[i], mp.get(nums1[i])+1);
            }
        }

        for(int i=0;i<nums2.length;i++){
            if(mp.containsKey(nums2[i])){
                ans.add(nums2[i]);
                mp.remove(nums2[i]);
            }
        }

        int[] res= new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
    //return ans.stream().mapToInt(i -> i).toArray()
        return res;
    }




    }
