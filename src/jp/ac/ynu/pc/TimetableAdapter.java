package jp.ac.ynu.pc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import jp.ac.ynu.pc.models.Lesson;
import jp.ac.ynu.pc.models.TimetablePeriod;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/25
 * Time: 18:44
 * To change this template use File | Settings | File Templates.
 */
public class TimetableAdapter extends ArrayAdapter<Lesson>{

    private LayoutInflater inflater;

    public TimetableAdapter(Context context, List<Lesson> objects) {
        super(context, 0, objects);

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public boolean isEnabled(int position) {
        return getItem(position).getHeaderTitle() == null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(R.layout.timetable_row, null);
        }

        Lesson lesson = getItem(position);

        LinearLayout headerArea = (LinearLayout) convertView.findViewById(R.id.timetable_row_title_wrap);
        LinearLayout contentArea = (LinearLayout) convertView.findViewById(R.id.timetable_row_content_wrap);

        TextView title = (TextView) convertView.findViewById(R.id.timetable_row_title);
        TextView subject = (TextView) convertView.findViewById(R.id.timetable_row_subject);
        TextView lecturer = (TextView) convertView.findViewById(R.id.timetable_row_lecturer);
        TextView fixedNumber = (TextView) convertView.findViewById(R.id.timetable_row_number);
        TextView faculty = (TextView) convertView.findViewById(R.id.timetable_row_faculty);
        TextView grade = (TextView) convertView.findViewById(R.id.timetable_row_grade);
        TextView date = (TextView) convertView.findViewById(R.id.timetable_row_date);


        // 見出し行の場合
        if(!isEnabled(position)){
            headerArea.setVisibility(View.VISIBLE);
            contentArea.setVisibility(View.GONE);

            title.setText(lesson.getHeaderTitle());
            return convertView;
        }

        headerArea.setVisibility(View.GONE);
        contentArea.setVisibility(View.VISIBLE);

        subject.setText(lesson.getSubject());
        lecturer.setText(lesson.getLecturer());
        fixedNumber.setText(lesson.getFixedNumber());
        faculty.setText(lesson.getFaculty());
        grade.setText(lesson.getGrade());
        date.setText(lesson.getDate());

        return convertView;
    }
}
