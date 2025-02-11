import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());

            String[] quiz = st.nextToken().split("");
            int score = 0;
            int preScore = 0;

            if (quiz[0].equals("O")) {
                score += 1;
                preScore = 1;
            }

            for (int j = 1; j < quiz.length; j++) {;
                if (quiz[j].equals("O")) {
                    if (quiz[j - 1].equals("O")) {
                        score += (preScore + 1);
                        preScore = preScore + 1;
                    } else {
                        score += 1;
                        preScore = 1;
                    }
                } else {
                    preScore = 0;
                }
            }
            sb.append(score).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
