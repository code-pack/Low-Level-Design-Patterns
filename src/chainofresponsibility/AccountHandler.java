package chainofresponsibility;

public class AccountHandler extends RequestHandler {
    public AccountHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handle(Request request) {
        if (request.getUserId() != null && request.getUserId().startsWith("12")) {
            if (super.getNextHandler() != null) {
                super.getNextHandler().handle(request);
            }
        }
    }
}
