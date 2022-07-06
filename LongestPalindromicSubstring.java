public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s="babadaad";
        
       System.out.println( longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        int n = s.length(), start = 0, end = 0;
        boolean[][] dp = new boolean[n][n];
    
        for (int len=0; len<n; len++) {
            for (int i=0; i+len<n; i++) {
                System.out.println(s.charAt(i)+" and "+s.charAt(i+len));
                dp[i][i+len] = s.charAt(i) == s.charAt(i+len) && (len < 2 || dp[i+1][i+len-1]);

                if (dp[i][i+len] && len > end - start) {
                    start = i;
                    end = i + len;
                }
                System.out.println(start+" and "+end);
            }
            System.out.println("new len"+len);
        }
        return s.substring(start, end + 1);
    }
    public static boolean IP(String s)
    {
        String pl ="";
        for (int i = s.length();i>0; i--) {
            pl+=s.substring(i-1, i);
        }
        if(s.equals(pl))
        {
        return true;
        }
        else
        return false;
    }
}
