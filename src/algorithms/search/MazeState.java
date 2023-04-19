package algorithms.search;

import algorithms.mazeGenerators.Position;

public class MazeState extends AState {
    @Override
    protected boolean isSameState(AState other) {
        return this.cords.compare(other.cords);
    }

    public MazeState(Position pos, int direction) {
        super(pos, direction);
    }

    @Override
    public String toString() {
        return this.cords.toString();
    }


}
