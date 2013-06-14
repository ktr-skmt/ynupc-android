package jp.ac.ynu.pc.net;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import jp.ac.ynu.pc.enums.Room;
import jp.ac.ynu.pc.enums.TimeSuffix;
import jp.ac.ynu.pc.enums.Timetable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/05/01
 * Time: 23:18
 * To change this template use File | Settings | File Templates.
 */
public class ApiRequest {
    private static final String BASE_URL = "http://pcavil.itsc.ynu.ac.jp/api.php";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void getRoomInformation(Room room, AsyncHttpResponseHandler handler){
        RequestParams params = new RequestParams();
        params.put("room", room.getRoomName());
        client.get(BASE_URL, params, handler);
    }

    public static void getTimetable(Timetable timetable, AsyncHttpResponseHandler handler){
        getTimetableWithTimeSuffix(timetable, null, null, handler);
    }

    public static void getTimetable(Timetable timetable, Room room, AsyncHttpResponseHandler handler){
        getTimetableWithTimeSuffix(timetable, room, null, handler);
    }

    public static void getTimetableWithTimeSuffix(Timetable timetable, Room room, TimeSuffix timeSuffix, AsyncHttpResponseHandler handler){
        RequestParams params = new RequestParams();
        String timetableStr = timetable.getTimeId();
        if(timeSuffix != null){
            timetableStr += timeSuffix.getTimeSuffix();
        }
        params.put("timetable", timetableStr);

        if(room != null){
            params.put("room", room.getRoomName());
        }

        client.get(BASE_URL, params, handler);
    }

    public static void getMapInformation(AsyncHttpResponseHandler handler){
        Map<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("map", "default");
        RequestParams params = new RequestParams(paramMap);
        client.get(BASE_URL, params, handler);
    }
}
