package jp.ac.ynu.pc.net.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/04/29
 * Time: 20:42
 * To change this template use File | Settings | File Templates.
 */
public class Period {
    private List<Lesson> lessons;

    public Period(String jsonText) throws JSONException {
        this(new JSONArray(jsonText));
    }

    public Period(JSONArray json) throws JSONException {
        lessons = new ArrayList<Lesson>();

        for(int i = 0; i < json.length(); ++i){
            JSONObject lesson = json.getJSONObject(i);
            lessons.add(new Lesson(lesson));
        }
    }
}
