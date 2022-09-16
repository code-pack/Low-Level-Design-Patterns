package bridge.without;

public class LinuxAdminUI extends LinuxUserUI {

    public LinuxAdminUI() {
        super();
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Some information visible to admin on linux");
    }
}
