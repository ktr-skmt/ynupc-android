package jp.ac.ynu.pc;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import com.actionbarsherlock.app.ActionBar;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/08/01
 * Time: 0:43
 * To change this template use File | Settings | File Templates.
 */
public class RoomTabListener<T extends Fragment> implements ActionBar.TabListener {
    private Fragment mFragment;
    private final Activity mActivity;
    private final String mTag;
    private final Class<T> mClass;
    private final Bundle mBundle;


    public RoomTabListener(Activity activity, String tag, Bundle bundle, Class<T> clz){
        this.mActivity = activity;
        this.mTag = tag;
        this.mBundle = bundle;
        this.mClass = clz;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        if(mFragment == null){
            mFragment = Fragment.instantiate(mActivity, mClass.getName());
            mFragment.setArguments(mBundle);
            ft.add(android.R.id.content, mFragment, mTag);
        }else{
            ft.attach(mFragment);
        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        if(mFragment != null){
            ft.detach(mFragment);
        }
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }
}
