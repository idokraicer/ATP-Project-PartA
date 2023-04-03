package algorithms.mazeGenerators;

import java.util.*;

import static java.util.Collections.shuffle;

public class MyMazeGenerator extends AMazeGenerator {
    public Maze myMaze;


    public MyMazeGenerator(int rows, int columns) {
        myMaze = new Maze(rows, columns);
    }

    @Override
    public Maze generate(int row, int col) {
        return null;
    }
}
