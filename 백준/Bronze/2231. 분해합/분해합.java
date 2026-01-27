import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static int decompositionSum(int x) {
        int sum = x;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;

        for (int i = 1; i <= N; i++) {
            if (decompositionSum(i) == N) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}