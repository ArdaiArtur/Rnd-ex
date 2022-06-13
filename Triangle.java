import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle=new ArrayList<List<Integer>>() ;
            List<Integer> list=new ArrayList<Integer>();
            list.add(2);
            triangle.add(list);
            list.clear();
            list.add(3);list.add(4);
            triangle.add(list);
            list.clear();
            list.add(6);list.add(5);list.add(7);
            triangle.add(list);
            list.clear();
            list.add(4);list.add(1);list.add(8);list.add(3);
            triangle.add(list);
            list.clear();
            System.out.println(minimumTotal(triangle));
            
      
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int sum=0;
        sum=triangle.get(0).get(0);
        for (int i = 1, j=1; i < triangle.size(); i++) {
            if(triangle.get(i).get(i-j)<triangle.get(i).get(i-j+1))
            {
                sum+=triangle.get(i).get(i-j);
            }
            else
            {
                sum+=triangle.get(i).get(i-j+1);
                j--;
            }
            j++;
        }
        return sum;
        }
    }

