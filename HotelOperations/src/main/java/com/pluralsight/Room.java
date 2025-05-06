package com.pluralsight;

public class Room {

    private int numOfBeds = 0;
    private float price = 0;
    private boolean isDirty = false;
    private boolean isOccupied = false;


    public Room (int numOfBeds, float price, boolean isDirty, boolean isOccupied) {

        this.numOfBeds = numOfBeds;
        this.price = price;
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }
}
