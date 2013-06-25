package jp.ac.ynu.pc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import jp.ac.ynu.pc.models.json.Lesson;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/25
 * Time: 18:44
 * To change this template use File | Settings | File Templates.
 */
public class TimetableAdapter extends ArrayAdapter<Lesson> {

    private LayoutInflater inflater;

    public TimetableAdapter(Context context) {
        super(context, 0);

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(R.layout.timetable_row, null);
        }

        return convertView;
    }
}