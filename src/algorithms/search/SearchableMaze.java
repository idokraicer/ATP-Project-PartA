package algorithms.search;

import algorithms.mazeGenerators.IMazeGenerator;
import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.Position;

public class SearchableMaze implements ISearchable {
    private int[][] grid;

    private MazeState[][] states;
    private Position start;
    private Position goal;

    public SearchableMaze(Maze maze){
        grid = maze.getMaze();
        start = maze.getStartPosition();
        goal = maze.getGoalPosition();
    }
}
