import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        String result = "";

        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(0) != 1 && list.get(0) != 8) {
                result = "mixed";
                break;
            }

            if (list.get(0) == 1) {
                int diff = list.get(i) - list.get(i - 1);
                if (diff != 1) {
                    result = "mixed";
                    break;
                }
                result = "ascending";
            } else if (list.get(0) == 8) {
                int diff = list.get(i - 1) - list.get(i);
                if (diff != 1) {
                    result = "mixed";
                    break;
                }
                result = "descending";
            }
        }

        System.out.println(result);
    }
}
