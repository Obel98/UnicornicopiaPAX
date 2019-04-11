package Common.events;

import Common.data.Entity;

public class MapChangeEvent extends Event {

    public MapChangeEvent(Object source) {
        super((Entity) source);
    }
}
