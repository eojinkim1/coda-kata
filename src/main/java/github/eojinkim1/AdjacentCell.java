package github.eojinkim1;

public class AdjacentCell {
    public static void main(String[] args) {

        String[][] board ={
            {
                "yellow", "green", "blue"
            },
            {
                "blue", "green", "yellow"
            },
            {
                "yellow", "blue", "blue"
            }
        };
        int h = 0;
        int w = 1;

        int result = solution(board, h, w );
        System.out.println(result);

    }

    public static int solution(String[][] board, int h, int w) {
        int count = 0;
        int n = board.length;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                if (board[h_check][w_check].equals(board[h][w])) {
                    count++;
                }
            }
        }
        return count;
    }
}