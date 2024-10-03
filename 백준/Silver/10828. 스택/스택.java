import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stack = new Stack<>();
    int n = Integer.parseInt(st.nextToken());

    for(int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      String x= st.nextToken();
      if(x.equals("push")){
        int y = Integer.parseInt(st.nextToken());
        stack.push(y);
      }
      else if(x.equals("pop")){
        if(stack.isEmpty()){
          sb.append(-1).append("\n");
        }else {
          sb.append(stack.peek()).append("\n");
          stack.pop();
        }
      }
      else if (x.equals("size")){
        sb.append(stack.size()).append("\n");
      }
      else if(x.equals("empty")){
        if(stack.isEmpty()){
          sb.append(1).append("\n");
        }
        else{
          sb.append(0).append("\n");
        }
      }
      else if(x.equals("top")){
        if(stack.isEmpty()){
          sb.append(-1).append("\n");
        }
        else{
          sb.append(stack.peek()).append("\n");
        }
      }
    }
    System.out.println(sb);
  }
}