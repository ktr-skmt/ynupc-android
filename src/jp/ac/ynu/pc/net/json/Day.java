package jp.ac.ynu.pc.net.json;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Day {
    private static final String[] PERIODS = {"1限","2限","3限","4限","5限","夜間"};

    private Map<String, Period> periodMap;

    public Day(String jsonText) throws JSONException {
        this(new JSONObject(jsonText));
    }

    public Day(JSONObject json) throws JSONException {
        periodMap = new HashMap<String, Period>();

        for(String key : PERIODS){
            Period period = new Period(json.getJSONArray(key));
            periodMap.put(key, period);
        }
    }


}
