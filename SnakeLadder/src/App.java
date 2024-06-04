import player.Player;
import game.Game;
import java.util.HashMap;
import java.util.Scanner;
import dice.Dice;
import coordinates.Coordinates;
import jumper.Jumper;
import board.Board;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
    
        HashMap<String, Jumper> map = new HashMap<>();
        map.put("6", new Jumper(new Coordinates(9, 5), new Coordinates(6, 6))); 
        map.put("97", new Jumper(new Coordinates(0, 1), new Coordinates(9, 9))); 
        map.put("21", new Jumper(new Coordinates(7, 0), new Coordinates(0, 9))); 
        map.put("64", new Jumper(new Coordinates(3, 3), new Coordinates(7, 4))); 
       
       Player p1 = new Player();
       p1.setPlayerDetails("Neil", "Delhi", "0943434888", "neil@123", 20);
       p1.getPlayerName();

       Player p2 = new Player();
       p2.setPlayerDetails("Mayank", "Karnataka", "089734893", "mayank@889", 24);
       p2.getPlayerName();


        Board b = new Board(10, map);
        b.printBoard();

        Game game = new Game(b, new Player[] {p1,p2}, new Dice());
        game.play();
     }
    
   
}
