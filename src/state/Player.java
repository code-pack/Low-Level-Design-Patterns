package state;

public class Player {
    private State state;

    public Player() {

    }

    public void changeState(State newState) {
        this.state = newState;
    }

    public void shoot() {
        this.state.shoot();
    }

    public void partialShoot() {
        this.state.partialShoot();
    }

    public void kick() {
        this.state.kick();
    }

    public void respawn() {
        this.state.respawn();
    }

    public void unlock() {
        this.state.unlock();
    }
}
