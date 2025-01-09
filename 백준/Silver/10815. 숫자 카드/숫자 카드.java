import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N1 = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> M1 = new ArrayList<>();

        for (int i = 0; i < N1; i++) {
            M1.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(M1);

        int N2 = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N2; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (Collections.binarySearch(M1, num) >= 0) {
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
}
