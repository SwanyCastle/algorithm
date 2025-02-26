import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[][] paper = new int[100][100];

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x - 1; j < x + 9; j++) {
                for (int k = y - 1; k < y + 9; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < paper.length; i++) {
            for (int j = 0; j < paper[0].length; j++) {
                sum += paper[i][j];
            }
        }

        System.out.println(sum);
    }
}
