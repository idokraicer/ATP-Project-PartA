package algorithms.search;

public interface ISearchingAlgorithm {
    AState search(ISearchable s) throws Exception;
    Solution solve(ISearchable problem) throws Exception;
    String getName();
    int getNumberOfNodesEvaluated();
    void setNumberOfNodesEvaluated(int num);
    void initialize(ISearchable s);
}
