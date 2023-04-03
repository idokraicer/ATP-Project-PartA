package algorithms.mazeGenerators;

import java.util.Objects;

public class Node {
    int row;
    int col;
    int gScore;
    int fScore;
    Node cameFrom;

    public Node(int row, int col, int gScore, int fScore, Node cameFrom) {
        this.row = row;
        this.col = col;
        this.gScore = gScore;
        this.fScore = fScore;
        this.cameFrom = cameFrom;
    }

    public boolean equals(Node other) {
        return this.row == other.row && this.col == other.col;
    }

    public int hashCode() {
        return Objects.hash(row, col);
    }
}
