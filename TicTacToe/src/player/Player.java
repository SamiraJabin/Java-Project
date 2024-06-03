package player;

public class Player {
    private String name;
    private char symbol;
    private String address;
    private String contactNumber;
    private String emailId;
    private int age;

    public void setPlayerDetails(String name ,char symbol,String address,String contactNumber,String emailId,int age){ //if we want to set all the properties of player then call this function
        this.name=name;
        this.symbol=symbol;
        this.address=address;
        this.contactNumber=contactNumber;//data type of contactnumber is string bcoz int or long couldnt accomodate 10 digits 
        this.emailId=emailId;
        this.age=age;
    }

    public void setPlayerNameAndAge(String name, int age){ //if we want to set only name and age then use this function
        this.name=name;
        this.age=age;
    }

    public void setPlayerNameSymbolEmaildIdAge(String name,char symbol,String emailId,int age){
        this.name=name;
        this.symbol=symbol;
        this.emailId=emailId;
        this.age=age;

    }

    public void changeSymbol(char symbol){ //we can change symbol of player even if symbol is already assigned in setPlayerDetails
        this.symbol=symbol;
    }

    public void setPlayerNameAndSymbol(String name, char symbol){ //in our project we basically need this function to be called. we need to set name and symbol in this project
        this.name=name;
        this.symbol=symbol;
    }

    public String getPlayerName(){ //used to get the player name 
        return this.name;

    }
    public char getPlayerSymbol(){ //used to fetch the symbol of player
        return this.symbol;
    }
    public void getPlayerNameAndSymbol(){
        System.out.println("Player Name: "+this.name);
        System.out.println("Player Symbol: "+this.symbol);
    }

    public void getPlayerNameAndAge(){ //to get only name and age of player as output
        System.out.println("Player Name: "+ this.name);
        System.out.println("Player Age: "+ this.age);

    }

    public void getPlayerDetails(){ //it fetches all the details of player
        System.out.println("Player Name: "+ this.name);
        System.out.println("Player Symbol: "+ this.symbol);
        System.out.println("Player EmailId: "+ this.emailId);
        System.out.println("Player Age: "+ this.age);
        System.out.println("Player Contact Number: "+ this.contactNumber);
        System.out.println("Player Address: "+ this.address);

    }
} 
