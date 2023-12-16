package FinalsShortQuestions;

public class Clock {
    private int hr;
    private int min;
    private int sec;

    public Clock() {

    }

    public Clock(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public void setTime(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return hr;
    }

    public int getMinutes() {
        return min;
    }

    public int getSeconds() {
        return sec;
    }

    public void printTime() {
        System.out
                .print("The time as of now in the form of Hour, Minutes and Seconds is " + hr + " " + min + " " + sec);
    }

    public int incrementHours(int hr) {
        return hr++;
    }

    public int incrementMinutes(int min) {
        return min++;
    }

    public int incrementSeconds(int sec) {
        return sec++;
    }

    public boolean equals(Clock clock) {
        return (sec == clock.hr
                && sec == clock.min
                && sec == clock.sec);
    }

    public void makeCopy(Clock clock) {
        hr = clock.hr;
        min = clock.min;
        sec = clock.sec;
    }

    public Clock getCopy() {
        Clock temp = new Clock();
        temp.hr = hr;
        temp.min = min;
        temp.sec = sec;

        return temp;
    }

}
