package singleton.without;

public class Client {
    private static Connection connection = null;

    public static void main(String[] args) {

    }

    public static void method1() {
        if (connection == null) {
            connection = new Connection();
        }

        // write some code to use the connection
    }

    public static void method2() {
        if (connection == null) {
            connection = new Connection();
        }

        // write some code to use the connection
    }
}
