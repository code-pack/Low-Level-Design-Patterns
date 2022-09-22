package chainofresponsibility;

public class AuthenticationHandler extends RequestHandler {

    public AuthenticationHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        if (request.getAuthenticationToken() != null) {
            request.setUserId("123");
            if (super.getNextHandler() != null) {
                super.getNextHandler().handle(request);
            }
        }
    }
}
