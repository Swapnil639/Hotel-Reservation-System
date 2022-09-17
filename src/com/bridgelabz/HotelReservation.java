package com.bridgelabz;

import java.util.*;

public class HotelReservation {
    static List<Hotel> hotelDataList = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
        Hotel hotel1 = new Hotel("LakeWood",200, 100);
        Hotel hotel2 = new Hotel("RiverWood", 120, 90);
        Hotel hotel3 = new Hotel("BridgeWood", 150, 120);
        hotelDataList.add(hotel1);
        hotelDataList.add(hotel2);
        hotelDataList.add(hotel3);
        hotelDataList.forEach(System.out::println);


        HotelReservationSystem hrs = new HotelReservationSystem();
        hrs.findCheapestHotelWeekdays("06-Dec-2021", "09-Dec-2021");
        hrs.findCheapestHotelWeekend("11-Jan-2022", "14-Jan-2022");


    }
}
