package bridge.with;

public class UserUI extends UI {

    public UserUI(OSType osType) {
        super(osType);
    }

    @Override
    public void render() {
        System.out.println("User specific information " + super.osType.getOSSpecificInformation());
    }
}
