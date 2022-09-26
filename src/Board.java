import java.util.ArrayList;

public class Board{
    private String[] board;
    private String turn;

    public void checkWinner(){
        for(int i = 0; i < 9; i++){
            String line = null;

            switch(i){
                case 1 -> line = board[0] + board[3] + board[6];
                case 2 -> line = board[1] + board[4] + board[7];
                case 3 -> line = board[2] + board[5] + board[8];
                case 4 -> line = board[0] + board[1] + board[2];
                case 5 -> line = board[3] + board[4] + board[5];
                case 6 -> line = board[6] + board[7] + board[8];
                case 7 -> line = board[0] + board[4] + board[8];
                case 8 -> line = board[2] + board[4] + board[6];
            }
            if(line.equals("XXX")){
                System.out.println("X wins!");
            }else if(line.equals("OOO")){
                System.out.println("O wins");
            }
        }
    }
}