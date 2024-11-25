import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int n, m, v;
  static int[][] arr;
  static boolean[] visited;
  static Queue<Integer> queue = new LinkedList<>();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    v = Integer.parseInt(st.nextToken());
    arr = new int[n+1][n+1];
    visited = new boolean[n+1];

    for(int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      arr[a][b] = arr[b][a] = 1;
    }

      dfs(v);
      sb.append("\n");
      visited = new boolean[n+1];
      bfs(v);
    System.out.println(sb);
  }
  public static void dfs(int i) {
    visited[i] = true;
    sb.append(i).append(" ");
    for(int j = 1; j <= n; j++) {
      if(!visited[j] && arr[i][j] == 1) {
        dfs(j);
      }
    }
  }
  public static void bfs (int i) {
    queue.add(i);
    visited[i] = true;

    while(!queue.isEmpty()) {
      int v = queue.poll();
      sb.append(v).append(" ");

      for(int j = 1; j <= n; j++) {
        if(arr[v][j] == 1 && !visited[j]) {
          queue.add(j);
          visited[j] = true;
        }
      }
    }
  }
}

/*
해답 : O
dfs는 이전에 문제를 참고하여 풀었으며 bfs는 해설을 보았다.
dfs에서는 시작점 v를 가장 먼저 주었으며
 */