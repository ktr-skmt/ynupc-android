package jp.ac.ynu.pc;

import android.os.Bundle;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/02
 * Time: 18:57
 * To change this template use File | Settings | File Templates.
 */
public class RoomActivity extends SherlockFragmentActivity {
    private static final String FRAGMENT_TAG_MAP = "map";
    private static final String FRAGMENT_TAG_TIMETABLE = "timetable";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_activity);

        Bundle bundle = getIntent().getExtras();

        RoomInfo roomInfo = bundle.getParcelable(Config.BUNDLE_KEY_ROOM_INFO);

        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_HOME);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(roomInfo.getRoomName(this));
        actionBar.setDisplayHomeAsUpEnabled(true);

        ActionBar.Tab mapTab = actionBar.newTab();
        mapTab.setText("Map");
        mapTab.setIcon(R.drawable.icon_map);
        mapTab.setTabListener(new RoomTabListener<RoomMapFragment>(this, FRAGMENT_TAG_MAP, bundle, RoomMapFragment.class));

        actionBar.addTab(mapTab);

        ActionBar.Tab timetableTab = actionBar.newTab();
        timetableTab.setText("Timetable");
        timetableTab.setIcon(R.drawable.icon_timetable);
        timetableTab.setTabListener(new RoomTabListener<TimetableFragment>(this, FRAGMENT_TAG_TIMETABLE, bundle, TimetableFragment.class));

        actionBar.addTab(timetableTab);

        actionBar.setSelectedNavigationItem(0);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater = getSupportMenuInflater();
//        menuInflater.inflate(R.menu.room, menu);
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        return super.onMenuItemSelected(featureId, item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
