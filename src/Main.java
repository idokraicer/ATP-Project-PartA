import algorithms.mazeGenerators.MyMazeGenerator;

public class Main {
    public static void main(String[] args) {

        MyMazeGenerator myMazeGenerator = new MyMazeGenerator(15,100);
        for (int i = 0; i < myMazeGenerator.myMaze.getRows(); i++) {
            for (int j = 0; j < myMazeGenerator.myMaze.getColumns(); j++) {
                System.out.print(myMazeGenerator.myMaze.maze[i][j] == 1 ? " " : "#");
            }
            System.out.println();
        }
        //System.out.println(myMazeGenerator.measureAlgorithmTimeMillis(1000,1000));
    }
}