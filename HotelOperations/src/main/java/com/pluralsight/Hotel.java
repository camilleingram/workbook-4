package com.pluralsight;

public class Hotel {

    private String name = "";
    private int numOfSuites = 0;
    private int numOfRooms = 0;
    private int bookedSuites = 0;
    private int bookedBasicRooms = 0;

    public Hotel(String name, int numOfSuites, int numOfRooms) {
        this.name = name;
        this.numOfRooms = numOfRooms;
        this.numOfSuites = numOfSuites;
    }

    public Hotel(String name, int numOfSuites, int numOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numOfSuites = numOfSuites;
        this.numOfRooms = numOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

    public int getNumOfSuites() {
        return numOfSuites;
    }

    void setNumOfSuites(int numOfSuites) {
        this.numOfSuites = numOfSuites;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    void setBookedSuites(int bookedSuites) {
        this.bookedSuites = bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    void setBookedBasicRooms(int bookedBasicRooms) {
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int roomRequest, boolean isSuite) {
        if(isSuite && roomRequest <= numOfSuites) {
            bookedSuites += roomRequest;
            numOfSuites -= roomRequest;
            System.out.printf("You have booked %d suites", roomRequest);
            return true;
        } else if(!isSuite && roomRequest <= numOfRooms) {
            bookedBasicRooms += roomRequest;
            numOfRooms -= roomRequest;
            System.out.printf("You have booked %d basic rooms", roomRequest);
            return true;
        } else {
            System.out.println("Your room was not able to be booked.");
            return false;
        }
    }

    public int getAvailableSuites() {
        return numOfSuites;
    }

    public int getAvailableRooms() {
        return numOfRooms;
    }

}
