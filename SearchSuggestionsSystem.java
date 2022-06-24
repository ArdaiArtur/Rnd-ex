import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem {
    public static void main(String[] args) {
    String[] s={"mobile","mouse","moneypot","monitor","mousepad"};
    String ss="mouse";
    suggestedProducts(s, ss);
    
 }  
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> fin=new ArrayList<>();
        List<String> sub=new ArrayList<String>();
        Arrays.sort(products);
        for (int i = 1; i <=searchWord.length(); i++) {
            String s= searchWord.substring(0, i);
            int count=0;
            int numb=0;
            while(count<3&&numb<products.length)
            {
                
                if(products[numb].length()>=i&&products[numb].substring(0, i).equals(s))
                {System.out.println(products[numb]+" and "+products[numb].substring(0, i)+" and s="+s );
                    sub.add(products[numb]);
                count++;
                }
                numb++;
            }
            fin.add(new ArrayList<String>(sub));
            sub.clear();
        }
            
        return fin;
}
}
