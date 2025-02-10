import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
    
        int[] count = new int[26];
    
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }
    
        int max = -1;
        char ch = '?';
    
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                ch = (char)(i + 'A');
            }
            else if (count[i] == max) {
                ch = '?';
            }
        }
    
        System.out.println(ch);
    }
}
