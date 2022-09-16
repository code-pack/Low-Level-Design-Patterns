package bridge.with;

public class AdminUI extends UserUI {
    public AdminUI(OSType osType) {
        super(osType);
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Admin specific information " + super.osType.getOSSpecificInformation());
    }
}
