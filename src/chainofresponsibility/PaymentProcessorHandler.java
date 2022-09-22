package chainofresponsibility;

public class PaymentProcessorHandler extends RequestHandler {
    public PaymentProcessorHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handle(Request request) {
        if (request.getPaymentStatus() == PaymentStatus.UNKNOWN || request.getPaymentStatus() == PaymentStatus.PENDING) {
            // process the payment here
            System.out.println("Collecting the past payment now!");
            request.setPaymentStatus(PaymentStatus.COMPLETE);
        }
        if (super.getNextHandler() != null) {
            super.getNextHandler().handle(request);
        }
    }
}
