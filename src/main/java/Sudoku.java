
public class Sudoku {
    private int[][] state = new int[9][9];

    public void Sudoku(int[][] state) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.state[i][j] = state[i][j];
            }
        }
    }

    public boolean checkIfCompleted() {
        return checkIfColumnsCompleted() &&
                checkIfRowsCompleted() &&
                checkIfSubgridsCompleted();
    }

    private boolean checkIfRowsCompleted() {
        // TODO
        return false;
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
