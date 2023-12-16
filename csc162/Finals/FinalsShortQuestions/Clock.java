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

    public void setTime(int hr,int min, int sec) {
        this.hr = hr;
        this.min =min;
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

}
