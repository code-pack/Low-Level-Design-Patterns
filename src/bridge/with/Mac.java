package bridge.with;

public class Mac implements OSType {
    @Override
    public String getOSSpecificInformation() {
        return "on Mac";
    }
}
