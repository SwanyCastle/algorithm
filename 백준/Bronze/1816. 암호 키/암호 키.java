import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        String[] answer = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            long number = sc.nextLong();
            answer[i] = "YES";

            for (int j = 2; j < 1_000_000; j++) {
                if (number % j == 0) {
                    answer[i] = "NO";
                    break;
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }       
    }
}