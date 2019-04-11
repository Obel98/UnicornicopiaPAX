package CommonMap;


import java.util.ArrayList;
import java.util.Random;

public class Room{
    int id;
    ArrayList<Door> door;
    ArrayList<Portal> portals;

    public Room(){
        this.portals = new ArrayList<Portal>();
        this.door = new ArrayList<Door>();
        Random random = new Random();
        id = random.nextInt(2000);
    }





}





