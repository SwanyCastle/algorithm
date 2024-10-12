import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[6];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }

        int resultX = 0;
        int resultY = 0;

        for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000; y++) {
                if ((numArr[0] * x) + (numArr[1] * y) == numArr[2]
                    && (numArr[3] * x) + (numArr[4] * y) == numArr[5]) {
                    resultX = x;
                    resultY = y;
                    break;
                }
            }
        }

        System.out.println(resultX + " " + resultY);

    }
}
