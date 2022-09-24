package flyweight;

public class MovingBullet {
    private Bullet bullet;
    private int x;
    private int y;

    public MovingBullet(String color, int x, int y) {
        this.bullet = BulletFactory.createBullet(color);
        this.x = x;
        this.y = y;
    }
}
