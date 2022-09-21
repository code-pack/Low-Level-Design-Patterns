package state;

public class AliveState extends State {
    public AliveState(Player player) {
        super(player);
    }

    @Override
    void shoot() {
        System.out.println("Getting shot in alive state");
        super.player.changeState(new DeadState(super.player));
    }

    @Override
    void partialShoot() {
        System.out.println("Getting partially shot in alive state");
        super.player.changeState(new LockedState(super.player));
    }

    @Override
    void kick() {
        System.out.println("Getting kicked in alive state");
        super.player.changeState(new KickedState(super.player));
    }

    @Override
    void respawn() {

    }

    @Override
    void unlock() {

    }
}
