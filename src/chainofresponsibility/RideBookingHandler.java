package chainofresponsibility;

public class RideBookingHandler extends RequestHandler {
    public RideBookingHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handle(Request request) {
        if (request.getPaymentStatus() == PaymentStatus.COMPLETE && request.getRequestType() == RequestType.BOOK_A_RIDE) {
            // book a ride here
            System.out.println("Booking a ride here!");
            request.setRequestStatus(RequestStatus.SUCCEEDED);
        }
        if (super.getNextHandler() != null) {
            super.getNextHandler().handle(request);
        }
    }
}
