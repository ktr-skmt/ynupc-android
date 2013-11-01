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
import java.util.Set;

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
    private RoomInfo indexRoom;

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

        indexRoom = roomInfo[0];
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
        dest.writeInt(roomNameResource);
        dest.writeString(room.getRoomName());
        dest.writeInt(roomInfoMap.size());
        for(Room room : roomInfoMap.keySet()){
            dest.writeString(room.getRoomName());
            dest.writeParcelable(roomInfoMap.get(room), flags);
        }


    }

    @Override
    public void readFromParcel(Parcel in) {
        roomNameResource = in.readInt();
        room = Room.roomNameOf(in.readString());
        roomInfoMap = new HashMap<Room, RoomInfo>();
        int size = in.readInt();
        for(int i = 0; i < size; ++i){
            roomInfoMap.put(Room.roomNameOf(in.readString()),
                (RoomInfo) in.readParcelable(SingleRoom.class.getClassLoader()));
        }


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
        return roomInfoMap.containsKey(room) && roomInfoMap.get(room).isPCAvailable(pcId);

    }

    @Override
    public Room getRoom() {
        return room;
    }

    @Override
    public Room getTimetableRoom() {
        // TODO: ハードコーディング直す
        return Room.MACHINE_SHOP_C;
    }

    @Override
    public String getRoomName(Context context) {
        return context.getString(roomNameResource);
    }

    @Override
    public String getContents(Context context) {
        return indexRoom.getContents(context);
    }
}
