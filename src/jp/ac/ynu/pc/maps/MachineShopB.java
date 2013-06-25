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
 * Time: 20:24
 * To change this template use File | Settings | File Templates.
 */
public class MachineShopB extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 700;

    private static final float RECT_WIDTH = 25.603f;
    private static final float RECT_HEIGHT = 21.756f;

    private RoomInfo roomInfo;

    public MachineShopB(RoomInfo roomInfo){
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
        builder.append("<path id=\"wall\" d=\"m300 573h150v-540h-420v540h150\" stroke=\"#000\" stroke-width=\"3\" fill=\"none\"/>");
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 58.712f, 122.74f, roomInfo.isPCAvailable(1)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 95.315f, 122.74f, roomInfo.isPCAvailable(2)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 131.92f, 122.74f, roomInfo.isPCAvailable(3)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 58.712f, 180.5f, roomInfo.isPCAvailable(4)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 95.315f, 180.5f, roomInfo.isPCAvailable(5)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 131.92f, 180.5f, roomInfo.isPCAvailable(6)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 58.712f, 238.25f, roomInfo.isPCAvailable(7)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 95.315f, 238.25f, roomInfo.isPCAvailable(8)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 131.92f, 238.25f, roomInfo.isPCAvailable(9)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 58.712f, 296.01f, roomInfo.isPCAvailable(10)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 95.315f, 296.01f, roomInfo.isPCAvailable(11)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 131.92f, 296.01f, roomInfo.isPCAvailable(12)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 58.712f, 353.76f, roomInfo.isPCAvailable(13)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 95.315f, 353.76f, roomInfo.isPCAvailable(14)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 131.92f, 353.76f, roomInfo.isPCAvailable(15)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 58.712f, 411.52f, roomInfo.isPCAvailable(16)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 95.315f, 411.52f, roomInfo.isPCAvailable(17)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 131.92f, 411.52f, roomInfo.isPCAvailable(18)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 58.712f, 469.28f, roomInfo.isPCAvailable(19)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 95.315f, 469.28f, roomInfo.isPCAvailable(20)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 131.92f, 469.28f, roomInfo.isPCAvailable(21)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 196.83f, 122.74f, roomInfo.isPCAvailable(22)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 233.43f, 122.74f, roomInfo.isPCAvailable(23)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 270.04f, 122.74f, roomInfo.isPCAvailable(24)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 196.83f, 180.5f, roomInfo.isPCAvailable(25)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 233.43f, 180.5f, roomInfo.isPCAvailable(26)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 270.04f, 180.5f, roomInfo.isPCAvailable(27)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 196.83f, 238.25f, roomInfo.isPCAvailable(28)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 233.43f, 238.25f, roomInfo.isPCAvailable(29)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 270.04f, 238.25f, roomInfo.isPCAvailable(30)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 196.83f, 296.01f, roomInfo.isPCAvailable(31)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 233.43f, 296.01f, roomInfo.isPCAvailable(32)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 270.04f, 296.01f, roomInfo.isPCAvailable(33)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 196.83f, 353.76f, roomInfo.isPCAvailable(34)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 233.43f, 353.76f, roomInfo.isPCAvailable(35)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 270.04f, 353.76f, roomInfo.isPCAvailable(36)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 196.83f, 411.52f, roomInfo.isPCAvailable(37)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 233.43f, 411.52f, roomInfo.isPCAvailable(38)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 270.04f, 411.52f, roomInfo.isPCAvailable(39)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 327.83f, 122.74f, roomInfo.isPCAvailable(40)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 364.43f, 122.74f, roomInfo.isPCAvailable(41)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 401.04f, 122.74f, roomInfo.isPCAvailable(42)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 327.83f, 180.5f, roomInfo.isPCAvailable(43)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 364.43f, 180.5f, roomInfo.isPCAvailable(44)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 401.04f, 180.5f, roomInfo.isPCAvailable(45)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 327.83f, 238.25f, roomInfo.isPCAvailable(46)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 364.43f, 238.25f, roomInfo.isPCAvailable(47)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 401.04f, 238.25f, roomInfo.isPCAvailable(48)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 327.83f, 296.01f, roomInfo.isPCAvailable(49)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 401.04f, 296.01f, roomInfo.isPCAvailable(50)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 327.83f, 353.76f, roomInfo.isPCAvailable(51)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 401.04f, 354.89f, roomInfo.isPCAvailable(52)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 233.43f, 82.92f, roomInfo.isPCAvailable(53)));
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
