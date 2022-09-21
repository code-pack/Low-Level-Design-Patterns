package prototype;

public class Client {
    public static void main(String[] args) {
        Profile p1 = new Profile("1");

        Profile p2 = (Profile) p1.createCloneOf();



    }
}
