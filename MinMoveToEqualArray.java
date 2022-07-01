import java.util.Arrays;

public class MinMoveToEqualArray {
    public static void main(String[] args) {
        
    }

    class Solution {
        public int minMoves2(int[] nums) {
            Arrays.sort(nums);
        int tot = 0, mid = nums[nums.length/2];
        for (int num: nums) tot += Math.abs(mid - num);
        return tot;
        }
    }
}
