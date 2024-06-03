 package game;

 import player.Player;
 import board.Board;
 import java.util.Scanner;

public class Game {
    Player [] players;
    Board board;
    int turn; //turn of player1 or p2
    int noOfMoves;
    Boolean gameOver;
    String zero;//symbol
    String cross;//symbol

    public Game(Player[] players, Board board){ //this a constructor used to initialize
        this.players = players;
        this.board = board;
        this.turn = 0; //player1's turn
        this.noOfMoves = 0;
        this.gameOver = false;

        StringBuilder z = new StringBuilder();
        StringBuilder c = new StringBuilder();

        for(int i=0;i<board.size;i++){
            z.append('O');
            c.append('X');
        }

        this.zero = z.toString();
        this.cross = c.toString();
    }

    public void printBoardConfig(){
        int sz = this.board.size;
        for(int i=0;i<sz;i++){
            for(int j=0;j<sz;j++){
                System.out.print(board.matrix[i][j]+ " ");
            }      
            System.out.println();      
        }
    }

    public void play(){
        printBoardConfig();
        int sz = board.size;

        while (!gameOver) {
            noOfMoves++;
            int idx = getIndex();

            int row = idx/sz;
            int col = idx%sz;

            board.matrix[row][col] = players[turn].getPlayerSymbol();
            
            if(noOfMoves >=sz*sz){
                System.out.println("Game Draw");
                return;
            }

            if(noOfMoves >= 2*sz-1 && checkCombinations() == true){
                gameOver = true;
                printBoardConfig();
                System.out.println("Winner is: " + players[turn].getPlayerName());
                return;
            }
            
            turn =(turn+1)%2; //%2 bcoz we have 2 player
            printBoardConfig();

        }
    }

    public int getIndex(){
        while(true){
            //Player1 give one position
            System.out.println("Player: "+ players[turn].getPlayerName() + " give one position");
            Scanner scn = new Scanner(System.in);
            int pos = scn.nextInt()-1;

            int sz = board.size;

            int row = pos/sz;//used to find row
            int col = pos%sz;//used to find column

            //checking for invalid position
            if(row<0 || row>=sz || col<0 || col>=sz){
                System.out.println("Invalid position");
                continue;
            }

            //checking for vacant position
            if(board.matrix[row][col] != '-'){
                System.out.println("Position already occupied");
                continue;
            }
            return pos;
        }
    }

    public boolean checkCombinations(){ //boolean bcoz it will give true or false
        int sz = board.size;
        
        //Row-wise

        for(int i=0;i<sz;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<sz;j++){
                sb.append(board.matrix[i][j]);
            }

            String pattern = sb.toString();
            if(pattern.equals(zero) || pattern.equals(cross)){
                return true;
            }
        }

        //column-wise

        for(int i=0;i<sz;i++){
            StringBuilder sb = new StringBuilder();
              for(int j=0;j<sz;j++){
                sb.append(board.matrix[j][i]);
              }
              String pattern = sb.toString();
              if(pattern.equals(zero) || pattern.equals(cross)){
                return true;
        }
    }

    //Diagonal 

    int i=0,j=0;
    StringBuilder sb = new StringBuilder();

    while(i<sz){
        sb.append(board.matrix[i][j]);
        i++;
        j++;

    }
    String pattern = sb.toString();
    if(pattern.equals(zero) || pattern.equals(cross)){
        return true;
    }

    //Anti-Diagonal 

    i=0;
    j=sz-1;
    sb = new StringBuilder();

    while(i<sz){
        sb.append(board.matrix[i][j]);
        i++;
        j--;

    }
    pattern = sb.toString();
    if(pattern.equals(zero) || pattern.equals(cross)){
        return true;
    }

    return false;
} 
}