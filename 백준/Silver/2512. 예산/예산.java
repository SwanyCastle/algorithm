import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] requiredBudgetArray = new int[N];
        int maxRequiredBudget = 0;
        for (int i = 0; i < N; i++) {
            requiredBudgetArray[i] = Integer.parseInt(st.nextToken());
            maxRequiredBudget = Math.max(maxRequiredBudget, requiredBudgetArray[i]);
        }

        int totalBudget = Integer.parseInt(br.readLine());

        int min = 0;
        int max = maxRequiredBudget;
        int result = 0;

        while (min <= max) {
            int mid = (max + min) / 2;
            int sum = 0;

            for (int budget : requiredBudgetArray) {
                sum += Math.min(budget, mid);
            }

            if (sum <= totalBudget) {
                result = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(result);
    }
}
