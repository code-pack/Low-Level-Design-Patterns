package chainofresponsibility;

public class Request {
    private RequestType requestType;
    private String authenticationToken;
    private String userId;
    private PaymentStatus paymentStatus;
    private RequestStatus requestStatus;

    public Request(RequestType requestType, String token) {
        this.requestType = requestType;
        this.authenticationToken = token;
        this.requestStatus = RequestStatus.IN_PROGRESS;
        this.paymentStatus = PaymentStatus.UNKNOWN;
        this.userId = null;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getAuthenticationToken() {
        return authenticationToken;
    }
}
