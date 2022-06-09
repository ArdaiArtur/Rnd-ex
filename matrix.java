public class matrix {
    
    public static void main(String[] args) {
        
        int[][] foo = new int[][] {
            new int[] { 1, 2, 3 },
            new int[] { 1, 2, 3, 4},
        };
        int[][] fo = new int[foo[0].length][foo.length];
        for (int i = 0; i < fo.length; i++) {
            for (int j = 0; j < fo[0].length; j++) {
                fo[i][j]=foo[j][i];
            }
        } 
            
        for (int i = 0; i < fo.length; i++) {
            for (int j = 0; j < fo[0].length; j++) {
                System.out.print(fo[i][j]);
            }
            System.out.println(" ");
        }
    }
    public void NumMatrix(int[][] matrix) {
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        
        return  1;
    }

}
