package com.jzy.test.homework.work_before_11_3;

/**
 * @author jzy
 */
public class Clock {
    private Display hour;
    private Display minute;
    private Display second;

    public Clock() {}

    public Clock(Display hour, Display minute, Display second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void start() {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    StringBuilder res = new StringBuilder();
                    if (hour.getValue() < 10) {
                        res.append('0');
                    }
                    res.append(hour.getValue()).append(":");
                    if (minute.getValue() < 10) {
                        res.append('0');
                    }
                    res.append(minute.getValue()).append(":");
                    if (second.getValue() < 10) {
                        res.append('0');
                    }
                    res.append(second.getValue());
                    System.out.println(res);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    second.increase();
                    if (second.getValue() == second.getLimit()) {
                        second.setValue(0);
                        minute.increase();
                    }
                    if (minute.getValue() == minute.getLimit()) {
                        minute.setValue(0);
                        hour.increase();
                    }
                    if (hour.getValue() == hour.getLimit()) {
                        hour.setValue(0);
                    }
                }
            }
        }.start();
    }

    public Display getHour() {
        return hour;
    }

    public Display getSecond() {
        return second;
    }

    public void setSecond(Display second) {
        this.second = second;
    }

    public void setHour(Display hour) {
        this.hour = hour;
    }

    public Display getMinute() {
        return minute;
    }

    public void setMinute(Display minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "time: " + hour.getValue() + ":" + minute.getValue() + ":" + second.getValue();
    }
}
