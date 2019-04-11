package CommonMap.services;

import Common.Interfaces.IGameMap;
import Common.data.GameData;
import Common.data.World;
import Common.events.MapChangeEvent;
import Common.services.IGetMapProcessingService;
import Common.services.IProcessingService;
import CommonMap.GameMap;



public class MapProcessingService implements IProcessingService, IGetMapProcessingService {
    private GameMap gameMap;

    public MapProcessingService(){

    }

    @Override
    public IGameMap getMap(){
        return this.gameMap;
    }

    @Override
    public void process(GameData gameData, World world) {
            if(!world.mapExists()){
                gameMap = new GameMap(1);
                MapChangeEvent event = new MapChangeEvent(gameMap);
                gameData.addEvent(event);
            }

            //if player collides with door/room etc. change room/level


    }

    

}
