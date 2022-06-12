import java.util.HashSet;

public class MaximumErasureValue {
    public static void main(String[] args) {
        
    }
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer>hs=new HashSet<Integer>();
        int max=0;
    
    int sum=0;
    for (int r = 0,l=0; r < nums.length; r++) {
       
        while(!hs.add(nums[r]))
        {
           sum-=nums[l];
           hs.remove(nums[l++]);
          
        }
         sum+=nums[r];
         max=Math.max(max, sum);
    }
   return max;
    
    }
    
}
