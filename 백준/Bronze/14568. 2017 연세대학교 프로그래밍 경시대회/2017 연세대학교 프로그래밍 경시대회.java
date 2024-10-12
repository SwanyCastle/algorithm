import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candy = sc.nextInt();

        int result = 0;

        for (int a = 0; a < candy + 1; a++) {
            for (int b = 0; b < candy + 1; b++) {
                for (int c = 0; c < candy + 1; c++) {
                    if (a + b + c == candy) {
                        if (a >= b + 2) {
                            if (a != 0 && b !=0 && c != 0) {
                                if (c % 2 == 0) {
                                    result++;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}
