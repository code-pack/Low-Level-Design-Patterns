package state;

public class DeadState extends State {
    public DeadState(Player player) {
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
        System.out.println("Getting respawned in dead state!");
        super.player.changeState(new AliveState(super.player));
    }

    @Override
    void unlock() {

    }

}
