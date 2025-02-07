import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Top {
    int index;
    int height;

    Top(int index, int height) {
        this.index = index;
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Top> topStack = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            int top = Integer.parseInt(st.nextToken());

            while (!topStack.isEmpty()) {
                if (topStack.peek().height >= top) {
                    sb.append(topStack.peek().index).append(" ");
                    break;
                }
                topStack.pop();
            }

            if (topStack.isEmpty()) {
                sb.append(0).append(" ");
            }

            topStack.push(new Top(i, top));
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
