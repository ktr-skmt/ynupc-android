package jp.ac.ynu.pc.models;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import jp.ac.ynu.pc.enums.Room;
import org.json.JSONException;
import org.json.JSONObject;

public interface RoomInfo extends Parcelable {
    @Override
    int describeContents();

    @Override
    void writeToParcel(Parcel dest, int flags);

    void readFromParcel(Parcel in);

    void setRoomJSON(JSONObject roomJSON) throws JSONException;

    boolean isPCAvailable(int pcId);

    boolean isPCAvailable(int pcId, Room room);

    Room getRoom();

    Room getTimetableRoom();

    String getRoomName(Context context);

    String getContents(Context context);
}
