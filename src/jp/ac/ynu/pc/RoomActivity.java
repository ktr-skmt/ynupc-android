package jp.ac.ynu.pc;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import com.actionbarsherlock.app.SherlockFragmentActivity;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/02
 * Time: 18:57
 * To change this template use File | Settings | File Templates.
 */
public class RoomActivity extends SherlockFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_activity);

        ViewPager viewPager = (ViewPager) findViewById(R.id.room_pager);
        PagerTabStrip titleStrip = (PagerTabStrip) findViewById(R.id.room_pager_title);
        viewPager.setAdapter(new RoomStatePagerAdapter(getSupportFragmentManager()));

        titleStrip.setDrawFullUnderline(true);
        titleStrip.setTabIndicatorColor(Color.DKGRAY);
    }
}
