import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LongestSubstring {
    public static void main(String[] args) {
        String s="abcabcbb";
       System.out.println( lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int max=0;
        Queue<Character> hs=new LinkedList<Character>();
        for (char ch : s.toCharArray()) {
         if(!hs.contains(ch))
         {
             hs.add(ch);
             max=Math.max(max, hs.size());
         }   
         else
         {  
             
            while(hs.contains(ch))
            {
            hs.remove();
            }
            hs.add(ch);
         }
         System.out.println(hs.size());
        }
        return max;
    }

}
