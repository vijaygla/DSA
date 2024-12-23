public class Leetcode399 {

import java.util.*;

class Solution {
  public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
    Map<String, Map<String, Double>> graph = new HashMap<>();

    // Build the graph
    for (int i = 0; i < equations.size(); i++) {
      String a = equations.get(i).get(0);
      String b = equations.get(i).get(1);
      double value = values[i];

      graph.putIfAbsent(a, new HashMap<>());
      graph.putIfAbsent(b, new HashMap<>());
      graph.get(a).put(b, value);
      graph.get(b).put(a, 1.0 / value);
    }

    double[] results = new double[queries.size()];
    for (int i = 0; i < queries.size(); i++) {
      String c = queries.get(i).get(0);
      String d = queries.get(i).get(1);
      if (!graph.containsKey(c) || !graph.containsKey(d)) {
        results[i] = -1.0;
      } else {
        results[i] = dfs(c, d, new HashSet<>(), graph);
      }
    }

    return results;
  }

  private double dfs(String start, String end, Set<String> visited, Map<String, Map<String, Double>> graph) {
    if (start.equals(end))
      return 1.0;
    visited.add(start);

    for (Map.Entry<String, Double> neighbor : graph.get(start).entrySet()) {
      if (!visited.contains(neighbor.getKey())) {
        double result = dfs(neighbor.getKey(), end, visited, graph);
        if (result != -1.0) {
          return result * neighbor.getValue();
        }
      }
    }

    return -1.0;
  }

}

  public static void main(String[] args) {

  }
}
