package jp.ac.ynu.pc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import jp.ac.ynu.pc.R;

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

        ListView timeTable = (ListView) getView().findViewById(R.id.timetable_list);
        TimetableAdapter adapter = new TimetableAdapter(getActivity());

        timeTable.setAdapter(adapter);
    }

}
