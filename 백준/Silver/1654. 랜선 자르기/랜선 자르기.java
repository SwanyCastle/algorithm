import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arrN = new int[N];
        long maxN = 0;

        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(br.readLine());
            if (arrN[i] > maxN) {
                maxN = arrN[i];
            }
        }

        long min = 1;
        long max = maxN;
        long result = 0;

        while (min <= max) {
            long current = (max + min) / 2;
            long count = 0;

            for (int i = 0; i < N; i++) {
                count += arrN[i] / current;
            }

            if (count >= K) {
                result = current;
                min = current + 1;
            } else {
                max = current - 1;
            }
        }

        System.out.println(result);
        br.close();
    }
}
