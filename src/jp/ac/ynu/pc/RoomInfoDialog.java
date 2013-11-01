package jp.ac.ynu.pc;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import jp.ac.ynu.pc.models.RoomInfo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/02
 * Time: 21:02
 * To change this template use File | Settings | File Templates.
 */
public class RoomInfoDialog extends Dialog{

    public RoomInfoDialog(Context context, int buildingNameResource , List<RoomInfo> infoList) {
        super(context, R.style.Theme_Dialog);

        setContentView(R.layout.room_dialog_list);
        setTitle(buildingNameResource);

        ListView roomInfo = (ListView) findViewById(R.id.room_list);
        RoomListAdapter adapter = new RoomListAdapter(context, 0, infoList);
        roomInfo.setAdapter(adapter);

        roomInfo.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                RoomInfo item = (RoomInfo) adapterView.getItemAtPosition(i);

                Intent intent = new Intent(getContext(), RoomActivity.class);
                intent.putExtra(Config.BUNDLE_KEY_ROOM_INFO, item);
                getContext().startActivity(intent);
            }
        });

    }


}
