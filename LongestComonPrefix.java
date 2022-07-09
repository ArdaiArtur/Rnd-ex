public class LongestComonPrefix {
    public static void main(String[] args) {
        String []strs={ "flower","flow","flight"};
        longestCommonPrefix(strs);
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        String s=strs[0];
        String ms="";
        for (int i = 1; i <=s.length(); i++) {
            ms=s.substring(0, i);
            for (int j = 0; j < strs.length; j++) {
                if(!ms.equals(strs[j].substring(0, i)))
                return s.substring(0, i-1);
            }
        }
        return ms;

    }
}
