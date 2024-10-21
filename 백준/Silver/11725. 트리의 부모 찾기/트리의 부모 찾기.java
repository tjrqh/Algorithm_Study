import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 노드의 개수

        // 인접 리스트 구성
        ArrayList<Integer>[] tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        // tree 에 값 넣기
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            tree[num1].add(num2);
            tree[num2].add(num1);
        }

        // dfs
        int[] parent = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        visited[1] = true;
        while (!stack.isEmpty()) {
            int cur = stack.pop();

            for (int child : tree[cur]) {
                if (!visited[child]) {
                    stack.push(child);
                    parent[child] = cur;
                    visited[child] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }
    }
}
