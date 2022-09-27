import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        System.out.println("=======================================");
        System.out.println("============= TIC-TAC-TOE =============");
        System.out.println("=======================================");
        System.out.println();

        Players p1 = new Players();
        Players p2 = new Players();
        Scanner in = new Scanner(System.in);
        Board board = new Board();

        System.out.print("Name Player 1(X):");
        String p1name = in.nextLine();
        p1.setName1(p1name);

        System.out.print("Name Player 2(O):");
        String p2name = in.nextLine();
        p2.setName2(p2name);

        System.out.println(p1.getName1() + " is the the player to start the game!");
        board.printBoard();
    }
}