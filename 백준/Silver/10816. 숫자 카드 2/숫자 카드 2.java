import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n1 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> n1Map = new HashMap<>();

        for (int i = 0; i < n1; i++) {
            int num = Integer.parseInt(st.nextToken());
            n1Map.merge(num, 1, Integer::sum);
        }

        int n2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n2; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(n1Map.getOrDefault(num, 0)).append(" ");
        }

        sb.setLength(sb.length() - 1);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
