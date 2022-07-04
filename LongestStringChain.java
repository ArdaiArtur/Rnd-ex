import java.util.Arrays;
import java.util.HashMap;

/**
 * LongestStringChain
 */
public class LongestStringChain {

    public static void main(String[] args) {
        String[] words={"xbc","pcxbcf","xb","cxbc","pcxbc"};
        longestStrChain(words);
    }
    public static int longestStrChain(String[] words) {
        Arrays.sort(words, (String a, String b) -> a.length() - b.length()); // sort by length
        HashMap<String, Integer> dp = new HashMap<>();
    
        int maxPath = 1;
        // same idea behind the previous approach but performed iteratively.
        for (String word: words) {
            int currLength = 1;
            StringBuilder sb = new StringBuilder(word);
            System.out.println(word+"/word");
            for (int i=0; i<word.length(); i++) {
              
                sb.deleteCharAt(i);
                String prevWord = sb.toString();
                
                currLength = Math.max(currLength, dp.getOrDefault(prevWord, 0) + 1); 
                 System.out.println("substring /"+sb+"/lenght /"+currLength);sb.insert(i, word.charAt(i));
            }
            dp.put(word, currLength);
            maxPath = Math.max(maxPath, currLength);
            System.out.println(maxPath+"/MAX/");
        }
    
        return maxPath;
    }
}