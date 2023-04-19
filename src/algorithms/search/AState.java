package algorithms.search;

import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.Position;

import java.util.Queue;

public abstract class AState{

    protected Position cords;
    protected AState cameFrom;
    protected int cost =0;
    private static int maxDepth = 0;
    protected abstract boolean isSameState(AState other);
    public AState(Position p){
        this.cords = p;
    }

    public AState getCameFrom() {
        return cameFrom;
    }

    public Position getCords() {
        return cords;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCords(Position cords) {
        this.cords = cords;
    }
}
