import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        IntStream.range(1, N + 1).forEach(queue::offer);


        while (!queue.isEmpty()) {
            for (int i = 0; i < K; i++) {
                if (i == K -1) {
                    result.add(queue.poll());
                } else {
                    queue.add(queue.poll());
                }
            }
        }

        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() -1) {
                System.out.print(result.get(i));
            } else {
                System.out.print(result.get(i) + ", ");
            }
        }
        System.out.println(">");

    }
}
