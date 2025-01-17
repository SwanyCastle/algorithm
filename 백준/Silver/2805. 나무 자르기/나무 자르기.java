import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int treeCount = Integer.parseInt(st.nextToken());
        int treeLength = Integer.parseInt(st.nextToken());

        int[] cutTrees = new int[treeCount];
        int maxTreeLength = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < treeCount; i++) {
            cutTrees[i] = Integer.parseInt(st.nextToken());
            maxTreeLength = Math.max(maxTreeLength, cutTrees[i]);
        }

        long min = 0;
        long max = maxTreeLength;
        long result = 0;

        while (min <= max) {
            long mid = (max + min) / 2;
            long sumRemainTree = 0;

            for (int cutTree : cutTrees) {
                if (cutTree > mid) {
                    sumRemainTree += (cutTree - mid);
                }
            }

            if (treeLength > sumRemainTree) {
                max = mid - 1;
            } else {
                result = mid;
                min = mid + 1;
            }
        }

        System.out.println(result);
    }
}
