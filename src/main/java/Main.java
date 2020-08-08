import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SudokuSolver v0.1\n");
        int[][] board = new int[9][9];
        for (int row = 0; row < 9; row++) {
            String buf;
            buf = scanner.nextLine();
            String[] nums = buf.split(" ");
            for (int column = 0; column < 9; column++) {
                board[row][column] = Integer.parseInt(nums[column]);
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }

        Sudoku sudoku = new Sudoku(board);
        sudoku.solve();
        System.out.println(sudoku);
    }
}
