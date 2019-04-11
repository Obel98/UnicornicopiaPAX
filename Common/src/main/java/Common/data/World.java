package Common.data;

import Common.Interfaces.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 *
 * @author jcs
 */
public class World extends java.lang.Object {

    private final Map<String, Entity> entityMap = new ConcurrentHashMap();
    private IGameMap gameMap = null;

    public String addEntity(Entity entity) {
        entityMap.put(entity.getID(), entity);
        return entity.getID();
    }

    public void removeEntity(String entityID) {
        entityMap.remove(entityID);
    }

    public void removeEntity(Entity entity) {
        entityMap.remove(entity.getID());
    }

    public void removeMap(Entity map){
        entityMap.remove(map);
    }
    
    public Collection<Entity> getEntities() {
        return entityMap.values();
    }

    public IGameMap getGameMap() { return gameMap; }

    public void setGameMap(IGameMap gameMap) {this.gameMap = gameMap;}

    public boolean mapExists(){
        return this.gameMap != null;
    }

    public <E extends Entity> List<Entity> getEntities(Class<E>... entityTypes) {
        List<Entity> r = new ArrayList();
        for (Entity e : getEntities()) {
            for (Class<E> entityType : entityTypes) {
                if (entityType.equals(e.getClass())) {
                    r.add(e);
                }
            }
        }
        return r;
    }

    public Entity getEntity(String ID) {
        return entityMap.get(ID);
    }

}
