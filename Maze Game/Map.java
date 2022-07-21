/**
 * Created by Samiyanur Islam on 09/26/2020
 * All rights reserve to Samiya
 */

//import javax.swing.*;

public class Map
{
    private final String[][] myMaze;
    private static int heroRow, heroCol;
    boolean gameMove = false;
    public Map(int r, int c)
    {
        myMaze= new String[c][r];
        for(int i= 0; i < myMaze.length;i++)
        {
            for(int j=0; j<myMaze[0].length; j++)
            {
                myMaze[i][j]= "O";
            }
        }
        heroRow=0; heroCol=0;
        myMaze[3][2]="*";myMaze[2][3]="*";myMaze[3][2]="*";myMaze[0][2]= "*";
        myMaze[1][1]="*";myMaze[2][1]="*";myMaze[3][0]="*";myMaze[1][4]="*";
        myMaze[heroRow][heroCol]="X";
    }
    public String[][] getMaze()
    {
        return myMaze;
    }
    public int getRow()
    {
        return heroRow;
    }
    public int getCol()
    {
        return heroCol;
    }
    public void movePlayer(String direction) {
        int row = heroRow, column = heroCol;
        //boolean gameMove = false;
        switch (direction) {
            case "up":
                if (heroRow - 1 < 0) {
                    System.out.print("Invalid Move.Try different move. :)");
                } else {
                    heroRow = heroRow - 1;
                    gameMove = true;
                }
                break;
            case "down":
                if (heroCol > myMaze.length + 1) {
                    System.out.print("Invalid Move. Try different move. :)");
                } else {
                    heroRow = heroRow + 1;
                    gameMove = true;
                }
                break;
            case "left":
                if (heroCol - 1 < 0) {
                    System.out.print("Invalid Move. Try different move. :)");
                } else {
                    heroCol = heroCol - 1;
                    gameMove = true;
                }
                break;
            case "right":
                if (heroCol > myMaze[0].length - 1) {
                    System.out.print("Invalid Move. Try different move. :)");
                } else {
                    heroCol += 1;
                    gameMove = true;
                }
                break;
            default:
                System.out.println("Invalid move! Try a different move. :)");
                break;
        }
        if (gameMove && (myMaze[heroRow][heroCol].equals("O") || myMaze[heroRow][heroCol].equals("$"))) {
            myMaze[row][column] = "O";
            myMaze[heroRow][heroCol] = "X";
        }
        if (gameMove && (myMaze[heroRow][heroCol].equals("*") || myMaze[heroRow][heroCol].equals("$"))) {
            myMaze[row][column] = "O";
            myMaze[heroRow][heroCol] = "X";
        }
    }
}