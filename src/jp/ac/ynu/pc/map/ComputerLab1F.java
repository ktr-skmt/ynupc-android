package jp.ac.ynu.pc.map;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import jp.ac.ynu.pc.RoomInfo;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/18
 * Time: 20:33
 * To change this template use File | Settings | File Templates.
 */
public class ComputerLab1F extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 550;

    private static final float RECT_WIDTH = 34.498f;
    private static final float RECT_HEIGHT = 16.885f;

    private RoomInfo roomInfo;

    public ComputerLab1F(RoomInfo roomInfo){
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
        builder.append("<path id=\"wall\" d=\"m440 120v-30h-400v400h400v-300\" stroke=\"#000\" stroke-width=\"3\" fill=\"none\"/>");
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 60.386f, 364.1f, roomInfo.isPCAvailable(1)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 103.88f, 364.1f, roomInfo.isPCAvailable(2)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 147.38f, 364.1f, roomInfo.isPCAvailable(3)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 190.88f, 364.1f, roomInfo.isPCAvailable(4)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 254.25f, 364.1f, roomInfo.isPCAvailable(5)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 297.75f, 364.1f, roomInfo.isPCAvailable(6)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 341.25f, 364.1f, roomInfo.isPCAvailable(7)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 384.74f, 364.1f, roomInfo.isPCAvailable(8)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 384.74f, 341.22f, roomInfo.isPCAvailable(9)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 341.25f, 341.22f, roomInfo.isPCAvailable(10)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 297.75f, 341.22f, roomInfo.isPCAvailable(11)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 254.25f, 341.22f, roomInfo.isPCAvailable(12)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 190.88f, 341.22f, roomInfo.isPCAvailable(13)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 147.38f, 341.22f, roomInfo.isPCAvailable(14)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 103.88f, 341.22f, roomInfo.isPCAvailable(15)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 60.386f, 341.22f, roomInfo.isPCAvailable(16)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 60.386f, 292.06f, roomInfo.isPCAvailable(17)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 103.88f, 292.06f, roomInfo.isPCAvailable(18)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 147.38f, 292.06f, roomInfo.isPCAvailable(19)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 190.88f, 292.06f, roomInfo.isPCAvailable(20)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 254.25f, 292.05f, roomInfo.isPCAvailable(21)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 297.75f, 292.05f, roomInfo.isPCAvailable(22)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 341.25f, 292.05f, roomInfo.isPCAvailable(23)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 384.74f, 292.05f, roomInfo.isPCAvailable(24)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 384.74f, 269.17f, roomInfo.isPCAvailable(25)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 341.25f, 269.17f, roomInfo.isPCAvailable(26)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 297.75f, 269.17f, roomInfo.isPCAvailable(27)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 254.25f, 269.17f, roomInfo.isPCAvailable(28)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 190.88f, 269.17f, roomInfo.isPCAvailable(29)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 147.38f, 269.17f, roomInfo.isPCAvailable(30)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 103.88f, 269.17f, roomInfo.isPCAvailable(31)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 60.386f, 269.17f, roomInfo.isPCAvailable(32)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 60.386f, 213.77f, roomInfo.isPCAvailable(33)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 103.88f, 213.77f, roomInfo.isPCAvailable(34)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 147.38f, 213.77f, roomInfo.isPCAvailable(35)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 190.88f, 213.77f, roomInfo.isPCAvailable(36)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 234.38f, 213.77f, roomInfo.isPCAvailable(37)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 277.88f, 213.77f, roomInfo.isPCAvailable(38)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 277.88f, 190.89f, roomInfo.isPCAvailable(39)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 234.38f, 190.89f, roomInfo.isPCAvailable(40)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 190.88f, 190.89f, roomInfo.isPCAvailable(41)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 147.38f, 190.89f, roomInfo.isPCAvailable(42)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 103.88f, 190.89f, roomInfo.isPCAvailable(43)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 60.386f, 190.89f, roomInfo.isPCAvailable(44)));
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
