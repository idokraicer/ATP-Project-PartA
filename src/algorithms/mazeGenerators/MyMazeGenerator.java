package algorithms.mazeGenerators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MyMazeGenerator extends AMazeGenerator {
    //public Maze maze;

    public MyMazeGenerator() {
        maze = null;
    }

    @Override
    public Maze generate(int rows, int columns) {
        maze = new Maze(rows, columns);
        if (rows < 2 || columns < 2) {
            throw new IllegalArgumentException("Maze dimensions must be at least 2x2");
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                maze.setWall(i, j); // start with all cells as walls
            }
        }

        // Choose a random starting cell and carve a path
        int startRow = 0;//(int) (Math.random() * (rows - 2)) + 1;
        int startCol = (int) (Math.random() * (columns - 2)) + 1;
        maze.setStartPosition(startRow, startCol);
        maze.setGoalPosition(rows-1,columns-1); // Delete this after
        iterativeDFS(startRow, startCol);

        return maze;
    }

    private void iterativeDFS(int startRow, int startCol) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startRow, startCol});
        maze.setFree(startRow, startCol); // mark start cell as free

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            int currRow = curr[0];
            int currCol = curr[1];

            // Create a random list of neighbors to visit
            List<int[]> neighbors = new ArrayList<>();
            if (currRow > 1 && maze.isWall(currRow - 2, currCol)) {
                neighbors.add(new int[]{currRow - 2, currCol});
            }
            if (currRow < maze.getRows() - 2 && maze.isWall(currRow + 2, currCol)) {
                neighbors.add(new int[]{currRow + 2, currCol});
            }
            if (currCol > 1 && maze.isWall(currRow, currCol - 2)) {
                neighbors.add(new int[]{currRow, currCol - 2});
            }
            if (currCol < maze.getColumns() - 2 && maze.isWall(currRow, currCol + 2)) {
                neighbors.add(new int[]{currRow, currCol + 2});
            }
            Collections.shuffle(neighbors);

            for (int[] neighbor : neighbors) {
                int nRow = neighbor[0];
                int nCol = neighbor[1];
                int midRow = (currRow + nRow) / 2;
                int midCol = (currCol + nCol) / 2;
                if (maze.isWall(nRow, nCol)) { // if neighbor is a wall cell
                    maze.setFree(midRow, midCol); // carve a path to it
                    maze.setFree(nRow, nCol); // mark it as free
                    stack.push(new int[]{nRow, nCol}); // add it to the stack
                }
            }
        }
    }
}
