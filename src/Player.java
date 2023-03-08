import java.util.Scanner;

public class Player {

    private int[][] grid;
    private int totalScore;

    public Player(){
        grid = new int[5][5];
    }

    public int[][] getGrid(){
        return grid;
    }

    public int getTotalScore(){
        return totalScore;
    }
    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public void placeValue(int value){
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        while(repeat){
            System.out.println("Your value is " + value);
            Counter.printGraph(grid);
            System.out.println("Which Column do you want to place your value in?(1-5): ");
            int column = scan.nextInt()-1;
            System.out.println("Which Row do you want to place your value in?(1-5): ");
            int row = scan.nextInt()-1;
            if(grid[row][column] == 0){
                repeat = false;
                grid[row][column] = value;
            } else{
                System.out.println("Please enter an empty space");
            }
        }

    }
}
