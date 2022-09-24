package template;

public abstract class AbstractAlgorithm {
    public abstract void A();

    public void B() {
        System.out.println("Default implementation of step B");
    }

    public abstract void C();

    public void run() {
        A();
        B();
        C();
    }

}
