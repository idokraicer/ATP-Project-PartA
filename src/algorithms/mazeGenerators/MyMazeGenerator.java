package algorithms.mazeGenerators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMazeGenerator extends AMazeGenerator {
    private Maze maze;
    public MyMazeGenerator(int rows, int columns) {
        generate(rows, columns);
        maze.print();
    }
    @Override
    public Maze generate(int rows, int columns) {
        if (rows < 2 || columns < 2) {
            throw new IllegalArgumentException("Maze dimensions must be at least 2x2");
        }

        maze = new Maze(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                maze.setWall(i, j); // start with all cells as walls
            }
        }

        // Choose a random starting cell and carve a path
        int startRow = (int) (Math.random() * (rows - 2)) + 1;
        int startCol = (int) (Math.random() * (columns - 2)) + 1;
        DFS(startRow, startCol);

        return maze;
    }

    private void DFS(int row, int col) {
        maze.setFree(row, col); // mark current cell as free

        // Create a random list of neighbors to visit
        List<int[]> neighbors = new ArrayList<>();
        if (row > 1 && maze.isWall(row - 2, col)) {
            neighbors.add(new int[]{row - 2, col});
        }
        if (row < maze.getRows() - 2 && maze.isWall(row + 2, col)) {
            neighbors.add(new int[]{row + 2, col});
        }
        if (col > 1 && maze.isWall(row, col - 2)) {
            neighbors.add(new int[]{row, col - 2});
        }
        if (col < maze.getColumns() - 2 && maze.isWall(row, col + 2)) {
            neighbors.add(new int[]{row, col + 2});
        }
        Collections.shuffle(neighbors);

        for (int[] neighbor : neighbors) {
            int nRow = neighbor[0];
            int nCol = neighbor[1];
            int midRow = (row + nRow) / 2;
            int midCol = (col + nCol) / 2;
            if (maze.isWall(nRow, nCol)) { // if neighbor is a wall cell
                maze.setFree(midRow, midCol); // carve a path to it
                DFS(nRow, nCol); // continue search from neighbor cell
            }
        }
    }
}
