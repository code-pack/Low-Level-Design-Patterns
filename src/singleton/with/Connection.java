package singleton.with;

public class Connection {
    private static Connection connection = null;

    private Connection() {

    }

    public static Connection createConnection() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}
