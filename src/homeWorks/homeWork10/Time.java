package homeWorks.homeWork10;

public class Time {

   private int hours;
   private int minutes;
   private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        int newSeconds = seconds%60;
        int newMinutes = (((seconds-newSeconds)/60)+minutes)%60;
        int newHours =((((((seconds-newSeconds)/60)+minutes)+-newMinutes))/60)+hours;

        final String strSec = String.format("%02d", newSeconds);
        final String strMin= String.format("%02d", newMinutes);
        final String strHors= String.format("%02d", newHours);


        System.out.println(strHors+":" + strMin + ":" + strSec);
    }


}
