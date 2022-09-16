package bridge.with;

public class Windows implements OSType {
    @Override
    public String getOSSpecificInformation() {
        return "On Windows";
    }
}
