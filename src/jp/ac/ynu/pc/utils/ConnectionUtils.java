package jp.ac.ynu.pc.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/11/01
 * Time: 15:44
 * To change this template use File | Settings | File Templates.
 */
public class ConnectionUtils {

    public static boolean isConnected(Context context){
        ConnectivityManager manager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo info = manager.getActiveNetworkInfo();
        if (info == null ){
            return false;
        }
        return info.isConnected();
    }
}
