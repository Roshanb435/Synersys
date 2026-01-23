package com.ticketbooking;

import java.util.Objects;

public class Coupon {

    private String dateOfRedemption;
    private String ticketClass;
    private boolean standby;
    private String mealCode;

    public Coupon(String dateOfRedemption, String ticketClass, boolean standby, String mealCode) {
        this.dateOfRedemption = dateOfRedemption;
        this.ticketClass = ticketClass;
        this.standby = standby;
        this.mealCode = mealCode;
    }

    public String getMealCode() {
        return mealCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketClass, mealCode);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Coupon)) return false;
        Coupon other = (Coupon) obj;
        return Objects.equals(ticketClass, other.ticketClass)
                && Objects.equals(mealCode, other.mealCode);
    }
}
