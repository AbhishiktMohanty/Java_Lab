public class Time {
    private int hours;
    private int minutes;

    public void setTime(int hr, int min) {
        hours = hr;
        minutes = min;
    }

    public Time add(Time other) {
        Time result = new Time();
        result.hours = this.hours + other.hours;
        result.minutes = this.minutes + other.minutes;
        if (result.minutes >= 60) {
            result.hours++;
            result.minutes -= 60;
        }
        return result;
    }

    public void show() {
        System.out.printf("%02d:%02d", hours, minutes);
    }
}
