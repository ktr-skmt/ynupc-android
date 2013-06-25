package jp.ac.ynu.pc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/04
 * Time: 20:53
 * To change this template use File | Settings | File Templates.
 */
public class RoomStatePagerAdapter extends FragmentStatePagerAdapter{
    private RoomInfo roomInfo;


    public RoomStatePagerAdapter(FragmentManager fm, RoomInfo roomInfo) {
        super(fm);

        this.roomInfo = roomInfo;
    }

    @Override
    public Fragment getItem(int i) {
        Bundle args = new Bundle();
        args.putParcelable(Config.BUNDLE_KEY_ROOM_INFO, roomInfo);

        Fragment fragment = null;

        switch (i){
            case 0:
                fragment = new RoomMapFragment();
                break;
            case 1:
                fragment = new TimetableFragment();
                break;
        }

        if(fragment != null){
            fragment.setArguments(args);
        }

        return fragment;
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
