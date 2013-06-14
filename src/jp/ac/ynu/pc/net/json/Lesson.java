package jp.ac.ynu.pc.net.json;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/04/29
 * Time: 20:35
 * To change this template use File | Settings | File Templates.
 */
public class Lesson {
    private static final String KEY_FACULTY = "faculty";
    private static final String KEY_GRADE = "grade";
    private static final String KEY_SUBJECT = "subject";
    private static final String KEY_LECTURER = "lecturer";
    private static final String KEY_FIXED_NUMBER = "fixed_number";
    private static final String KEY_DATE = "date";

    private String faculty;
    private String grade;
    private String subject;
    private String lecturer;
    private String fixedNumber;
    private String date;

//    {
//
//        "faculty": "工:建設",
//            "grade": "3年",
//            "subject": "構造力学",
//            "lecturer": "川村 恭己",
//            "fixed_number": "40名",
//            "date": "#6.7月初に2回程度"
//
//    }

    public Lesson(String jsonText) throws JSONException {
        this(new JSONObject(jsonText));
    }

    public Lesson(JSONObject json) throws JSONException {
        this.faculty = json.getString(KEY_FACULTY);
        this.grade = json.getString(KEY_GRADE);
        this.subject = json.getString(KEY_SUBJECT);
        this.lecturer = json.getString(KEY_LECTURER);
        this.fixedNumber = json.getString(KEY_FIXED_NUMBER);
        this.date = json.getString(KEY_DATE);
    }
}
