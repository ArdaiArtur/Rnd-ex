public class DeleteOperationFrom2String {
    public static void main(String[] args) {
        
    }
    public int minDistance(String word1, String word2) {
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
