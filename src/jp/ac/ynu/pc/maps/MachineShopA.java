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
 * Time: 20:20
 * To change this template use File | Settings | File Templates.
 */
public class MachineShopA extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 700;

    private static final float RECT_WIDTH = 32.498f;
    private static final float RECT_HEIGHT = 16.885f;

    private RoomInfo roomInfo;

    public MachineShopA(RoomInfo roomInfo){
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
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 59f, 75.929f, roomInfo.isPCAvailable(1)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 93.709f, 75.929f, roomInfo.isPCAvailable(2)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 128.42f, 75.929f, roomInfo.isPCAvailable(3)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 59f, 131.75f, roomInfo.isPCAvailable(4)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 93.709f, 131.75f, roomInfo.isPCAvailable(5)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 128.42f, 131.75f, roomInfo.isPCAvailable(6)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 59f, 187.57f, roomInfo.isPCAvailable(7)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 93.709f, 187.57f, roomInfo.isPCAvailable(8)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 128.42f, 187.57f, roomInfo.isPCAvailable(9)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 59f, 243.38f, roomInfo.isPCAvailable(10)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 128.42f, 243.7f, roomInfo.isPCAvailable(11)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 59f, 299.52f, roomInfo.isPCAvailable(12)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 128.42f, 299.84f, roomInfo.isPCAvailable(13)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 213.09f, 75.929f, roomInfo.isPCAvailable(14)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 247.8f, 75.929f, roomInfo.isPCAvailable(15)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 282.51f, 75.929f, roomInfo.isPCAvailable(16)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 213.09f, 132.11f, roomInfo.isPCAvailable(17)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 247.8f, 131.75f, roomInfo.isPCAvailable(18)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 282.51f, 132.43f, roomInfo.isPCAvailable(19)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 213.09f, 188.25f, roomInfo.isPCAvailable(20)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 247.8f, 188.25f, roomInfo.isPCAvailable(21)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 282.51f, 188.25f, roomInfo.isPCAvailable(22)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 213.09f, 244.06f, roomInfo.isPCAvailable(23)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 247.8f, 244.06f, roomInfo.isPCAvailable(24)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 282.51f, 244.06f, roomInfo.isPCAvailable(25)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 213.09f, 299.88f, roomInfo.isPCAvailable(26)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 247.8f, 299.88f, roomInfo.isPCAvailable(27)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 282.51f, 299.88f, roomInfo.isPCAvailable(28)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 213.09f, 355.7f, roomInfo.isPCAvailable(29)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 247.8f, 355.7f, roomInfo.isPCAvailable(30)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 282.51f, 355.7f, roomInfo.isPCAvailable(31)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 332.97f, 75.929f, roomInfo.isPCAvailable(32)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 367.68f, 75.929f, roomInfo.isPCAvailable(33)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 402.39f, 75.929f, roomInfo.isPCAvailable(34)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 332.97f, 131.75f, roomInfo.isPCAvailable(35)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 367.68f, 131.75f, roomInfo.isPCAvailable(36)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 402.39f, 131.75f, roomInfo.isPCAvailable(37)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 332.97f, 187.57f, roomInfo.isPCAvailable(38)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 367.68f, 187.57f, roomInfo.isPCAvailable(39)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 402.39f, 187.57f, roomInfo.isPCAvailable(40)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 332.97f, 243.38f, roomInfo.isPCAvailable(41)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 367.68f, 243.38f, roomInfo.isPCAvailable(42)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 402.39f, 243.38f, roomInfo.isPCAvailable(43)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 332.97f, 299.2f, roomInfo.isPCAvailable(44)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 367.68f, 299.2f, roomInfo.isPCAvailable(45)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 402.39f, 299.2f, roomInfo.isPCAvailable(46)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 332.97f, 355.02f, roomInfo.isPCAvailable(47)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 367.68f, 355.02f, roomInfo.isPCAvailable(48)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 402.39f, 355.02f, roomInfo.isPCAvailable(49)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 332.97f, 410.84f, roomInfo.isPCAvailable(50)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 367.68f, 410.84f, roomInfo.isPCAvailable(51)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 402.39f, 410.84f, roomInfo.isPCAvailable(52)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 247.8f, 55.177f, roomInfo.isPCAvailable(53)));
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"31.513\" y1=\"31.344\" x2=\"31.513\" y2=\"581.75\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"31.513\" y1=\"32.847\" x2=\"450.593\" y2=\"32.847\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"450.593\" y1=\"31.375\" x2=\"450.593\" y2=\"581.688\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"450.593\" y1=\"580.247\" x2=\"266.5\" y2=\"580.247\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"31.513\" y1=\"580.247\" x2=\"213.09\" y2=\"580.247\"/>");
        builder.append(generateEndSVG());
        return builder.toString();
    }

//    <g id="japanese_words">
//    <text transform="matrix(1 0 0 1 223.9102 558.54)" font-family="'KozGoPr6N-Regular-83pv-RKSJ-H'" font-size="14">入口</text>
//    <text transform="matrix(1 0 0 1 350 525.4697)" fill="#0000FF" font-family="'KozGoPr6N-Regular-83pv-RKSJ-H'" font-size="14">ＰＣ教室Ｂ→</text>
//    </g>
//    <g id="english_words" display="none">
//
//    <text transform="matrix(1 0 0 1 223.9102 558.54)" display="inline" font-family="'KozGoPr6N-Regular-83pv-RKSJ-H'" font-size="14">Entrance</text>
//
//    <text transform="matrix(1 0 0 1 300 525.4697)" display="inline" fill="#0000FF" font-family="'KozGoPr6N-Regular-83pv-RKSJ-H'" font-size="14">Machine Shop B→</text>
//    </g>


}
