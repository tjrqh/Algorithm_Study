import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < n; i++) {
            int s = 0;
            int e = n - 1;

            while (s < e) {
                int sum = arr[s] + arr[e];
                if (sum == arr[i]) {
                    if (s != i && e != i) {
                        count++;
                        break;
                    } else if (s == i) {
                        s++;
                    } else if (e == i) {
                        e--;
                    }
                } else if (sum < arr[i]) {
                    s++;
                } else if (sum > arr[i]) {
                    e--;
                }

            }
        }
        System.out.println(count);
    }
}

