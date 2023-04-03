package algorithms.mazeGenerators;

import java.util.Arrays;

public class EmptyMazeGenerator extends AMazeGenerator{
    @Override
    public Maze generate(int rows, int columns) {
        Maze emptyMaze = new Maze(rows, columns);
        for (int i = 0; i < rows; i++) {
            Arrays.fill(emptyMaze.getMaze()[i], 0);
        }
        return emptyMaze;
    }
}
