package algorithms.search;

import java.util.PriorityQueue;

public abstract class ASearchingAlgorithm implements ISearchingAlgorithm {
    protected PriorityQueue<AState> unvisited;


    public int compare(AState s1, AState s2) {
        if (s1.getCost() < s2.getCost())
            return -1;
        else if (s1.getCost() > s2.getCost())
            return 1;
        return 0;
    }
}
