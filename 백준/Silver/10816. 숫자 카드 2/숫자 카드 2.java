import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n1 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] m1 = new int[n1];

        Map<Integer, Integer> n1Map = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            int num = Integer.parseInt(st.nextToken());
            m1[i] = num;
            n1Map.compute(num, (k, n) -> (n == null ? 0 : n) + 1);
        }

        Arrays.sort(m1);

        int n2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n2; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (customBinarySearch(m1, num)) {
                sb.append(n1Map.get(num)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean customBinarySearch(int[] arr, int target) {
        int minIdx = 0;
        int maxIdx = arr.length - 1;

        while (maxIdx >= minIdx) {
            int currentIdx = (maxIdx + minIdx) / 2;
            if (arr[currentIdx] == target) {
                return true;
            } else if (arr[currentIdx] > target) {
                maxIdx = currentIdx - 1;
            } else {
                minIdx = currentIdx + 1;
            }
        }

        return false;
    }
}
