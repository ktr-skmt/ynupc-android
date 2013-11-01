package jp.ac.ynu.pc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import jp.ac.ynu.pc.models.RoomInfo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/02
 * Time: 21:04
 * To change this template use File | Settings | File Templates.
 */
public class RoomListAdapter extends ArrayAdapter<RoomInfo>{
    private LayoutInflater inflater;

    public RoomListAdapter(Context context, int textViewResourceId, List<RoomInfo> objects) {
        super(context, textViewResourceId, objects);

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.room_list_item, null);


        TextView building = (TextView) view.findViewById(R.id.room_list_item_building);
        TextView opening = (TextView) view.findViewById(R.id.room_list_item_opening);

        final RoomInfo data = getItem(position);
        String roomName = "";
        String openingText = "";
        if(data != null){
            roomName = data.getRoomName(getContext());
            openingText = data.getContents(getContext());
        }

        if(openingText.equals("null")){
            openingText = "";
        }

        building.setText(roomName);
        opening.setText(openingText);

        return view;
    }
}
