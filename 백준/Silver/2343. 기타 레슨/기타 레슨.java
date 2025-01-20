import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arrM = new int[n];
        int maxM = 0;
        int sumM = 0;

        for (int i = 0; i < n; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
            maxM = Math.max(maxM, arrM[i]);
            sumM += arrM[i];
        }

        int min = maxM;
        int max = sumM;
        int result = 0;

        while (min <= max) {
            int mid = (max + min) / 2;
            int count = 1;
            int sum = 0;

            for (int i = 0; i < n; i++) {
                if (sum + arrM[i] > mid) {
                    sum = arrM[i];
                    count += 1;
                } else {
                    sum += arrM[i];
                }
            }

            if (count <= m) {
                result = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(result);
    }
}
