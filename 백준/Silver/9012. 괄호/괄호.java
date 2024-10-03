import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      Stack<Character> stack = new Stack<>();

      String vps = br.readLine();
      for (int j = 0; j < vps.length(); j++) {
        char c = vps.charAt(j);
        if(j != vps.length() - 1){
          if(c == '('){
            stack.push(c);
          } else if (c == ')') {
            if(stack.isEmpty()){
              sb.append("NO").append('\n');
              break;
            }
            else if (stack.peek() == '('){
              stack.pop();
            }
            else if (stack.peek() == ')'){
              sb.append("No").append('\n');
              break;
            }
          }
        }
        else if(j == vps.length() - 1){
          if(c == ')'){
            if(stack.size()==1 && stack.peek() == '('){
              sb.append("YES").append('\n');
            }
            else {
              sb.append("NO").append('\n');
            }
          }
          else {
            sb.append("NO").append('\n');
          }
        }
      }
    }
    System.out.println(sb);
  }
}