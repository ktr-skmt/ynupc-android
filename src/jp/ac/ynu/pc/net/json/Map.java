package jp.ac.ynu.pc.net.json;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/04/29
 * Time: 22:08
 * To change this template use File | Settings | File Templates.
 */
public class Map {
    private static final String KEY_ROOM_NAME = "room_name";
    private static final String KEY_ENGLISH_ROOM_NAME = "english_room_name";
    private static final String KEY_MODE = "mode";
    private static final String KEY_AVAILABLE_STILL = "available_still";
    private static final String KEY_TOMORROW_OPENING_TIME = "tomorrow_opening_time";
    private static final String KEY_TOMORROW_CLOSING_TIME = "tomorrow_closing_time";
    private static final String KEY_TODAY_OPENING_TIME = "today_opening_time";
    private static final String KEY_TODAY_CLOSING_TIME = "today_closing_time";
    private static final String KEY_SUBJECT = "subject";
    private static final String KEY_LECTURE = "lecture";

    private String roomName;
    private String roomNameInEnglish;
    private String mode;
    private String availableStill;
    private String tomorrowOpeningTime;
    private String tomorrowClosingTime;
    private String todayOpeningTime;
    private String todayClosingTime;
    private String subject;
    private String lecturer;


    public Map(JSONObject json) throws JSONException {
        roomName = json.getString(KEY_ROOM_NAME);
        roomNameInEnglish = json.getString(KEY_ENGLISH_ROOM_NAME);
        mode = json.getString(KEY_MODE);
        availableStill = json.getString(KEY_AVAILABLE_STILL);
        tomorrowOpeningTime = json.getString(KEY_TOMORROW_OPENING_TIME);
        tomorrowClosingTime = json.getString(KEY_TOMORROW_CLOSING_TIME);
        todayOpeningTime = json.getString(KEY_TODAY_OPENING_TIME);
        todayClosingTime = json.getString(KEY_TODAY_CLOSING_TIME);
        subject = json.getString(KEY_SUBJECT);
        lecturer = json.getString(KEY_LECTURE);
    }
}
