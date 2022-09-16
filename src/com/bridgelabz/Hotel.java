package com.bridgelabz;


import java.time.LocalDate;

    public class Hotel {
        private String hotelName;
        private double weekdayRegularCustomerCost;
        private double weekendRegularCustomerCost;
        private double weekdayRewardsCustomerCost;
        private double weekendRewardsCustomerCost;
        private double hotelCost;

        public double getHotelCost() {
            return hotelCost;
        }

        public void setHotelCost(double hotelCost) {
            this.hotelCost = hotelCost;
        }

        public Hotel() {
        }

        public Hotel(String hotelName, double weekdayRegularCustomerCost, double weekendRegularCustomerCost, double weekdayRewardsCustomerCost, double weekendRewardsCustomerCost) {
            this.hotelName = hotelName;
            this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
            this.weekendRegularCustomerCost = weekendRegularCustomerCost;
            this.weekdayRewardsCustomerCost = weekdayRewardsCustomerCost;
            this.weekendRewardsCustomerCost = weekendRewardsCustomerCost;
        }

        public String getHotelName() {
            return hotelName;
        }

        public void setHotelName(String hotelName) {
            this.hotelName = hotelName;
        }

        public double getWeekdayRegularCustomerCost() {
            return weekdayRegularCustomerCost;
        }

        public void setWeekdayRegularCustomerCost(double weekdayRegularCustomerCost) {
            this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
        }

        public double getWeekendRegularCustomerCost() {
            return weekendRegularCustomerCost;
        }

        public void setWeekendRegularCustomerCost(double weekendRegularCustomerCost) {
            this.weekendRegularCustomerCost = weekendRegularCustomerCost;
        }

        public double getWeekdayRewardsCustomerCost() {
            return weekdayRewardsCustomerCost;
        }

        public void setWeekdayRewardsCustomerCost(double weekdayRewardsCustomerCost) {
            this.weekdayRewardsCustomerCost = weekdayRewardsCustomerCost;
        }

        public double getWeekendRewardsCustomerCost() {
            return weekendRewardsCustomerCost;
        }

        public void setWeekendRewardsCustomerCost(double weekendRewardsCustomerCost) {
            this.weekendRewardsCustomerCost = weekendRewardsCustomerCost;
        }

        public void getCheapestHotel(LocalDate startDate, LocalDate endDate) {

        }

        @Override
        public String toString() {
            return "Hotel{" +
                    "hotelName='" + hotelName + '\'' +
                    ", weekdayRegularCustomerCost=" + weekdayRegularCustomerCost +
                    ", weekendRegularCustomerCost=" + weekendRegularCustomerCost +
                    ", weekdayRewardsCustomerCost=" + weekdayRewardsCustomerCost +
                    ", weekendRewardsCustomerCost=" + weekendRewardsCustomerCost +
                    ", hotelCost=" + hotelCost +
                    '}';
        }
    }