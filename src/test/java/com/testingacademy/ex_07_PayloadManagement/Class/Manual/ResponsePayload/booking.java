package com.testingacademy.ex_07_PayloadManagement.Class.Manual.ResponsePayload;

import com.testingacademy.ex_07_PayloadManagement.Class.Manual.RequestPayload.Booking;

public class booking {
    public Integer getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(Integer booking_id) {
        this.booking_id = booking_id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    private Integer booking_id;
    private Booking booking;

}
