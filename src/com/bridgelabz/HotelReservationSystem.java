package com.bridgelabz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HotelReservationSystem {
    static List<Hotel> hotelDataList = new ArrayList<>();
    public static void findCheapestHotelWeekdays(String bookingFromDate, String leavingDate) {
        LocalDate checkInDate = LocalDate.parse(bookingFromDate, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        LocalDate checkOutDate = LocalDate.parse(leavingDate, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        int stayingDays = checkOutDate.getDayOfMonth() - checkInDate.getDayOfMonth() + 1;
        Optional<Hotel> cheapestHotel = hotelDataList.stream().min(Comparator.comparing(Hotel::getWeekdayRates));

        Hotel hotelData = new Hotel();
        hotelData.setHotelName(cheapestHotel.get().hotelName);
        hotelData.setTotalPrice(cheapestHotel.get().getWeekdayRates() * stayingDays);
        System.out.println("Hotel Name " + hotelData.getHotelName());
        System.out.println("Total price in weekdays : " + stayingDays + hotelData.getTotalPrice());
    }

    public static void findCheapestHotelWeekend(String bookingFromDate, String leavingDate) {
        LocalDate checkInDate = LocalDate.parse(bookingFromDate, DateTimeFormatter.ISO_DATE);
        LocalDate checkOutDate = LocalDate.parse(leavingDate, DateTimeFormatter.ISO_DATE);
        int stayingDays = checkOutDate.getDayOfMonth() - checkInDate.getDayOfMonth() + 1;
        Optional<Hotel> cheapestHotel = hotelDataList.stream().min(Comparator.comparing(Hotel::getWeekdayRates));

        Hotel hotelData = new Hotel();
        hotelData.setHotelName(cheapestHotel.get().hotelName);
        hotelData.setTotalPrice(cheapestHotel.get().getWeekendRates() * stayingDays);
        System.out.println("Hotel Name " + hotelData.getHotelName());
        System.out.println("Total price in weekends : " + stayingDays + hotelData.getTotalPrice());
    }
}
