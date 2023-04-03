package algorithms.mazeGenerators;

public class Maze {
    public int[][] maze;

    public Maze(int rows, int cols) {
        this.maze = new int[rows][cols];
    }

    public int[][] getMaze() {
        return maze;
    }

    public void setWall(int row, int col) {
        maze[row][col] = 1;
    }

    public void setFree(int row, int col) {
        maze[row][col] = 0;
    }

    public boolean isWall(int row, int col) {
        return maze[row][col] == 1;
    }

    public int getRows() {
        return maze.length;
    }

    public int getColumns() {
        return maze[0].length;
    }
}
