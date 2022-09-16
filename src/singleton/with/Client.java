package singleton.with;


public class Client {
    public static void main(String[] args) {

    }

    public static void someMethod1() {
        Connection connection = Connection.createConnection();
        // do something with connection
    }

    public static void someMethod2() {
        Connection connection = Connection.createConnection();

        // do something with connection
    }
}
