package com.gla;

interface Reservable {
    void reserveItem(String user);
    boolean checkAvailability();
}
