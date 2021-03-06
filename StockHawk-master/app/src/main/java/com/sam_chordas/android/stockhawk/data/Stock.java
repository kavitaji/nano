package com.sam_chordas.android.stockhawk.data;

import java.util.Date;

/**
 * Created by Kavitha on 10/23/2016.
 */

public class Stock {



    private String symbol;
    private Date date;
    private Float open;
    private Float high;
    private Float low;

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    private String dateString;

    public Float getXaxis() {
        return xaxis;
    }

    public void setXaxis(Float xaxis) {
        this.xaxis = xaxis;
    }

    private Float xaxis;

    public Stock() {

    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getOpen() {
        return open;
    }

    public void setOpen(Float open) {
        this.open = open;
    }

    public Float getHigh() {
        return high;
    }

    public void setHigh(Float high) {
        this.high = high;
    }

    public Float getLow() {
        return low;
    }

    public void setLow(Float low) {
        this.low = low;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", date=" + date +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", dateString='" + dateString + '\'' +
                ", xaxis=" + xaxis +
                '}';
    }
}
