package javahandler;
import java.math.BigDecimal;

public class Response {
    private Double pmt;

    public Response(){}

    public Response(Double pmt) {
        this.pmt = pmt;
    }

    public Double getPmt() {
        return pmt;
    }

    public void setPmt(Double pmt) {
        this.pmt = pmt;
    }
}
