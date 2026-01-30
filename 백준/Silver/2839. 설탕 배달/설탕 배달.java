import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int five = N / 5; 

        while (five >= 0) {
            int rest = N - (five * 5); 

            if (rest % 3 == 0) {
                int three = rest / 3;
                System.out.println(five + three);
                return;
            }

            five--;
        }

        System.out.println(-1);
    }
}