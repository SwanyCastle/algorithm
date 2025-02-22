import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ballCnt = Integer.parseInt(st.nextToken());
        int testCase = Integer.parseInt(st.nextToken());

        int[] balls = new int[ballCnt];

        for (int i = 0; i < ballCnt; i++) {
            balls[i] = i + 1;
        }

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());

            int ball1 = Integer.parseInt(st.nextToken());
            int ball2 = Integer.parseInt(st.nextToken());
            int temp = balls[ball1 - 1];
            balls[ball1 - 1] = balls[ball2 - 1];
            balls[ball2 - 1] = temp;
        }

        for (int i = 0; i < balls.length; i++) {
            sb.append(balls[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
