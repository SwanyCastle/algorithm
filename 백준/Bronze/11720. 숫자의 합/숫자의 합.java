import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split("");


        int sum = 0;

        for (String number : num) {
            sum += Integer.parseInt(number);
        }

        System.out.println(sum);
    }
}
