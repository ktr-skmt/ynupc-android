package jp.ac.ynu.pc.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/07/28
 * Time: 20:56
 * To change this template use File | Settings | File Templates.
 */
public class Lesson {
    private static final String KEY_FACULTY = "faculty";
    private static final String KEY_GRADE = "grade";
    private static final String KEY_SUBJECT = "subject";
    private static final String KEY_LECTURER = "lecturer";
    private static final String KEY_FIXED_NUMBER = "fixed_number";
    private static final String KEY_DATE = "date";

    /** 学部・学科 */
    private String faculty;
    /** 学年 */
    private String grade;
    /** 科目名 */
    private String subject;
    /** 教師名 */
    private String lecturer;
    /** 人数 */
    private String fixedNumber;
    /** 実施期間 */
    private String date;

    Lesson(String jsonText) throws JSONException {
        this(new JSONObject(jsonText));
    }

    Lesson(JSONObject json) throws JSONException {
        this.faculty = json.getString(KEY_FACULTY);
        this.grade = json.getString(KEY_GRADE);
        this.subject = json.getString(KEY_SUBJECT);
        this.lecturer = json.getString(KEY_LECTURER);
        this.fixedNumber = json.getString(KEY_FIXED_NUMBER);
        this.date = json.getString(KEY_DATE);
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGrade() {
        return grade;
    }

    public String getSubject() {
        return subject;
    }

    public String getLecturer() {
        return lecturer;
    }

    public String getFixedNumber() {
        return fixedNumber;
    }

    public String getDate() {
        return date;
    }
}
