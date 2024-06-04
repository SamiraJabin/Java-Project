package player;

import java.util.Scanner;

public class Player {
    private String name;
    private String address;
    private String contactNo;
    private String emailId;
    private int age;

    public void setPlayerDetails(String name, String address, String contactNo, String emailId, int age){
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.emailId = emailId;
        this.age = age;
    }

    public void setPlayerNameAndAge(String name, int age){ 
        this.name=name;
        this.age = age;
    }

    

    public void getPlayerDetails(){
        System.out.println("Player Name: "+ this.name);
        System.out.println("Player Address: "+ this.address);
        System.out.println("Player Contact Number: "+ this.contactNo);
        System.out.println("Player Email Id: "+ this.emailId);
        System.out.println("Player Age: "+ this.age);

    }

    public String getPlayerName(){
        return this.name;
    }

    public Player setPlayerDetailsFromUserInput(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Player details");
        System.out.println("Enter the Player Name");
        String name = scn.nextLine();
        System.out.println("Enter the Player Contact Number");
        String contactNo = scn.nextLine();
        System.out.println("Enter the Player Address");
        String address = scn.nextLine();
        System.out.println("Enter the Player EmailId");
        String emailId = scn.nextLine();
        System.out.println("Enter the Player Age");
        int age = scn.nextInt();

        Player p = new Player();
        p.setPlayerDetails(name, contactNo, address, emailId, age);

        return p;
    }
}   
