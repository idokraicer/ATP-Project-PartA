package algorithms.search;

import java.util.ArrayList;

public class Solution {
    private ArrayList<AState> path;

    public Solution(ArrayList<AState> path) {
        this.path = path;
    }

    public void setPath(ArrayList<AState> path) {
        this.path = path;
    }

    public ArrayList<AState> getSolutionPath() {
        return path;
    }
}
