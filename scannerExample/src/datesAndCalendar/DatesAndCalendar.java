package datesAndCalendar;

import java.util.Calendar;
import java.util.Date;

public class DatesAndCalendar {
    public static void main(String[] args){
        displayCurrentDate();
        displaySetDate();
    }
    static void displayCurrentDate(){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        Date date = new java.util.Date();
        cal.setTime(date);
        System.out.println(cal.getTime());
    }

    static void displaySetDate(){
        Calendar cal = Calendar.getInstance();
        cal.set(2031,02,02);
        Date date = cal.getTime();
        System.out.println(date);
    }
}
