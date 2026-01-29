import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int repaintCount(char[][] board, int sr, int sc) {
        int countStarW = 0;
        int countStarB = 0; 

        for (int r = sr; r < sr + 8; r++) {
            for (int c = sc; c < sc + 8; c++) {

                char expectedW = ((r+c) % 2 == 0) ? 'W' : 'B';
                char expectedB = ((r+c) % 2 == 1) ? 'W' : 'B';

                if (board[r][c] != expectedW) countStarW++;
                if (board[r][c] != expectedB) countStarB++;
            }
        }

        return Math.min(countStarW, countStarB);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int answer = Integer.MAX_VALUE;

        for (int sr = 0; sr <= N - 8; sr++) {
            for (int sc = 0; sc <= M - 8; sc++) {
                int repaint = repaintCount(board, sr, sc);
                answer = Math.min(answer, repaint);
            }
        }

        System.out.println(answer);
    }
}