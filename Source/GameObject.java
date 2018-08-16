public abstract class GameObject {
    Location location;

    public abstract void draw();

    public abstract void update();

    GameObject(int x, int y) {
        setLocation(x, y);
    }

    public void setLocation(int x, int y) {
        location.setX(x);
        location.setY(y);
    }

    public Location getLocation() {
        return location;
    }

    public boolean checkCollision(GameObject a, GameObject b) {
        return a.location.getX() == b.location.getX() && a.location.getY() == b.location.getY();
    }

}