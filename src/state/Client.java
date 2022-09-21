package state;

public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        player.changeState(new AliveState(player));

        player.partialShoot();
        player.respawn();
        player.shoot();
        player.respawn();


    }
}
