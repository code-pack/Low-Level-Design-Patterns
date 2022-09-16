package bridge.with;

public class Linux implements OSType {
    @Override
    public String getOSSpecificInformation() {
        return "On Linux";
    }
}
