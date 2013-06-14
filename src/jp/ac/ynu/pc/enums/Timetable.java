package jp.ac.ynu.pc.enums;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/05/01
 * Time: 23:49
 * To change this template use File | Settings | File Templates.
 */
public enum Timetable {
    ALL("all"),
    THIS("this"),
    SPRING_SECTION("1"),
    SUMMER_VACATION("2"),
    AUTUMN_SECTION("3"),
    WINTER_VACATION("4"),
    SPRING_VACATION("5");

    private final String timeId;
    private Timetable(String timeId){
        this.timeId = timeId;
    }

    public String getTimeId(){
        return timeId;
    }
}
