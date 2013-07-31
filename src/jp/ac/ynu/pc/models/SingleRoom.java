package jp.ac.ynu.pc.models;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import jp.ac.ynu.pc.enums.Room;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

public class SingleRoom implements RoomInfo, Parcelable {
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

    private static final String KEY_PC_ID = "pc_id";
    private static final String KEY_AVAILABLE_SEATS = "available_seats";
    private static final String KEY_TOTAL_SEATS = "total_seats";

    private Room room;
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

    private int availableSeats;
    private int totalSeats;
    private HashSet<Integer> pcIds = new HashSet<Integer>();

    /**
     * The Constant CREATOR.
     */
    public static final Parcelable.Creator<SingleRoom> CREATOR = new Parcelable.Creator<SingleRoom>() {
        @Override
        public SingleRoom createFromParcel(Parcel in) {
            return new SingleRoom(in);
        }

        @Override
        public SingleRoom[] newArray(int size) {
            return new SingleRoom[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(roomName);
        dest.writeString(roomNameInEnglish);
        dest.writeString(mode);
        dest.writeString(availableStill);
        dest.writeString(tomorrowOpeningTime);
        dest.writeString(tomorrowClosingTime);
        dest.writeString(todayOpeningTime);
        dest.writeString(todayClosingTime);
        dest.writeString(subject);
        dest.writeString(lecturer);
        dest.writeString(room.getRoomName());
        dest.writeInt(availableSeats);
        dest.writeInt(totalSeats);
    }

    @Override
    public void readFromParcel(Parcel in) {
        roomName = in.readString();
        roomNameInEnglish = in.readString();
        mode = in.readString();
        availableStill = in.readString();
        tomorrowOpeningTime = in.readString();
        tomorrowClosingTime = in.readString();
        todayOpeningTime = in.readString();
        todayClosingTime = in.readString();
        subject = in.readString();
        lecturer = in.readString();
        room = Room.roomNameOf(in.readString());
        availableSeats = in.readInt();
        totalSeats = in.readInt();
    }

    public SingleRoom(Parcel in) {
        readFromParcel(in);
    }

    public SingleRoom(Room room, JSONObject mapJson) throws JSONException {
        this.room = room;
        if (mapJson.has(KEY_ROOM_NAME))
            roomName = mapJson.getString(KEY_ROOM_NAME);
        if (mapJson.has(KEY_ENGLISH_ROOM_NAME))
            roomNameInEnglish = mapJson.getString(KEY_ENGLISH_ROOM_NAME);
        if (mapJson.has(KEY_MODE))
            mode = mapJson.getString(KEY_MODE);
        if (mapJson.has(KEY_AVAILABLE_STILL))
            availableStill = mapJson.getString(KEY_AVAILABLE_STILL);
        if (mapJson.has(KEY_TOMORROW_OPENING_TIME))
            tomorrowOpeningTime = mapJson.getString(KEY_TOMORROW_OPENING_TIME);
        if (mapJson.has(KEY_TOMORROW_CLOSING_TIME))
            tomorrowClosingTime = mapJson.getString(KEY_TOMORROW_CLOSING_TIME);
        if (mapJson.has(KEY_TODAY_OPENING_TIME))
            todayOpeningTime = mapJson.getString(KEY_TODAY_OPENING_TIME);
        if (mapJson.has(KEY_TODAY_CLOSING_TIME))
            todayClosingTime = mapJson.getString(KEY_TODAY_CLOSING_TIME);
        if (mapJson.has(KEY_SUBJECT))
            subject = mapJson.getString(KEY_SUBJECT);
        if (mapJson.has(KEY_LECTURE))
            lecturer = mapJson.getString(KEY_LECTURE);
    }


    @Override
    public void setRoomJSON(JSONObject roomJSON) throws JSONException {
        if (roomJSON.has(KEY_PC_ID)) {
            JSONArray pcIdsArray = roomJSON.getJSONArray(KEY_PC_ID);
            if (pcIds == null) {
                pcIds = new HashSet<Integer>();
            } else {
                pcIds.clear();
            }
            for (int i = 0; i < pcIdsArray.length(); ++i) {
                pcIds.add(pcIdsArray.getInt(i));
            }
        }

        if (roomJSON.has(KEY_AVAILABLE_SEATS)) {
            availableSeats = roomJSON.getInt(KEY_AVAILABLE_SEATS);
        }

        if (roomJSON.has(KEY_TOTAL_SEATS)) {
            totalSeats = roomJSON.getInt(KEY_TOTAL_SEATS);
        }
    }

    @Override
    public boolean isPCAvailable(int pcId) {
        return pcIds.contains(pcId);
    }

    @Override
    public boolean isPCAvailable(int pcId, Room room) {
        return pcIds.contains(pcId);
    }

    @Override
    public Room getRoom() {
        return room;
    }

    @Override
    public String getRoomName() {
        if (Locale.JAPAN.equals(Locale.getDefault())) {
            return roomName;
        } else {
            return roomNameInEnglish;
        }
    }

    @Override
    public String getContents(Context context) {
        if (mode.equals("in_session")) {
            // 授業中
            return getLectureData(context);
        } else if (mode.equals("open")) {
            // 開放
            return getOpenData(context);
        } else if (mode.equals("closed")) {
            return getClosedData(context);
        }

        return "";
    }

    private String getLectureData(Context context) {
        StringBuilder builder = new StringBuilder();
        builder.append("教科名: ");
        builder.append(subject);
        builder.append("\n");
        builder.append("教師名: ");
        builder.append(lecturer);
        return builder.toString();
    }

    private String getOpenData(Context context) {
        if (room == Room.MACHINE_SHOP_E) {
            return "講義のみ使用可能です";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("空席");
        builder.append(availableSeats);
        builder.append('/');
        builder.append(totalSeats);
        builder.append(" -");
        builder.append(availableStill);
        return builder.toString();
    }

    private String getClosedData(Context context) {
        // 午前中で閉まっていれば今日の開館時間
        // 午後で閉まっていれば明日の開館時間
        String day;
        String openingTime;
        String closingTime;
        if (new Date().getHours() < 12) {
            day = "今日";
            openingTime = todayOpeningTime;
            closingTime = todayClosingTime;
        } else {
            day = "明日";
            openingTime = tomorrowOpeningTime;
            closingTime = todayClosingTime;
        }

        if (openingTime.equals("") || openingTime.equals("12:am") ||
                closingTime.equals("") || closingTime.equals("12:am")) {
            return String.format("%sは閉室です。", day);
        }

        return String.format("%sの開館時間は%s-%sです。", day, openingTime, closingTime);
    }

}
