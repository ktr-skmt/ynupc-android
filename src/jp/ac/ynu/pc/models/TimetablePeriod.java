package jp.ac.ynu.pc.models;

import jp.ac.ynu.pc.enums.Day;
import jp.ac.ynu.pc.enums.Period;
import jp.ac.ynu.pc.enums.TimeSuffix;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 時間割
 */
public class TimetablePeriod {
    private Map<Day, Map<Period, List<Lesson>>> map;

    /**
     * TimeSuffixなしの場合の初期化
     *
     * @param object
     */
    public TimetablePeriod(JSONObject object) {
        map = new HashMap<Day, Map<Period, List<Lesson>>>();

        for (Day day : Day.values()) {
            try {
                JSONObject dayObject = object.getJSONObject(day.key);
                map.put(day, initDay(dayObject));
            } catch (JSONException e) {

            }
        }
    }

    /**
     * TimeSuffixがTODAYの場合の初期化
     * NOWの場合は直接Lessonを利用
     *
     * @param object
     * @param suffix
     */
    public TimetablePeriod(JSONObject object, TimeSuffix suffix) {
        if (suffix == null || suffix == TimeSuffix.NOW) {
            return;
        }

        if (suffix == TimeSuffix.TODAY) {
            map = new HashMap<Day, Map<Period, List<Lesson>>>();

            Day day = getCurrentDay();
            if(day == null){
                return;
            }

            map.put(day, initDay(object));
        }
    }

    private Map<Period, List<Lesson>> initDay(JSONObject object) {
        Map<Period, List<Lesson>> periodListMap = new HashMap<Period, List<Lesson>>();

        for (Period period : Period.values()) {
            try {
                JSONArray array = object.getJSONArray(period.key);
                List<Lesson> lessons = new ArrayList<Lesson>(array.length());
                for (int i = 0; i < array.length(); ++i) {
                    lessons.add(initLesson(array.getJSONObject(i)));
                }
                periodListMap.put(period, lessons);
            } catch (JSONException e) {

            }
        }

        return periodListMap;
    }

    public List<Lesson> getLessons(){
        return null;
    }

    private Lesson initLesson(JSONObject object) throws JSONException {
        return new Lesson(object);
    }

    private Day getCurrentDay() {
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




}

