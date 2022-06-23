import java.util.Arrays;

public class KthLergestElementInAnArray {
    public static void main(String[] args) {
        
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k-1];
    }
}
