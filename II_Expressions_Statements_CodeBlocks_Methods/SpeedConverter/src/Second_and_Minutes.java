public class Second_and_Minutes {

    public static String getDurationString( int minutes, int seconds){
        String durationString = null;
        if (minutes < 0 || seconds < 0 || seconds > 59) durationString = "Invalid value";
        else {
            int hours = minutes / 60;
            minutes = minutes % 60;
            durationString = hours + "h " + minutes + "m " + seconds + "s ";
        }return durationString;
    }

    public static String getDurationString(int seconds){
        String durationString = null;
        if (seconds < 0) durationString = "Invalid value";
        else {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            durationString = getDurationString(minutes, seconds);
        }return durationString;
    }
}
