public class twosum {
    
    public static void main(String[] args) {
        
    }
    public int[] twoSum(int[] numbers, int target) {
        int s=0;
        int j=0;
        for (int i = 0; i < numbers.length; i++) {
            j=i+1;
            s=target-numbers[i];
            while(numbers[j]<=s)
            {
                if(numbers[j]==s)
                {
                    return new int []{i,j};
                }
                j++;

            }
        }
        
        return new int[]{-1,-1};
    }


}
