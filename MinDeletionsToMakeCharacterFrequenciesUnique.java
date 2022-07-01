import java.util.HashMap;
import java.util.HashSet;

public class MinDeletionsToMakeCharacterFrequenciesUnique {
  public static void main(String[] args) {
    
  } 
  public int minDeletions(String s) {
        int[] ar=new int[24];
        for (char c : s.toCharArray()) {
            ar[c-'a']++;
        }
        HashSet<Integer> hs=new HashSet<Integer>();
        int db=0;
        for (int i : ar) {
            if(i!=0)
            if(!hs.contains(i))
            {
                hs.add(i);
            }
            else
            {
                while(hs.contains(i) || i>0)
                {
                    i--;
                    db++;
                }
                hs.add(i);
            }
        }
        return db;
}
}
