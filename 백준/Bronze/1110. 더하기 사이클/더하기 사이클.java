import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int firstNum = N / 10;
        int lastNum = N % 10;
        int sumN = Integer.MIN_VALUE;
        int count = 0;

        while (sumN != N) {
            int newLastNum = (firstNum + lastNum) % 10;
            firstNum = lastNum;

            sumN = (firstNum * 10) + newLastNum;

            firstNum = sumN / 10;
            lastNum = sumN % 10;
            count++;
        }

        System.out.println(count);
    }
}
