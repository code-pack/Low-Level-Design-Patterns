package bridge.with;

public class Android implements OSType {
    @Override
    public String getOSSpecificInformation() {
        return "On Android";
    }
}
