import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N1 = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] M1 = new int[N1];

        for (int i = 0; i < N1; i++) {
            M1[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(M1);

        int N2 = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N2; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (customBinarySearch(M1, num)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean customBinarySearch(int[] array, int target) {
        int minIdx = 0;
        int maxIdx = array.length - 1;

        while (maxIdx >= minIdx) {
            int currentIdx = (maxIdx + minIdx) / 2;
            if (array[currentIdx] == target) {
                return true;
            } else if (array[currentIdx] > target) {
                maxIdx = currentIdx - 1;
            } else {
                minIdx = currentIdx + 1;
            }
        }

        return false;
    }
}
