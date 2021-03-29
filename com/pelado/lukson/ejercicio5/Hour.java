package com.pelado.lukson.ejercicio5;

public class Hour {
    private int hour;
    private int minutes;
    private int seconds;

    public Hour()
    {}
    public Hour(int hour, int minutes, int seconds)
    {
        this.hour = (hour >= 00 && hour < 24) ? hour : null;
        this.minutes = (minutes >= 00 && minutes < 60) ? minutes : null;
        this.seconds = (seconds >= 00 && seconds < 60) ? seconds : null;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private void addHour() {
        if(this.hour == 23)
            setHour(0);
        else
            setHour(this.hour + 1);
    }

    private void addMinute() {
        if(this.minutes == 59) {
            setMinutes(0);
            addHour();
        }
        else {
            setMinutes(this.minutes + 1);
        }
    }

    private Hour addSecond() {
        if(this.seconds == 59) {
            setSeconds(0);
            addMinute();
        }
        else {
            setSeconds(this.seconds + 1);
        }
        return this;
    }

    private void deleteHour() {
        if(this.hour == 0)
            setHour(23);
        else
            setHour(this.hour - 1);
    }

    private void deleteMinute() {
        if(this.minutes == 0) {
            setMinutes(59);
            deleteHour();
        }
        else {
            setMinutes(this.minutes - 1);
        }
    }

    private Hour deleteSecond() {
        if(this.seconds == 0) {
            setSeconds(59);
            deleteMinute();
        }
        else {
            setSeconds(this.seconds - 1);
        }
        return this;
    }

    //formateo y printeo de la hora
    @Override
    public String toString() { //override del toString de Object Class
        String hour = String.format("%02d", getHour());
        String minute = String.format("%02d", getMinutes());
        String second = String.format("%02d", getSeconds());

        return hour + ":" + minute + ":" + second;
    }
}
