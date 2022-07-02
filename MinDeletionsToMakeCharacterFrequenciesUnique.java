import java.util.HashSet;

public class MinDeletionsToMakeCharacterFrequenciesUnique {
  public static void main(String[] args) {
    String s="aaabbbcc";
    minDeletions(s);
  } 
  public static int minDeletions(String s) {
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
                while(hs.contains(i) && i>0)
                {
                    System.out.println(i);
                    i--;
                    db++;
                }
                System.out.println(i+"+");
                hs.add(i);
            }
        }
        return db;
}
}
