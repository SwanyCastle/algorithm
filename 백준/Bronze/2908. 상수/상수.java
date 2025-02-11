import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] num1Arr = st.nextToken().split("");
        String[] num2Arr = st.nextToken().split("");

        int num1 = 0 , num2 = 0;

        for (int i = 0; i < num1Arr.length; i++) {
            int digits = (int) Math.pow(10, i);
            num1 += (digits * Integer.parseInt(num1Arr[i]));
            num2 += (digits * Integer.parseInt(num2Arr[i]));
        }

        System.out.println(Math.max(num1, num2));
    }
}
