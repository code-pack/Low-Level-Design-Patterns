package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<MovingBullet> movingBulletList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            MovingBullet mb = new MovingBullet("black", i, i*10);
            movingBulletList.add(mb);
        }
    }
}
