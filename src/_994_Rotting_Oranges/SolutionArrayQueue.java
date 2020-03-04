package _994_Rotting_Oranges;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by muscaestar on 3/4/20
 *
 * @author muscaestar
 */
public class SolutionArrayQueue implements Solution {

    @Override
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int numOfFresh = 0;

        // traverse grid, enqueue rotten, count num of fresh
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int curr = grid[i][j];
                if (curr == 2) {
                    queue.add(new int[]{i, j});
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
                int[] curr = queue.poll();
                // 4 directions
                for (int[] direction : directions) {
                    int row = curr[0] + direction[0];
                    int col = curr[1] + direction[1];
                    if (row < 0 || col < 0
                            || row >= grid.length
                            || col >= grid[0].length
                            || grid[row][col] != 1) {
                        continue;
                    }
                    grid[row][col] = 2;
                    queue.add(new int[]{row, col});
                    numOfFresh--;
                }
            }
        }

        return (numOfFresh == 0) ? (turn - 1) : -1;
    }
}
