package com.rehan.c6;

public class FlightDemo {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.addOnePassenger();
        flight.addOnePassenger(2);
        System.out.println(flight.getTotalCheckedbags());
        flight.addOnePassenger(2,2);
        int totalCheckBags = flight.getTotalCheckedbags();
        System.out.println("Total Bags = "+totalCheckBags);
        int totalPessengers = flight.getTotalPassenger();
        System.out.println("Total Pessenger = "+totalPessengers);

    }
}
