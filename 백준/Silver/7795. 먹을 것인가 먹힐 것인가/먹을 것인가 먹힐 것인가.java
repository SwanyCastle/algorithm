import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int[] aArray = new int[Integer.parseInt(st.nextToken())];
            int[] bArray = new int[Integer.parseInt(st.nextToken())];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < aArray.length; j++) {
                aArray[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < bArray.length; j++) {
                bArray[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(bArray);

            int result = 0;

            for (int aNum : aArray) {
                int min = 0;
                int max = bArray.length - 1;
                int count = 0;

                while (min <= max) {
                    int mid = (max + min) / 2;

                    if (bArray[mid] < aNum) {
                        min = mid + 1;
                        count = mid + 1;
                    } else {
                        max = mid - 1;
                    }
                }
                result += count;
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }
}
