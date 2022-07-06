import java.util.HashSet;

public class LongestConsecutiveSequence {
 public static void main(String[] args) {
    

 }  
 public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        int legtot=0;
        for (int in : hs) {
            if(!hs.contains(in-1))
            {
                int curr = in;
                int currleng=1;
                while (hs.contains(curr)) {
                    curr+=1;
                    currleng+=1;
                }
            legtot=Math.max(legtot, currleng);
                
            }
        }
        return legtot;
}
}
