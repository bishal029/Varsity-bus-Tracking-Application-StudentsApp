package com.shayekh.android.students;

public class Pojo {


    private String time,route,day,number;

    public Pojo(String time, String route, String day, String number) {
        this.time = time;
        this.route = route;
        this.day = day;
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public String getRoute() {
        return route;
    }

    public String getDay() {
        return day;
    }

    public String getNumber() {
        return number;
    }
}
