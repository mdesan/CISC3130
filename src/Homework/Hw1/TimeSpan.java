package Homework.Hw1;

import java.util.Objects;

public class TimeSpan implements Comparable<TimeSpan> {

    private int hours;
    private int minutes;


    private TimeSpan(int hours, int minutes) {
        this.hours = hours + (minutes/60);
        this.minutes = minutes % 60;
    }

    public static TimeSpan ofHours(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException();
        } else {
            return new TimeSpan(hours, 0);
        }
    }

    public static TimeSpan ofMinutes(int totalMinutes) {
        if (totalMinutes < 0) {
            throw new IllegalArgumentException();
        } else {
            return new TimeSpan(totalMinutes / 60, totalMinutes % 60);

        }
    }

    public static TimeSpan ofHoursAndMinutes(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        } else {
            return new TimeSpan(hours, minutes);
        }
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getTotalMinutes() {
        return (this.minutes) + (this.hours * 60);
    }


    @Override
    public String toString() {
        return this.hours + "h" + this.minutes + "m";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof TimeSpan) {
            TimeSpan other = (TimeSpan) o;
            return this.hours == other.hours && this.minutes == other.minutes;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.hours, this.minutes);
    }

    @Override
    public int compareTo(TimeSpan other) {
        int thisMins = (this.hours * 60) + (this.minutes);

        int otherMins = (other.getHours() * 60) + (other.getMinutes());

        if(thisMins > otherMins){return 1;}

        else if (thisMins < otherMins) {return -1;}

        else{return 0;}

    }

    public TimeSpan plus(TimeSpan other){
        int combinedMins = other.getTotalMinutes() + this.getTotalMinutes();
        return TimeSpan.ofMinutes(combinedMins);
    }

    public TimeSpan plusHours(int hours){
        if(hours < 0){
            throw new IllegalArgumentException();
        }
        return TimeSpan.ofHoursAndMinutes(this.hours + hours, this.minutes);
    }
    public TimeSpan plusMinutes(int minutes){
        if(minutes < 0){
            throw new IllegalArgumentException();
        }
        return TimeSpan.ofMinutes(this.getTotalMinutes() + minutes);
    }

    public TimeSpan plusHoursAndMinutes(int hours, int minutes){

        if(hours < 0 || minutes < 0 ){
            throw new IllegalArgumentException();
        }
        int totalMins = getTotalMinutes() + ((hours * 60) +(minutes));

        return TimeSpan.ofMinutes(totalMins);

    }

}




