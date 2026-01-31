import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scores = new int[N];
        int max = 0;

        for (int i = 0 ; i < N ; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if (scores[i] > max) max = scores[i];
        }

        double sum = 0 ;

        for (int i = 0 ; i < N ; i++) {
            sum += scores[i] * 100.0 / max;
        }

        double avg = sum / N;

        System.out.println(avg);
    }
}