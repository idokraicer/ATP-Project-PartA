package algorithms.mazeGenerators;

import java.util.Arrays;
import java.util.Random;

public class Maze {
    private int[][] maze;
    private Position startPosition;
    private Position goalPosition;

    public Maze(int rows, int cols) {
        maze = new int[rows][cols];
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

    public void print() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 1) {
                    System.out.print("□ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : maze) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return sb.toString();
    }

    public Position getStartPosition() {
        return this.startPosition;
    }

    public void setStartPosition(int row, int col) {
        this.startPosition = new Position(row, col);
    }


    public void setGoalPosition(Position goalPosition) {
        this.goalPosition = goalPosition;
    }

    public Position getGoalPosition() {
        return this.goalPosition;
    }
}
