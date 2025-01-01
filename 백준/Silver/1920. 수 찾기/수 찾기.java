import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countN = sc.nextInt();
        List<Integer> nList = new ArrayList<>();

        for (int i = 0; i < countN; i++) {
            nList.add(sc.nextInt());
        }

        int countM = sc.nextInt();
        List<Integer> mList = new ArrayList<>();

        for (int i = 0; i < countM; i++) {
            mList.add(sc.nextInt());
        }

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < countM; i++) {
            resultList.add(0);
        }

        Collections.sort(nList);

        for (int i = 0; i < countM; i++) {
            int currentMinIndex = 0;
            int currentMaxIndex = countN - 1;

            while (currentMinIndex <= currentMaxIndex){
                int findIndex = (currentMinIndex + currentMaxIndex) / 2;
                if (mList.get(i).equals(nList.get(findIndex))) {
                    resultList.set(i, 1);
                    break;
                } else if (mList.get(i) > nList.get(findIndex)) {
                    currentMinIndex = findIndex + 1;
                } else {
                    currentMaxIndex = findIndex - 1;
                }
            }
        }

        for (Integer result : resultList) {
            System.out.println(result);
        }
    }
}