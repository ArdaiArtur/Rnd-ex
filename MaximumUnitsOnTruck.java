import java.util.Arrays;

public class MaximumUnitsOnTruck {
    public static void main(String[] args) {
        
    }
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
         int fin = 0;
         for(int[] b : boxTypes) {
           int count = Math.min(b[0], truckSize);
           fin += count * b[1];
           truckSize -= count;
           if(truckSize == 0) return fin;
         }
         return fin;
}
}
