package jp.ac.ynu.pc;


import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import jp.ac.ynu.pc.R;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/04
 * Time: 20:56
 * To change this template use File | Settings | File Templates.
 */
public class RoomMapFragment extends Fragment {
    private ImageView mapView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.room_map, null);

        mapView = (ImageView) v.findViewById(R.id.room_map);


        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.

        Bitmap bitmap = Bitmap.createBitmap(480, 800, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmap);

        SVG svg = null; // getSVGFromString("");
        try {
            svg = SVGParser.getSVGFromAsset(getActivity().getAssets(), "svg/U.svg");

            Picture picture = svg.getPicture();
            canvas.drawPicture(picture);
//            mapView.setImageDrawable(svg.createPictureDrawable());
            mapView.setImageBitmap(bitmap
            );
            mapView.requestLayout();
            mapView.invalidate();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
