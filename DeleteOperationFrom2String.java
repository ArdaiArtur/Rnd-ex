import javax.lang.model.util.ElementScanner14;

public class DeleteOperationFrom2String {
    public static void main(String[] args) {
        
    }
    public int minDistance2(String word1, String word2) {
        int [][]dp=new int [word1.length()+1][word2.length()+1];
        for (int i = 0; i <=word1.length(); i++) {
            for (int j = 0; j <=word2.length(); j++) {
                if(i==0||j==0)
                continue;
                
                if(word1.charAt(i-1)==word2.charAt(j-1))
                dp[i][j]=dp[i-1][j-1]+1;
                else 
                dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return word1.length()+word2.length()-2*dp[word1.length()][word2.length()];

    }

    public int minDistance(String word1, String word2) {
      //wrong :(
        int db=0;
        int []v1=new int[26];
        int []v2=new int[26];
        for (int i = 0; i < word1.length(); i++) {
            v1[word1.charAt(i)-'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            v2[word2.charAt(i)-'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            if(v1[word2.charAt(i)-'a']==0)
            db++;
            else
            {
                v1[word2.charAt(i)-'a']--;     
            }
        }
        for (int i = 0; i < word1.length(); i++) {
            if(v2[word1.charAt(i)-'a']==0)
            db++;
            else
            {
                v2[word1.charAt(i)-'a']--;     
            }
        }
        return db;
    }
}
