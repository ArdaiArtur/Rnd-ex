/**
 * NonDecreasingArray
 */
public class NonDecreasingArray {

    public static void main(String[] args) {
        
    }
    public static boolean checkPossibility(int[] nums) {
        int db=0;
      for (int i = 1; i < nums.length; i++) {
          if(nums[i-1]>nums[i])
          { db++;
              if(i<2 || nums[i-2] <= nums[i])
                  nums[i-1] = nums[i];
                   else
                  nums[i] = nums[i-1];
          }
     
          if(db>1) return false;
      }
      return true;
  }
}