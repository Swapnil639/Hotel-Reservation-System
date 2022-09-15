package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");

        List<Hotel> hotelDataList = new ArrayList<>();
        Hotel hotel1 = new Hotel("LakeWood",200, 100, 120, 90);
        Hotel hotel2 = new Hotel("RiverWood", 120, 90, 100, 90);
        Hotel hotel3 = new Hotel("BridgeWood", 150, 120, 100, 90);
        hotelDataList.add(hotel1);
        hotelDataList.add(hotel2);
        hotelDataList.add(hotel3);
        hotelDataList.forEach(System.out::println);
    }
}
