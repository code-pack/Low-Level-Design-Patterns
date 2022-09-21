package state;

public class LockedState extends State {
    public LockedState(Player player) {
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
        System.out.println("Getting respawned in locked state!");
        super.player.changeState(new AliveState(super.player));
    }

    @Override
    void unlock() {
        System.out.println("Getting unlocked in locked state!");
        super.player.changeState(new AliveState(super.player));
    }
}
