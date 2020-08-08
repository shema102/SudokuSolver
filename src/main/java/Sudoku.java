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
        int[] firstElement = positionOfFirstElementInSubsection(row, column); // coordinates {row, column}
        ArrayList<Integer> buff = new ArrayList<>();
        for (int i = firstElement[0]; i < firstElement[0] + 3; i++) {
            for (int j = firstElement[1]; j < firstElement[1] + 3; j++) {
                int currentPos = state[i][j];
                if (currentPos == 0 || !buff.contains(currentPos)) {
                    buff.add(currentPos);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private int[] positionOfFirstElementInSubsection(int row, int column) {
        return new int[]{squash(row), squash(column)};
    }

    private int squash(int num) {
        switch (num) {
            case 0:
            case 1:
            case 2:
                return 0;
            case 3:
            case 4:
            case 5:
                return 3;
            case 6:
            case 7:
            case 8:
                return 6;
        }
        return -1;
    }

    public int[][] solve() {
        // TODO
        return this.state;
    }

}
