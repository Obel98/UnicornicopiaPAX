package CommonMap;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import Common.Interfaces.IGameMap;
import java.util.ArrayList;


public final class GameMap implements IGameMap {
    private final int level;
    private final String texturePath;
    private final TextureRegion backgroundTexture;
    private ArrayList<Room> rooms;


    public GameMap(int level) {
        this.rooms = new ArrayList<Room>();
        this.level = level;
        texturePath = getBackgroundTexturePath(level);
        backgroundTexture = new TextureRegion(new Texture(texturePath));
        constructRooms(level);
        constructPortal(level);
    }

    @Override
    public void constructRooms(int mapLevel){
        switch (mapLevel){
            case 1 :
                Room room1 = new Room();
                rooms.add(room1);
            case 2 :
                Room room2 = new Room();
                rooms.add(room2);
            case 3 :
            case 4 :
            default :
        }
    }

    public void constructPortal(int mapLevel){
        switch (mapLevel){
            case 1 :
                Portal portalOne = new Portal(2);
            case 2 :
            case 3 :
            case 4 :
            default :
        }
    }

/*
    Move render responsibility to world/game

    private void renderBackground(){
        SpriteBatch batch = new SpriteBatch();
        batch.begin();
        batch.draw(backgroundTexture,0,0);
        batch.end();
    }

    */

    @Override
    public String getBackgroundTexturePath(int mapLevel){
        switch (mapLevel) {
            case 1:
                return "Unicornicopia\\assets\\level_1.png";
            case 2:
                return "Unicornicopia\\assets\\level_2.png";
            case 3:
                return "levelthree";
            case 4:
                return "levelfour";
            default:
                break;
        }

        return "levelone";
    }

    @Override
    public int getLevel() {
        return this.level;
    }


}
