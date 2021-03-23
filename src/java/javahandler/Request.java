package javahandler;
import java.math.BigDecimal;

public class Request {
    private Double rate;
    private int nper;
    private Double pv;

    public Request(){}

    public Request(Double rate, int nper, Double pv) {
        this.rate = rate;
        this.nper = nper;
        this.pv   = pv;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public int getNper() {
        return nper;
    }

    public void setNper(int nper) {
        this.nper = nper;
    }

    public Double getPv() {
        return pv;
    }

    public void setPv(Double pv) {
        this.pv = pv;
    }
}
