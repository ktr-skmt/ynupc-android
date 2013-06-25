package jp.ac.ynu.pc.maps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 *  教育人間科学部第2研究棟-517
 *  I.svg
 */
public class EdhsResearch extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 650;

    private static final float RECT_WIDTH = 35.062f;
    private static final float RECT_HEIGHT = 23.111f;

    private RoomInfo roomInfo;

    public EdhsResearch(RoomInfo roomInfo){
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

        builder.append("<path id=\"wall\" fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" d=\"M60,371V51h360v500H60V451\"/>");
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 96.403f, 90.85f, roomInfo.isPCAvailable(1)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 142.46f, 90.85f, roomInfo.isPCAvailable(2)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 188.53f, 90.85f, roomInfo.isPCAvailable(3)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 96.403f, 146.96f, roomInfo.isPCAvailable(4)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 142.46f, 146.96f, roomInfo.isPCAvailable(5)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 188.53f, 146.96f, roomInfo.isPCAvailable(6)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 96.403f, 203.07f, roomInfo.isPCAvailable(7)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 142.46f, 203.07f, roomInfo.isPCAvailable(8)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 188.53f, 203.07f, roomInfo.isPCAvailable(9)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 142.46f, 259.18f, roomInfo.isPCAvailable(10)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 188.53f, 259.18f, roomInfo.isPCAvailable(11)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 301.9f, 90.85f, roomInfo.isPCAvailable(12)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 347.96f, 90.85f, roomInfo.isPCAvailable(13)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 301.9f, 146.96f, roomInfo.isPCAvailable(14)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 347.96f, 146.96f, roomInfo.isPCAvailable(15)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 301.9f, 203.07f, roomInfo.isPCAvailable(16)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 347.96f, 203.07f, roomInfo.isPCAvailable(17)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 301.9f, 259.18f, roomInfo.isPCAvailable(18)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 347.96f, 259.18f, roomInfo.isPCAvailable(19)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 301.9f, 380.029f, roomInfo.isPCAvailable(20)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 347.96f, 380.029f, roomInfo.isPCAvailable(21)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 301.9f, 436.14f, roomInfo.isPCAvailable(22)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 347.96f, 436.14f, roomInfo.isPCAvailable(23)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 301.9f, 492.25f, roomInfo.isPCAvailable(24)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 347.96f, 492.25f, roomInfo.isPCAvailable(25)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 324.93f, 61f, roomInfo.isPCAvailable(26)));

        builder.append(generateEndSVG());
        return builder.toString();
    }
}
