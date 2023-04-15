package algorithms.search;

import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.Position;

import java.util.Queue;

public abstract class AState{
    private Position cords;
    protected Queue<Position> neighbors;

    public Queue<Position> getNeighbors() {
        return neighbors;
    }
}
