import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    //creating board
    public static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            System.out.println(board[i]);
        }
        showBoard(board);
        return board;
        }


    //showing the board
    public static void showBoard(char[] board){

        System.out.println("| "+board[1]+"  |"+board[2]+"  |"+board[3]+"  |");
        System.out.println("| "+board[4]+"  |"+board[5]+"  |"+board[6]+"  |");
        System.out.println("| "+board[7]+"  |"+board[8]+"  |"+board[9]+"  |");
            }

    //providing playing options
    public static void chooseOption() {
        Scanner input = new Scanner(System.in);
        System.out.print("Select X or O:");
        String userChoice=input.next();
        System.out.println("User choice:"+userChoice);

        if (userChoice.equalsIgnoreCase("x"))
            System.out.println("Computer choice:O");
        else if (userChoice.equalsIgnoreCase("o"))
            System.out.println("Computer choice:X");
        else
            System.out.println("Enter the correct option!");
    }

    public static void main(String args[])
    {
        createBoard();
        chooseOption();

    }

}

