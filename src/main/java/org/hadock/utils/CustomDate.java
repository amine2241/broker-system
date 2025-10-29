package org.hadock.utils;

public class CustomDate {
    private int year;
    private int month;
    private int day;
    public CustomDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public CustomDate(){

    }

    @Override
    public String toString() {
        return "CustomDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
