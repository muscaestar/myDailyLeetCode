package _994_Rotting_Oranges;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by muscaestar on 3/4/20
 *
 * @author muscaestar
 */
public class SolutionPointQueue implements Solution {

    @Override
    public int orangesRotting(int[][] grid) {
        Queue<Point> queue = new LinkedList<>();
        int numOfFresh = 0;

        // traverse grid, enqueue rotten, count num of fresh
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int curr = grid[i][j];
                if (curr == 2) {
                    queue.add(new Point(i, j));
                } else if (curr == 1) {
                    numOfFresh++;
                }
            }
        }

        if (numOfFresh == 0) {
            return 0;
        }

        // down, up, right, left
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        int turn = 0;
        while (!queue.isEmpty()) {
            turn++;
            int numOfRotten = queue.size();
            for (int i = 0; i < numOfRotten; i++) {
                Point curr = queue.poll();
                // 4 directions
                for (int[] direction : directions) {
                    int row = curr.row + direction[0];
                    int col = curr.col + direction[1];
                    if (row < 0 || col < 0
                            || row >= grid.length
                            || col >= grid[0].length
                            || grid[row][col] != 1) {
                        continue;
                    }
                    grid[row][col] = 2;
                    queue.add(new Point(row, col));
                    numOfFresh--;
                }
            }
        }

        return (numOfFresh == 0) ? (turn - 1) : -1;
    }

    class Point {
        int row;
        int col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
