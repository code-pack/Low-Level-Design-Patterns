package chainofresponsibility;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void handle(Request request);

    public RequestHandler getNextHandler() {
        return nextHandler;
    }
}
