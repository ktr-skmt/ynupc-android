package jp.ac.ynu.pc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/04
 * Time: 20:53
 * To change this template use File | Settings | File Templates.
 */
public class RoomStatePagerAdapter extends FragmentStatePagerAdapter{


    public RoomStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new RoomMapFragment();
            case 1:
                return new TimetableFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Map";
            case 1:
                return "Timetable";
        }
        return "";
    }
}
