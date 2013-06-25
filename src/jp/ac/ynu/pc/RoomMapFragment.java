package jp.ac.ynu.pc;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import jp.ac.ynu.pc.maps.RoomMap;
import jp.ac.ynu.pc.maps.RoomMapFactory;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/04
 * Time: 20:56
 * To change this template use File | Settings | File Templates.
 */
public class RoomMapFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.room_map, null);


        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ImageView mapView = (ImageView) getView().findViewById(R.id.room_map);
        Bundle args = getArguments();
        RoomInfo roomInfo = args.getParcelable(Config.BUNDLE_KEY_ROOM_INFO);

        RoomMap map = RoomMapFactory.getRoomMap(roomInfo);
        if (map != null) {
            Bitmap mapBitmap = map.createMap();
            if (mapBitmap != null) {
                mapView.setImageBitmap(mapBitmap);
            }

            mapView.requestLayout();
            mapView.invalidate();
        }

    }
}