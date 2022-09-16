package com.bridgelabz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class HotelReservationSystem {
    private LocalDate fromDate;
    private LocalDate toDate;
    private long noOfDays;

    public long getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(long noOfDays) {
        this.noOfDays = noOfDays;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public void getDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the In Date to reserve the hotel YYYY-MM-DD");
        fromDate = LocalDate.parse(scanner.next());
        System.out.println("Enter the To Date to reserve the hotel YYYY-MM-DD");
        toDate = LocalDate.parse(scanner.next());
    }

    public void findingHotelCost(Hotel hotel) {
        // This will give no of days between from date and to date
        try {
            hotel.setHotelCost((noOfDays * hotel.getWeekdayRegularCustomerCost()));
            System.out.println(hotel.getHotelCost());
        } catch (Exception e) {
            System.out.println("Enter the Date in proper format: " + e);
        }
    }

    public void countDays() {
        noOfDays = ChronoUnit.DAYS.between(fromDate, toDate);
        System.out.println("No of Days Staying at hotel: " + noOfDays);
    }

    public void comparingHotelAmount(Hotel hotel1, Hotel hotel2, Hotel hotel3) {
        if (hotel1.getHotelCost() < hotel2.getHotelCost() && hotel1.getHotelCost() < hotel3.getHotelCost()) {
            System.out.println("The Cheapest hotel is " + hotel1.getHotelName() + "It costs " + hotel1.getHotelCost());
        } else if (hotel2.getHotelCost() < hotel3.getHotelCost()) {
            System.out.println("The Cheapest hotel is " + hotel2.getHotelName() + "It costs " + hotel2.getHotelCost());
        } else
            System.out.println("The Cheapest hotel is " + hotel3.getHotelName() + "It costs " + hotel3.getHotelCost());
    }

    @Override
    public String toString() {
        return "HotelReservationSystem{" +
                "fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", noOfDays=" + noOfDays +
                '}';
    }
}