package jp.ac.ynu.pc.models;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import jp.ac.ynu.pc.enums.Room;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/25
 * Time: 16:44
 * To change this template use File | Settings | File Templates.
 */
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

    String getRoomName();

    String getContents(Context context);
}
