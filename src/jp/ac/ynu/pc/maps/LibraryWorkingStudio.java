package jp.ac.ynu.pc.maps;

import android.graphics.Bitmap;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/18
 * Time: 20:29
 * To change this template use File | Settings | File Templates.
 */
public class LibraryWorkingStudio extends RoomMap {
    private RoomInfo roomInfo;

    public LibraryWorkingStudio(RoomInfo roomInfo){
        this.roomInfo = roomInfo;
    }
    @Override
    public Bitmap createMap() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}