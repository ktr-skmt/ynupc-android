package jp.ac.ynu.pc.enums;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/07/28
 * Time: 20:42
 * To change this template use File | Settings | File Templates.
 */
public enum Period {
    FIRST("1限"),
    SECOND("2限"),
    THIRD("3限"),
    FORTH("4限"),
    FIFTH("5限"),
    NIGHT("夜間");

    private Period(String key){
        this.key = key;
    }

    public final String key;
}
