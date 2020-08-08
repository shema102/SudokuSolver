import java.util.ArrayList;

public class Sudoku {
    private final int[][] state = new int[9][9];

    public Sudoku(int[][] state) {
        for (int i = 0; i < 9; i++) {
            System.arraycopy(state[i], 0, this.state[i], 0, 9);
        }
    }

    public boolean checkIfRowPossible(int row) {
        ArrayList<Integer> buff = new ArrayList<>();
        for (int currentPos : state[row]) {
            if (currentPos == 0 || !buff.contains(currentPos)) {
                buff.add(currentPos);
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean checkIfColumnPossible(int column) {
        ArrayList<Integer> buff = new ArrayList<>();

        for (int[] currentRow : state) {
            int currentPos = currentRow[column];
            if (currentPos == 0 || !buff.contains(currentPos)) {
                buff.add(currentPos);
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean checkIfSubsectionPossible(int row, int column) {
        // TODO
        return false;
    }

    public int[][] solve() {
        // TODO
        return this.state;
    }

}
