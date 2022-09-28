import java.util.Scanner;

public class Board{
    private char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public void printBoard(){
        System.out.println("==============");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("==============");
    }

    public void turn(String name, int number) {
        System.out.print("It's your turn, " + name + ". Which tile do you choose? ");
        Scanner in = new Scanner(System.in);
        int tile = in.nextInt();
        if(number == 1){
            board[tile-1] = 'X';
        }else if(number == 2){
            board[tile - 1] = 'O';
        }
    }

    public void checkWinner(){
        String solution = null;

        for(int i = 0; i < 8; i++){
            switch (i) {
                case 0 -> solution = "" + board[0] + board[3] + board[6];
                case 1 -> solution = "" + board[1] + board[4] + board[7];
                case 2 -> solution = "" + board[2] + board[5] + board[8];
                case 3 -> solution = "" + board[0] + board[1] + board[2];
                case 4 -> solution = "" + board[3] + board[4] + board[5];
                case 5 -> solution = "" + board[6] + board[7] + board[8];
                case 6 -> solution = "" + board[0] + board[4] + board[8];
                case 7 -> solution = "" + board[2] + board[4] + board[6];
            }
            if(solution.equals("XXX")){
                System.out.println("Player 1 wins!");
            }else if(solution.equals("OOO")){
                System.out.println("Player 2 wins!");
            }
        }
    }
}
