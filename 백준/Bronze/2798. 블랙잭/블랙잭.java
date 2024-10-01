import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int[] arr = new int[a];
    int result = 0;

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < a; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for(int i = 0; i < arr.length-2; i++) {
      for(int j = i+1; j < arr.length-1; j++) {
        for(int k = j+1; k < arr.length; k++) {
          if(arr[i] + arr[j] + arr[k] <= b && arr[i] + arr[j] + arr[k] > result ) {
            result = arr[i] + arr[j] + arr[k];
          }
        }
      }
    }
    System.out.println(result);
  }
}