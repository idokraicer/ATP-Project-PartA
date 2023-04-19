package algorithms.search;

import java.util.ArrayList;

public interface ISearchable  {
    AState getStart_s();
    AState getGoal_s();
    void visit(AState state);
    boolean isVisited_s(AState state);
    ArrayList<AState> getNeighbors(AState aState);
    void init();
}
