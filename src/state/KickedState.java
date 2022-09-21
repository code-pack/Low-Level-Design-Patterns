package state;

public class KickedState extends State {
    public KickedState(Player player) {
        super(player);
    }

    @Override
    void shoot() {

    }

    @Override
    void partialShoot() {

    }

    @Override
    void kick() {

    }

    @Override
    void respawn() {
        System.out.println("Getting respawned in kicked state!");
        super.player.changeState(new AliveState(super.player));
    }

    @Override
    void unlock() {

    }
}
