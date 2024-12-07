public class ProvincesCountDFS {

  public static int findCircleNum(int[][] isConnected) {
    int provincesCount = 0;
    boolean[] visited = new boolean[isConnected.length];

    for (int i = 0; i < isConnected.length; i++) {
      if (!visited[i]) {
        dfs(isConnected, visited, i);
        provincesCount++;
      }
    }
    return provincesCount;
  }

  private static void dfs(int isConnected[][], boolean visited[], int j) {
    for (int i = 0; i < isConnected.length; i++) {
      if (isConnected[i][j] == 1 && !visited[i]) {
        visited[i] = true;
        dfs(isConnected, visited, i);
      }
    }
  }

  public static void main(String[] args) {
    int isConnected[][] = {{1,1,0},{1,1,0},{0,0,1}};
    int result = findCircleNum(isConnected);

    System.out.print("OUTPUT: "+result);
  }
}
