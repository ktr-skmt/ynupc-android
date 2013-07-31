package jp.ac.ynu.pc.enums;

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
}
