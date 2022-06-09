/**
 * longestprefix
 */
public class longestprefix {

    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};

    
    }
   

    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        for (int i = strs.length-1; i >0 ; i--) {
             
             
           while(strs[i].indexOf(s)!=0)
           {
               s=s.substring(0,s.length()-1);
               if(s.isEmpty()) return "";
           }
        }
        return s;

    }
}