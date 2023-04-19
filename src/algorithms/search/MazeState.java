package algorithms.search;

import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.Position;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MazeState extends AState {
    @Override
    protected boolean isSameState(AState other) {
        return this.cords.compare(other.cords);
    }

    public MazeState(Position pos) {
        super(pos);
    }


}
//        int[][] directions = {{-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {1, -1}, {-1, 0}};
//
//        // Check positions clockwise starting from top right
//        for (int i = 0; i < directions.length; i++) {
//            int newRow = pos.getRowIndex() + directions[i][0];
//            int newCol = pos.getColumnIndex() + directions[i][1];
//            if (maze.isValidPosition(newRow, newCol)) {
//                neighbors.add(new Position(newRow, newCol));
//            }
//        }