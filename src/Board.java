import java.util.ArrayList;

public class Board{
    private char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public void printBoard(){
        System.out.println("==============");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("==============");
    }
}