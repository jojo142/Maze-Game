/**
 * Created by Samiyanur Islam on 09/26/2020
 * All rights reserve to Samiya
 */

import java.util.Scanner;

public class MazeGame {
    private static Map maze;
    private static final int row1 = 3, col1 = 4;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        maze = new Map(5, 4);
        System.out.println("*** Welcome to Star Collector ***");
        System.out.println("Goal: Collect stars and reach end point to trade those stars for money.");
        printMaze();
        while (true) {
            if (maze.getRow() == row1 && maze.getCol() == col1) {
                System.out.println("Congrats you found the trader.");
                break;
            } else {
                System.out.println("Where do you want to move?");
                String game = scan.nextLine();
                maze.movePlayer(game);
                printMaze();
            }
        }
    }

    public static void printMaze() {
        String[][] tempMaze;
        tempMaze = maze.getMaze();
        tempMaze[3][4] = "$";
        for (String[] r : tempMaze) {
            System.out.println();
            for (String s : r) {
                System.out.print(s + "|");
            }
        }
        System.out.println();

    }
}