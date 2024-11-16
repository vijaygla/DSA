public class _2352EqualRowAndColumnPairs{

    public static void main(String args[]) {
        
    }
    
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                boolean isTrue = true;
                for (int i = 0; i < n; i++) {
                    if (grid[r][i] != grid[i][c]) {
                        isTrue = false;
                        break;
                    }
                }
                if (isTrue) {
                    count++;
                }
            }
        }
        return count;
    }
}
