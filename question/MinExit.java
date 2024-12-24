import java.util.LinkedList;
import java.util.Queue;

public class MinExit {
  class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
      int m = maze.length;
      int n = maze[0].length;
      int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
      Queue<int[]> q = new LinkedList<>();
      q.offer(new int[] { entrance[0], entrance[1], 0 });
      maze[entrance[0]][entrance[1]] = '+';

      while (!q.isEmpty()) {
        int[] curr = q.poll();
        int row = curr[0];
        int col = curr[1];
        int steps = curr[2];

        for (int[] direction : directions) {
          int newRow = row + direction[0];
          int newCol = col + direction[1];

          if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && maze[newRow][newCol] == '.') {
            if (newRow == 0 || newRow == m - 1 || newCol == 0 || newCol == n - 1) {
              return steps + 1;
            }
            maze[newRow][newCol] = '+';
            q.offer(new int[] { newRow, newCol, steps + 1 });
          }
        }
      }
      return -1;
    }
  }

  public static void main(String[] args) {

  }
}
