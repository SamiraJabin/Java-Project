package player;

public class Player {
    private String name;
    private String email;

    public Player(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getPlayerName(){
       return this.name;
    }
}
