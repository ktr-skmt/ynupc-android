package jp.ac.ynu.pc.maps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * 端末室3F-1
 * L.svg
 */
public class ComputerLab3F1 extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 550;

    private static final float RECT_WIDTH = 34.498f;
    private static final float RECT_HEIGHT = 16.885f;

    private RoomInfo roomInfo;

    public ComputerLab3F1(RoomInfo roomInfo) {
        this.roomInfo = roomInfo;
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
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 60.386f, 362.683f, roomInfo.isPCAvailable(33)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 100.553f, 362.683f, roomInfo.isPCAvailable(34)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 60.386f, 340.129f, roomInfo.isPCAvailable(21)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 100.553f, 340.129f, roomInfo.isPCAvailable(22)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 140.72f, 340.129f, roomInfo.isPCAvailable(23)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 180.887f, 340.129f, roomInfo.isPCAvailable(24)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 276.969f, 362.683f, roomInfo.isPCAvailable(32)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 317.135f, 362.683f, roomInfo.isPCAvailable(31)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 276.969f, 340.129f, roomInfo.isPCAvailable(28)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 317.135f, 340.129f, roomInfo.isPCAvailable(27)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 357.302f, 340.129f, roomInfo.isPCAvailable(26)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 397.469f, 340.129f, roomInfo.isPCAvailable(25)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 357.303f, 362.683f, roomInfo.isPCAvailable(30)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 397.469f, 362.683f, roomInfo.isPCAvailable(29)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 276.969f, 262.328f, roomInfo.isPCAvailable(12)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 276.969f, 239.773f, roomInfo.isPCAvailable(11)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 276.969f, 217.22f, roomInfo.isPCAvailable(10)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 276.969f, 194.666f, roomInfo.isPCAvailable(9)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 317.135f, 262.328f, roomInfo.isPCAvailable(8)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 317.135f, 239.773f, roomInfo.isPCAvailable(7)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 317.135f, 217.22f, roomInfo.isPCAvailable(6)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 317.135f, 194.666f, roomInfo.isPCAvailable(5)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 397.469f, 262.328f, roomInfo.isPCAvailable(4)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 397.469f, 217.22f, roomInfo.isPCAvailable(2)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 397.469f, 239.773f, roomInfo.isPCAvailable(3)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 397.469f, 194.666f, roomInfo.isPCAvailable(1)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 60.386f, 194.666f, roomInfo.isPCAvailable(14)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 100.553f, 194.666f, roomInfo.isPCAvailable(13)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 60.386f, 262.328f, roomInfo.isPCAvailable(20)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 100.552f, 262.328f, roomInfo.isPCAvailable(19)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 60.386f, 239.774f, roomInfo.isPCAvailable(18)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 100.552f, 239.774f, roomInfo.isPCAvailable(17)));
        builder.append(generatePCRect(RECT_HEIGHT, RECT_WIDTH, 140.72f, 222.161f, roomInfo.isPCAvailable(15)));
        builder.append(generatePCRect(RECT_HEIGHT, RECT_WIDTH, 140.72f, 262.329f, roomInfo.isPCAvailable(16)));
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"215.385\" y1=\"429\" x2=\"39.5\" y2=\"429\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"453.102\" y1=\"429\" x2=\"277.217\" y2=\"429\"/>");
        builder.append("<line fill=\"none\" stroke=\"#231815\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"39.5\" y1=\"430.484\" x2=\"39.5\" y2=\"154.969\"/>");
        builder.append("<line fill=\"none\" stroke=\"#231815\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"39.5\" y1=\"156.5\" x2=\"453.102\" y2=\"156.5\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"453.102\" y1=\"155\" x2=\"453.102\" y2=\"430.484\"/>");
        builder.append(generateEndSVG());
        return builder.toString();
    }

//    <g id="japanese_words">
//    <text font-size="14" font-family="&apos;KozGoPr6N-Regular-83pv-RKSJ-H&apos;" transform="translate(420 150)">入口</text>
//    </g>
//    <g id="english_words" display="none">
//    <text font-size="14" font-family="&apos;KozGoPr6N-Regular-83pv-RKSJ-H&apos;" transform="translate(420 150)" display="inline">Entrance</text>
//    </g>
}
