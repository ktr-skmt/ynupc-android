package jp.ac.ynu.pc.maps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/18
 * Time: 20:25
 * To change this template use File | Settings | File Templates.
 */
public class MachineShopCD extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 700;

    private static final float RECT_WIDTH = 25.603f;
    private static final float RECT_HEIGHT = 21.756f;

    private RoomInfo roomCD;

    public MachineShopCD(RoomInfo roomCD){
        this.roomCD = roomCD;
    }


    @Override
    public Bitmap createMap() {
        Bitmap bitmap = Bitmap.createBitmap(WIDTH, HEIGHT, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmap);

        SVG svg = SVGParser.getSVGFromString(buildSVGString());

        Picture picture = svg.getPicture();
        canvas.drawPicture(picture);

        return bitmap;
    }

    private String buildSVGString() {
        StringBuilder builder = new StringBuilder();
        builder.append(generateHeader(WIDTH, HEIGHT));

        builder.append(generateEndSVG());
        return builder.toString();
    }

//    <g id="japanese_words" font-size="14" font-family="&apos;KozGoPr6N-Regular-83pv-RKSJ-H&apos;">
//    <text transform="translate(221.91 586.07)">入口</text>
//    <text transform="translate(50 543)" fill="#0000FF">←ＰＣ教室Ａ</text>
//    </g>
//    <g id="english_words" font-size="14" font-family="&apos;KozGoPr6N-Regular-83pv-RKSJ-H&apos;" display="none">
//    <text transform="translate(221.91 613.07)" display="inline">Entrance</text>
//    <text fill="#0000FF" transform="translate(50 570)" display="inline">←Machine Shop A</text>
//    </g>
}
