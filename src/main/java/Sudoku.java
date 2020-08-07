import java.util.ArrayList;

public class Sudoku {
    private final int[][] state = new int[9][9];

    public Sudoku(int[][] state) {
        for (int i = 0; i < 9; i++) {
            System.arraycopy(state[i], 0, this.state[i], 0, 9);
        }
    }

    public boolean checkIfNoErrors() {
        return checkIfColumnsCompleted() &&
                checkIfRowsCompleted() &&
                checkIfSubgridsCompleted();
    }

    private boolean checkIfRowsCompleted() {
        ArrayList<Integer> buff = new ArrayList<>();
        for (int[] row : state) {
            for (int currentNum : row) {
                if (currentNum == 0 || !buff.contains(currentNum)) {
                    buff.add(currentNum);
                } else {
                    return false;
                }
            }
            buff.clear();
        }
        return true;
    }

    private boolean checkIfColumnsCompleted() {
        // TODO
        return false;
    }

    private boolean checkIfSubgridsCompleted() {
        // TODO
        return false;
    }

}
