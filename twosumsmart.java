/**
 * twosumsmart
 */
public class twosumsmart {

    public static void main(String[] args) {
        
    }

    public int[] smarttwosum(int[] nbs,int trg) {
        int i=0,j=nbs.length;
        while(i<j)
        {
            if(i+j==trg) return new int []{i,j};
            if(i+j>trg) j--;
            else i++;
        }

        return new int[]{-1,-1};
    }
}