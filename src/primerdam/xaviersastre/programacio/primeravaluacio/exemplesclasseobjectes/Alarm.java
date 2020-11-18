
package alarm;

import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 * Modelizes an alarm.
 */
public class Alarm {

    /** Current datetime */
    private DateTime now;
    /** Alarm's datetime */
    private DateTime alarm;

    // Constructor
    public Alarm() {
        // Set current datetime
        this.now = new DateTime();
        // Deactivate the alarm (past datetime)
        this.alarm = this.now.minusDays(1);
    }

    // Methods

    /**
     * Sets alarm.
     * 
     * @param day alarm's day
     * @param month alarm's month
     * @param year alarm's year
     * @param hour alarm's hour
     * @param minute alarm's minute
     */
    public void setAlarmDateTime(int day, int month, int year, int hour, int minute) {
        this.alarm = new DateTime(year, month, day, hour, minute, 0, 0); // Till milliseconds
    }

    /**
     * Generates a string with datetime's alarm (format DD/MM/YYYY-hh:mm).
     * 
     * @return cadena amb el temps de l'alarma
     */
    public String getAlarmDatetime() {
        // Get alarm's year
        int year = this.alarm.getYear();
        // Get alarm's month
        int month = this.alarm.getMonthOfYear();
        // Get alarm's day
        int day = this.alarm.getDayOfMonth();
        // Get alarm's hour
        int hour = this.alarm.getHourOfDay();
        // Get alarm's minute
        int minute = this.alarm.getMinuteOfHour();
        // Build formatted string        
        return day + "/" + month + "/" + year + "-" + hour + ":" + minute;
        // Or using JodaDT:
        // return JodaDT.formatDDMMAAAAhhmm(this.alarm);
    }

    /**
     * Calculates how many seconds are left to alarm's datetime. 
     * Returns -1 if the alarm's datetime is in the past.
     * 
     * @return the number of seconds or -1
     */
    public long secondsLeft() {
        // Sets now with current datetime
        this.now = new DateTime();
        // Gets duration in seconds between now and alarm's datetime
        long t = JodaDT.durationInSeconds(now, alarm);
        if (t < 0) {
            t = -1;
        }
        return t;
    }

    /**
     * Generates a string with the time left to alarm's datetime. 
     * Returns null if the alarm's datetime is in the past.
     * 
     * @return a string
     */
    public String timeLeft() {
        String tl = null;
        // Set current datetime
        this.now = new DateTime();
        // Number of seconds since 01/01/1970-00:00
        long ns = this.now.getMillis();
        long as = this.alarm.getMillis();
        // If alarm's datetime is after now
        if (as > ns) {
            // Creates a period between two instants
            Period p = new Period(ns, as);
            // Builds a string with this period's time
            tl = p.getYears() + " anys, " + p.getMonths() + " mesos, " + p.getDays() + " dies, "
                    + p.getHours() + " hores, " + p.getMinutes() + " minuts, " + p.getSeconds()
                    + " segons.";
        }
        return tl;
    }

    /**
     * Determines if the alarm is ringing.
     * 
     * @return true if alrm is ringing, false otherwise
     */
    public boolean isRinging() {
        // Set current datetime
        this.now = new DateTime();
        // If alarm's datetime is now (don't control seconds), alarm is ringing
        boolean ring = alarm.getYear() == now.getYear()
                && alarm.getMonthOfYear() == now.getMonthOfYear()
                && alarm.getDayOfMonth() == now.getDayOfMonth()
                && now.getHourOfDay() == alarm.getHourOfDay()
                && now.getMinuteOfDay() == alarm.getMinuteOfDay();
        return ring;
    }

}
