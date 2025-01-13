import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Integer.parseInt(st.nextToken());
        long Y = Integer.parseInt(st.nextToken());

        long winRate = Y * 100 / X;
        if (winRate >= 99) {
            System.out.println(-1);
            return;
        }

        long min = 1;
        long max = X;
        long result = -1;

        while (min <= max) {
            long current = (max + min) / 2;
            long currentWinRate = (Y + current) * 100 / (X + current);

            if (currentWinRate > winRate) {
                result = current;
                max = current - 1;
            } else {
                min = current + 1;
            }

        }

        System.out.println(result);
        br.close();
    }
}
