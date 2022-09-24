package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {
    private static Map<String, Bullet> bulletsMap = new HashMap<>();

    public static Bullet createBullet(String color) {
        if (bulletsMap.containsKey(color)) {
            return bulletsMap.get(color);
        }
        System.out.println("Created a new bullet of color " + color);
        Bullet bullet = new Bullet(color);
        bulletsMap.put(color, bullet);
        return bullet;
    }
}
