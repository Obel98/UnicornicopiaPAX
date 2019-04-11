package Common.data;

import Common.data.entityparts.EntityPart;
import java.io.Serializable;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Entity implements Serializable {
    private final UUID ID = UUID.randomUUID();

    private float radius;
    private Map<Class, EntityPart> parts;
    
    //starting position
    protected float x;
    protected float y;

    //movement position
    protected float dx;
    protected float dy;

    protected float radians;
    protected float speed;
    protected float rotationSpeed;

    protected int width;
    protected int height;

    public Map<Class, EntityPart> getParts() {
        return parts;
    }

    public void setParts(Map<Class, EntityPart> parts) {
        this.parts = parts;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getDx() {
        return dx;
    }

    public void setDx(float dx) {
        this.dx = dx;
    }

    public float getDy() {
        return dy;
    }

    public void setDy(float dy) {
        this.dy = dy;
    }

    public float getRadians() {
        return radians;
    }

    public void setRadians(float radians) {
        this.radians = radians;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(float rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Entity() {
        parts = new ConcurrentHashMap();
    }
    
    public void add(EntityPart part) {
        parts.put(part.getClass(), part);
    }
    
    public void remove(Class partClass) {
        parts.remove(partClass);
    }
    
    public <E extends EntityPart> E getPart(Class partClass) {
        return (E) parts.get(partClass);
    }
    
    public void setRadius(float r){
        this.radius = r;
    }
    
    public float getRadius(){
        return radius;
    }

    public String getID() {
        return ID.toString();
    }

    public float getShapeX() {
        return x;
    }

    public float getShapeY() {
        return y;
    }

}
