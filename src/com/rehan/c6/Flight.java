package com.rehan.c6;

public class Flight {
    private static final int Total_seat = 150;
    private int totalCheckedbags;
    private int totalPassenger;
    public void addOnePassenger(int bags,int carryOns){
        int totalBags = bags;
        if(carryOns>2){
            totalBags = bags + carryOns -2;
        }
        addOnePassenger(totalBags);
    }
    public void addOnePassenger(int bags){
        if(isSeatAvailable()){
            addOnePassenger();
            totalCheckedbags +=bags;
        }
    }
    public boolean isSeatAvailable(){
        return totalCheckedbags<Total_seat;
    }
    public void addOnePassenger(){
        if(isSeatAvailable()){
            totalPassenger += 1;
        }
    }
    public int getTotalCheckedbags(){
        return totalCheckedbags;
    }
    public int getTotalPassenger(){
        return totalPassenger;
    }
}
