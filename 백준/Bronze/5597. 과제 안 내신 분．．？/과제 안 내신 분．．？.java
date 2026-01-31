import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] submitted = new boolean[31]; // 1~30

        for (int i=0; i<28; i++) {
            int n = Integer.parseInt(br.readLine());
            submitted[n] = true;
        }

        for (int i=1; i<=30; i++) {
            if (!submitted[i]) {
                System.out.println(i);
            }
        }
    }
}