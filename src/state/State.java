package state;

public abstract class State {
    protected Player player;

    public State(Player player) {
        this.player = player;
    }

    abstract void shoot();

    abstract void partialShoot();

    abstract void kick();

    abstract void respawn();

    abstract void unlock();
}
