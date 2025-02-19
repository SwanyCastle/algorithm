import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Person {
    int weight, height, grade;

    Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int kg = Integer.parseInt(st.nextToken());
            int cm = Integer.parseInt(st.nextToken());

            personList.add(new Person(kg, cm));
        }

        for (Person target : personList) {
            for (Person person : personList) {
                if (target.height < person.height && target.weight < person.weight) {
                    target.grade += 1;
                }
            }
            target.grade++;
        }

        for (Person person : personList) {
            sb.append(person.grade).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
