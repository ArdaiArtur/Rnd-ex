public class MinOperationsToZero {
    
    public static void main(String[] args) {
        
    }
    public int minOperations(int[] nums, int x) {
        
      int max=-1;
      int sum=0;
      for (int i = 0; i < nums.length; i++) {
        sum+=nums[i];
      }
      //sum-x 
        int left=0;
        int cursum=0;
        int right;
      for (right = 0; right < nums.length; right++) {
         cursum+=nums[right];
      
         while(left<=right && cursum>sum-x)
        {
            cursum-=nums[left];
            left++;
        }   
        if(cursum==sum-x)
        max=Math.max(max, right-left+1);
    }
    return max==-1? -1:nums.length-max;
    }
}
