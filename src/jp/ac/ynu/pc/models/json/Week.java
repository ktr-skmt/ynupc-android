package jp.ac.ynu.pc.models.json;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Week {
    private static final String[] DAYS = {"月曜", "火曜", "水曜", "木曜", "金曜"};
    private Map<String, Day> dayMap;

    public Week(String jsonText) throws JSONException {
        this(new JSONObject(jsonText));
    }

    public Week(JSONObject json) throws JSONException {
        dayMap = new HashMap<String, Day>();

        for(String key : DAYS){
            Day day = new Day(json.getJSONObject(key));
            dayMap.put(key, day);
        }
    }
}
