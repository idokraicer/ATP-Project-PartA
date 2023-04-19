package algorithms.search;

public class DepthFirstSearch {

    private boolean isPathBetween(int startRow, int startCol, int goalRow, int goalCol) { //Using DFS
        boolean[][] visited = new boolean[maze.getRows()][maze.getColumns()];
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startRow, startCol});
        visited[startRow][startCol] = true;

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            int currRow = curr[0];
            int currCol = curr[1];

            if (currRow == goalRow && currCol == goalCol) {
                return true; // Found a path to the goal
            }

            if (currRow > 0 && !visited[currRow - 1][currCol] && !maze.isWall(currRow - 1, currCol)) {
                stack.push(new int[]{currRow - 1, currCol});
                visited[currRow - 1][currCol] = true;
            }

            if (currRow < maze.getRows() - 1 && !visited[currRow + 1][currCol] && !maze.isWall(currRow + 1, currCol)) {
                stack.push(new int[]{currRow + 1, currCol});
                visited[currRow + 1][currCol] = true;
            }

            if (currCol > 0 && !visited[currRow][currCol - 1] && !maze.isWall(currRow, currCol - 1)) {
                stack.push(new int[]{currRow, currCol - 1});
                visited[currRow][currCol - 1] = true;
            }

            if (currCol < maze.getColumns() - 1 && !visited[currRow][currCol + 1] && !maze.isWall(currRow, currCol + 1)) {
                stack.push(new int[]{currRow, currCol + 1});
                visited[currRow][currCol + 1] = true;
            }
        }

        return false; // No path to the goal
    }
}
