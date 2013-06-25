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
public class MachineShopE extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 650;

    private static final float RECT_WIDTH = 28.05f;
    private static final float RECT_HEIGHT = 23.111f;

    private RoomInfo roomInfo;

    public MachineShopE(RoomInfo roomInfo){
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

        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 102.95f, 141.5f, roomInfo.isPCAvailable(1)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 144f, 141.5f, roomInfo.isPCAvailable(2)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 185.05f, 141.5f, roomInfo.isPCAvailable(3)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 102.95f, 200.61f, roomInfo.isPCAvailable(4)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 144f, 200.61f, roomInfo.isPCAvailable(5)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 185.05f, 200.61f, roomInfo.isPCAvailable(6)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 102.95f, 259.72f, roomInfo.isPCAvailable(7)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 144f, 259.72f, roomInfo.isPCAvailable(8)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 185.05f, 259.72f, roomInfo.isPCAvailable(9)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 102.95f, 318.83f, roomInfo.isPCAvailable(10)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 144f, 318.83f, roomInfo.isPCAvailable(11)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 185.05f, 318.83f, roomInfo.isPCAvailable(12)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 102.95f, 377.939f, roomInfo.isPCAvailable(13)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 144f, 377.939f, roomInfo.isPCAvailable(14)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 185.05f, 377.939f, roomInfo.isPCAvailable(15)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 102.95f, 437.05f, roomInfo.isPCAvailable(16)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 144f, 437.05f, roomInfo.isPCAvailable(17)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 185.05f, 437.05f, roomInfo.isPCAvailable(18)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 271.01f, 143.73f, roomInfo.isPCAvailable(19)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 312.06f, 143.73f, roomInfo.isPCAvailable(20)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 353.11f, 143.73f, roomInfo.isPCAvailable(21)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 271.01f, 202.84f, roomInfo.isPCAvailable(22)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 312.06f, 202.84f, roomInfo.isPCAvailable(23)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 353.11f, 202.84f, roomInfo.isPCAvailable(24)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 271.01f, 261.95f, roomInfo.isPCAvailable(25)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 312.06f, 261.95f, roomInfo.isPCAvailable(26)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 353.11f, 261.95f, roomInfo.isPCAvailable(27)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 271.01f, 377.939f, roomInfo.isPCAvailable(28)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 312.06f, 377.939f, roomInfo.isPCAvailable(29)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 353.11f, 377.939f, roomInfo.isPCAvailable(30)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 271.01f, 437.05f, roomInfo.isPCAvailable(31)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 312.06f, 437.05f, roomInfo.isPCAvailable(32)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 353.11f, 437.05f, roomInfo.isPCAvailable(33)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 312.06f, 96.35f, roomInfo.isPCAvailable(34)));

        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"62.429\" y1=\"57.208\" x2=\"62.429\" y2=\"549.793\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"62.429\" y1=\"548.29\" x2=\"428.659\" y2=\"548.29\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"429\" y1=\"549.781\" x2=\"429\" y2=\"384.5\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"428.659\" y1=\"341.941\" x2=\"428.659\" y2=\"57.208\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"428.659\" y1=\"58.68\" x2=\"62.429\" y2=\"58.68\"/>");

        builder.append(generateEndSVG());
        return builder.toString();
    }

}
