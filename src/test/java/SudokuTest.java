import org.junit.Assert;
import org.junit.Test;

public class SudokuTest {

    @Test
    public void testRowChecker() {
        int[][] test = new int[][]{
                {8, 1, 2, 7, 5, 3, 6, 4, 9}, // possible
                {1, 1, 3, 6, 2, 2, 1, 7, 5}, // not possible
                {6, 7, 5, 4, 9, 1, 2, 8, 3}, // possible
                {1, 5, 4, 2, 3, 7, 3, 9, 6}, // not possible
                {3, 6, 9, 8, 4, 5, 7, 2, 1}, // possible
                {1, 1, 1, 1, 1, 1, 1, 1, 1}, // not possible
                {5, 2, 1, 9, 7, 4, 3, 6, 8}, // possible
                {4, 3, 8, 5, 2, 6, 9, 1, 4}, // not possible
                {0, 0, 0, 0, 0, 0, 0, 0, 0}  // possible
        };

        Sudoku sudoku = new Sudoku(test);

        Assert.assertTrue(sudoku.checkIfRowPossible(0));
        Assert.assertTrue(sudoku.checkIfRowPossible(2));
        Assert.assertTrue(sudoku.checkIfRowPossible(4));
        Assert.assertTrue(sudoku.checkIfRowPossible(6));
        Assert.assertTrue(sudoku.checkIfRowPossible(8));

        Assert.assertFalse(sudoku.checkIfRowPossible(1));
        Assert.assertFalse(sudoku.checkIfRowPossible(3));
        Assert.assertFalse(sudoku.checkIfRowPossible(5));
        Assert.assertFalse(sudoku.checkIfRowPossible(7));
    }

    @Test
    public void testColumnTester() {
        int[][] test = new int[][]{
                {8, 1, 2, 7, 5, 3, 6, 0, 0},
                {9, 1, 3, 6, 8, 2, 1, 0, 0},
                {6, 1, 5, 4, 9, 1, 2, 0, 0},
                {1, 1, 4, 2, 3, 7, 8, 0, 0},
                {3, 1, 9, 8, 4, 5, 7, 0, 0},
                {2, 1, 7, 1, 6, 9, 5, 0, 0},
                {5, 1, 1, 9, 7, 4, 3, 0, 0},
                {4, 1, 8, 5, 2, 8, 9, 1, 0},
                {7, 1, 6, 7, 1, 8, 4, 1, 0}
        };
        //       p  n  p  n  p  n  p  n  p

        Sudoku sudoku = new Sudoku(test);

        Assert.assertTrue(sudoku.checkIfColumnPossible(0));
        Assert.assertTrue(sudoku.checkIfColumnPossible(2));
        Assert.assertTrue(sudoku.checkIfColumnPossible(4));
        Assert.assertTrue(sudoku.checkIfColumnPossible(6));
        Assert.assertTrue(sudoku.checkIfColumnPossible(8));

        Assert.assertFalse(sudoku.checkIfColumnPossible(1));
        Assert.assertFalse(sudoku.checkIfColumnPossible(3));
        Assert.assertFalse(sudoku.checkIfColumnPossible(5));
        Assert.assertFalse(sudoku.checkIfColumnPossible(7));
    }

    @Test
    public void testSubsectionTester() {

    }

    @Test
    public void testSolve() {
        int[][] hardestBoard = new int[][]{
                {8, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 6, 0, 0, 0, 0, 0},
                {0, 7, 0, 0, 9, 0, 2, 0, 0},
                {0, 5, 0, 0, 0, 7, 0, 0, 0},
                {0, 0, 0, 0, 4, 5, 7, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 3, 0},
                {0, 0, 1, 0, 0, 0, 0, 6, 8},
                {0, 0, 8, 5, 0, 0, 0, 1, 0},
                {0, 9, 0, 0, 0, 0, 4, 0, 0}
        };

        int[][] hardestSolved = new int[][]{
                {8, 1, 2, 7, 5, 3, 6, 4, 9},
                {9, 4, 3, 6, 8, 2, 1, 7, 5},
                {6, 7, 5, 4, 9, 1, 2, 8, 3},
                {1, 5, 4, 2, 3, 7, 8, 9, 6},
                {3, 6, 9, 8, 4, 5, 7, 2, 1},
                {2, 8, 7, 1, 6, 9, 5, 3, 4},
                {5, 2, 1, 9, 7, 4, 3, 6, 8},
                {4, 3, 8, 5, 2, 6, 9, 1, 7},
                {7, 9, 6, 3, 1, 8, 4, 5, 2}
        };

        Sudoku sudoku = new Sudoku(hardestBoard);
        int[][] solution = sudoku.solve();

        for (int i = 0; i < solution.length; i++) {
            Assert.assertArrayEquals(solution[i], hardestSolved[i]);
        }
    }


}