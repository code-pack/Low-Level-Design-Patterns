package chainofresponsibility;

public class PastPaymentHandler extends RequestHandler {
    public PastPaymentHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handle(Request request) {
        // Fetch from database past payment status

        request.setPaymentStatus(PaymentStatus.PENDING);
        if (super.getNextHandler() != null) {
            super.getNextHandler().handle(request);
        }
    }
}
