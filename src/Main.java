import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        System.out.println("=======================================");
        System.out.println("============= TIC-TAC-TOE =============");
        System.out.println("=======================================");
        System.out.println();

        Player p1 = new Player();
        Player p2 = new Player();
        Scanner in = new Scanner(System.in);
        Board board = new Board();

        System.out.print("Name Player 1(X):");
        String p1name = in.nextLine();
        p1.setName(p1name);
        p1.setState(1);

        System.out.print("Name Player 2(O):");
        String p2name = in.nextLine();
        p2.setName(p2name);
        p2.setState(2);

        board.printBoard();
        for(int i=0; i<9; i++){
            if(i % 2 == 0){
                board.turn(p1.getName(), p1.getState());
            }else{
                board.turn(p2.getName(), p2.getState());
            }
            board.printBoard();
            if(board.isGameDone())
                break;
            if(i == 8){
                System.out.println("Draw!");
                break;
            }
        }
    }
}