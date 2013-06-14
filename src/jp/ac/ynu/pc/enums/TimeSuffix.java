package jp.ac.ynu.pc.enums;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/05/02
 * Time: 0:04
 * To change this template use File | Settings | File Templates.
 */
public enum TimeSuffix {
    TODAY("_today"),
    NOW("_now");

    private final String timeSuffix;
    private TimeSuffix(String timeSuffix){
        this.timeSuffix = timeSuffix;
    }

    public String getTimeSuffix(){
        return timeSuffix;
    }
}
