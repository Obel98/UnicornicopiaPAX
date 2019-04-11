package Common.Interfaces;

public interface IGameMap {

    void constructRooms(int mapLevel);

    String getBackgroundTexturePath(int mapLevel);

    int getLevel();
}
