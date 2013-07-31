package jp.ac.ynu.pc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import com.loopj.android.http.AsyncHttpResponseHandler;
import jp.ac.ynu.pc.R;
import jp.ac.ynu.pc.enums.Room;
import jp.ac.ynu.pc.enums.Timetable;
import jp.ac.ynu.pc.models.Lesson;
import jp.ac.ynu.pc.models.RoomInfo;
import jp.ac.ynu.pc.models.TimetablePeriod;
import jp.ac.ynu.pc.utils.ApiRequest;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/04
 * Time: 20:55
 * To change this template use File | Settings | File Templates.
 */
public class TimetableFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.room_timetable, null);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Bundle bundle =getArguments();
        RoomInfo roomInfo = bundle.getParcelable(Config.BUNDLE_KEY_ROOM_INFO);

        Spinner spinner = (Spinner) getView().findViewById(R.id.timetable_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter.add("月曜日");
        adapter.add("火曜日");
        adapter.add("水曜日");
        adapter.add("木曜日");
        adapter.add("金曜日");
        spinner.setAdapter(adapter);

        ApiRequest.getTimetable(Timetable.THIS, roomInfo.getRoom(), new AsyncHttpResponseHandler(){
            @Override
            public void onSuccess(String s) {
                super.onSuccess(s);

                try {
                    JSONObject object = new JSONObject(s);

                    System.out.println(object);
                    TimetablePeriod timetablePeriod = new TimetablePeriod(object);


                } catch (JSONException e) {

                }
            }
        });

        List<Lesson> lessons = new ArrayList<Lesson>();

        ListView timeTable = (ListView) getView().findViewById(R.id.timetable_list);
        TimetableAdapter timetableAdapter = new TimetableAdapter(getActivity(), lessons);

        timeTable.setAdapter(timetableAdapter);
    }

}
