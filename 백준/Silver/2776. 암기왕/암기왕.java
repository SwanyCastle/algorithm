import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  // 빠른 출력

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int totalDiary1Number = Integer.parseInt(br.readLine());
            HashSet<Integer> diary1Set = new HashSet<>(); // HashSet 사용 (탐색 O(1))

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < totalDiary1Number; j++) {
                diary1Set.add(Integer.parseInt(st.nextToken()));
            }

            int totalDiary2Number = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < totalDiary2Number; j++) {
                int num = Integer.parseInt(st.nextToken());
                bw.write((diary1Set.contains(num) ? "1" : "0") + "\n");  // 빠른 출력
            }
        }

        bw.flush();
        bw.close();
    }
}
