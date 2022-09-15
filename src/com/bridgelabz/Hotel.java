package com.bridgelabz;

public class Hotel {
    private String hotelName;
    private double weekdayRegularCustomerCost;
    private double weekendRegularCustomerCost;
    private double weekdayRewardsCustomerCost;
    private double weekendRewardsCustomerCost;

    public Hotel() {
    }

    public Hotel(String hotelName, double weekdayRegularCustomerCost, double weekendRegularCustomerCost, double weekdayRewardsCustomerCost, double weekendRewardsCustomerCost) {
        this.hotelName = hotelName;
        this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
        this.weekendRegularCustomerCost = weekendRegularCustomerCost;
        this.weekdayRewardsCustomerCost = weekdayRewardsCustomerCost;
        this.weekendRewardsCustomerCost = weekendRewardsCustomerCost;

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayRegularCustomerCost=" + weekdayRegularCustomerCost +
                ", weekendRegularCustomerCost=" + weekendRegularCustomerCost +
                ", weekdayRewardsCustomerCost=" + weekdayRewardsCustomerCost +
                ", weekendRewardsCustomerCost=" + weekendRewardsCustomerCost +
                '}';
    }
}
