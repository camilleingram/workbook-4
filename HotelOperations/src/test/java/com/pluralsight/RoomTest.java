package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_whenRoomIsAvailable_setToOccupiedAndDirty() {
        Room room = new Room(1, 20.45f, false, false);

        boolean roomState = room.checkIn();

        assertTrue(room.isDirty());
        assertTrue(room.isOccupied());
        assertTrue(roomState);


    }

    @Test
    public void checkIn_whenRoomIsOccupied_returnsFalse() {
        Room room = new Room(1, 20.45f, false, true);

        boolean roomState = room.checkIn();

        assertFalse(roomState);

    }

    @Test
    public void checkIn_whenRoomIsDirty_returnsFalse() {
        Room room = new Room(1, 20.45f, true, false);

        boolean roomState = room.checkIn();

        assertFalse(roomState);

    }

    @Test
    public void checkOut_whenRoomIsOccupied_setToNotOccupied(){
        Room room = new Room(1, 20.45f, true, true);

        boolean roomState = room.checkOut();

        assertFalse(room.isOccupied());
        assertTrue(roomState);


    }

    @Test
    public void checkOut_whenRoomIsUnoccupied_returnsFalse() {
        Room room = new Room(1, 20.45f, true, false);

        boolean roomState = room.checkOut();

        assertFalse(roomState);

    }

    @Test
    public void cleanRoom_whenRoomIsUnoccupiedAndDirty_setToClean() {
        Room room = new Room(1, 20.45f, true, false);

        boolean roomState = room.cleanRoom();

        assertFalse(room.isDirty());
        assertTrue(roomState);
    }

    @Test
    public void cleanRoom_whenRoomIsOccupied_returnsFalse() {
        Room room = new Room(1, 20.45f, true, true);

        boolean roomState = room.cleanRoom();

        assertFalse(roomState);
    }

    @Test
    public void cleanRoom_whenRoomIsClean_returnsFalse() {
        Room room = new Room(1, 20.45f, false, false);

        boolean roomState = room.cleanRoom();

        assertFalse(roomState);
    }


}