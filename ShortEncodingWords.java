import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ShortEncodingWords {
    public static void main(String[] args) {
        String []s={"time", "me", "bell"};
        minimumLengthEncoding(s);
    }
    public  static int minimumLengthEncoding(String[] words) {
        Set<String> good = new HashSet<>(Arrays.asList(words));
        for (String word: words) {
            System.out.println(word+" word");
            for (int k = 1; k < word.length(); ++k)
                {
                 good.remove(word.substring(k));
                 System.out.println(word.substring(k)+" substring");   
                } 
            }

        int ans = 0;
        for (String word: good)
            ans += word.length() + 1;
        return ans;
    }
}
