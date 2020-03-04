package _994_Rotting_Oranges;

/**
 * Created by muscaestar on 3/4/20
 *
 * @author muscaestar
 */
public class SolutionRecursive implements Solution {
    int[][] grid;
    int numRow;
    int numCol;

    @Override
    public int orangesRotting(int[][] grid) {
        this.grid = grid;
        this.numRow = grid.length;
        this.numCol = grid[0].length;

        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numCol; j++) {
                if (grid[i][j] == 2) {
                    dfs(i, j, 2);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numCol; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
                res = Math.max(res, grid[i][j]);
            }
        }

        return (res == 0) ? 0 : (res - 2);
    }

    private void dfs(int i, int j, int val) {
        grid[i][j] = val;
        // up, left, down, right
        int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

        for (int[] dir : directions) {
            // recursively tracing 4 directions
            if (isReachable(i, j, dir)) {
                dfs(i + dir[0], j + dir[1], val + 1);
            }
        }
    }

    private boolean isReachable(int i, int j, int[] direction) {
        int row = i + direction[0];
        int col = j + direction[1];
        if (row < 0 || col < 0 || row >= numRow || col >= numCol) {
            return false;
        }

        int target = grid[row][col];
        return target == 1 || target > grid[i][j] + 1;
    }
}
