package jp.ac.ynu.pc.enums;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/07/28
 * Time: 20:45
 * To change this template use File | Settings | File Templates.
 */
public enum Day {
    MON("月曜"),
    TUE("火曜"),
    WED("水曜"),
    THU("木曜"),
    FRI("金曜");

    private Day(String key){
        this.key = key;
    }

    public final String key;

    public static Day getCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        Date currentTime = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.JAPANESE);
        String dateString = sdf.format(currentTime);

        if (dateString.equals("月")) {
            return Day.MON;
        } else if (dateString.equals("火")) {
            return Day.TUE;
        } else if (dateString.equals("水")) {
            return Day.WED;
        } else if (dateString.equals("木")) {
            return Day.THU;
        } else if (dateString.equals("金")) {
            return Day.FRI;
        }
        return null;
    }

    public static int getCurrentDayPosition(){
        Day day = getCurrentDay();

        for(int i = 0; i < values().length; ++i){
            if(day == values()[i]){
                return i;
            }
        }

        return -1;
    }
}
