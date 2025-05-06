package com.pluralsight;

public class Reservation {
    private String roomType = "";
    private int numOfNights = 0;
    private boolean isWeekend = false;


    public Reservation(String roomType, int numOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numOfNights = numOfNights;
        this.isWeekend = isWeekend;

    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public float getPrice() {
        float price = 0;

        if(roomType.equalsIgnoreCase("king")) {
            price = 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124;
        };
        return price;
    }

    public float getReservationTotal() {
        float price = getPrice();

        price *= numOfNights;

        if(isWeekend) {
            price = (price * 0.1f) + price;
        }
        return price;
    }
}
