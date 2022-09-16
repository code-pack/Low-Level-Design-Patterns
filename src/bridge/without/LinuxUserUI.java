package bridge.without;

public class LinuxUserUI implements UI {
    @Override
    public void render() {
        System.out.println("Some information visible to users on Linux");
    }
}
