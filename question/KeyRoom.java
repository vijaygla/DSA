import java.util.List;
import java.util.ArrayList;

public class KeyRoom {
  public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
    boolean[] visited = new boolean[rooms.size()];
    dfs(rooms, 0, visited);
    for (boolean v : visited) {
      if (!v)
        return false;
    }
    return true;
  }

  private static void dfs(List<List<Integer>> rooms, int room, boolean[] visited) {
    visited[room] = true;
    for (int key : rooms.get(room)) {
      if (!visited[key]) {
        dfs(rooms, key, visited);
      }
    }
  }

  public static void main(String[] args) {
    List<List<Integer>> rooms = new ArrayList<>();
    rooms.add(List.of(1));
    rooms.add(List.of(2));
    rooms.add(List.of(3));
    rooms.add(new ArrayList<>());

    System.out.println(canVisitAllRooms(rooms)); // Output: true
  }
}
