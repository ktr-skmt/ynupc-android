package jp.ac.ynu.pc.models;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import jp.ac.ynu.pc.enums.Room;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/25
 * Time: 16:45
 * To change this template use File | Settings | File Templates.
 */
public class MultiRoom implements RoomInfo {
    private Room room;
    private Map<Room, RoomInfo> roomInfoMap;

    private int roomNameResource;

    /**
     * The Constant CREATOR.
     */
    public static final Parcelable.Creator<MultiRoom> CREATOR = new Parcelable.Creator<MultiRoom>() {
        @Override
        public MultiRoom createFromParcel(Parcel in) {
            return new MultiRoom(in);
        }

        @Override
        public MultiRoom[] newArray(int size) {
            return new MultiRoom[size];
        }
    };

    public MultiRoom(Room room, int roomNameResource, RoomInfo... roomInfo){
        if(roomInfo.length < 2){
            throw new IllegalArgumentException();
        }

        this.room = room;
        this.roomNameResource = roomNameResource;

        roomInfoMap = new HashMap<Room, RoomInfo>();

        for(RoomInfo r : roomInfo){
            roomInfoMap.put(r.getRoom(), r);
        }
    }

    public MultiRoom(Parcel in) {
        readFromParcel(in);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        for(Room room : roomInfoMap.keySet()){
            dest.writeString(room.getRoomName());
            dest.writeParcelable(roomInfoMap.get(room), flags);
        }
    }

    @Override
    public void readFromParcel(Parcel in) {
        roomInfoMap = new HashMap<Room, RoomInfo>();
        roomInfoMap.put(Room.roomNameOf(in.readString()), (RoomInfo) in.readParcelable(SingleRoom.class.getClassLoader()));
    }

    @Override
    public void setRoomJSON(JSONObject roomJSON) throws JSONException {

    }

    @Override
    public boolean isPCAvailable(int pcId) {
        return false;
    }

    @Override
    public boolean isPCAvailable(int pcId, Room room) {
        if(roomInfoMap.containsKey(room)){
            return roomInfoMap.get(room).isPCAvailable(pcId);
        }

        return false;
    }

    @Override
    public Room getRoom() {
        return room;
    }

    @Override
    public String getRoomName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getContents(Context context) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
