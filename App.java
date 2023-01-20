package sg.edu.nus.iss;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
       String[] tttBoard =new String[9];
        //populating the tic-tac-toe board with 1 to 9

        String player = "X";

       for(int i=0;i<9;i++){
        tttBoard[i] = String.valueOf(i+1);
        //print out the initial tic-tac-toe board
        
       }
       TicTacToe ttt = new TicTacToe();
       ttt.printBoard(tttBoard);

       System.out.println("Tic Tac Toe game");
       System.out.println("-----------------");


    }
}
