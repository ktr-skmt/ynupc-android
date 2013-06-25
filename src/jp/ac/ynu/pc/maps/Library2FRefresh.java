package jp.ac.ynu.pc.maps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * 中央図書館2Fリフレッシュルーム
 * P-2.svg
 */
public class Library2FRefresh extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 600;

    private static final float RECT_WIDTH = 44.537f;
    private static final float RECT_HEIGHT = 21.316f;

    private RoomInfo roomInfo;

    public Library2FRefresh(RoomInfo roomInfo){
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

        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 317f, 83.386f, roomInfo.isPCAvailable(66)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 233.57f, 83.386f, roomInfo.isPCAvailable(67)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 146f, 83.386f, roomInfo.isPCAvailable(68)));

        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"85.598\" y1=\"37.273\" x2=\"426.078\" y2=\"37.273\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"426.078\" y1=\"35.75\" x2=\"426.078\" y2=\"543.812\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"426.078\" y1=\"542.312\" x2=\"347.077\" y2=\"542.312\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"291.58\" y1=\"542.319\" x2=\"85.598\" y2=\"542.312\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"85.598\" y1=\"543.792\" x2=\"85.598\" y2=\"104.131\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"85.599\" y1=\"57.341\" x2=\"85.599\" y2=\"35.792\"/>");

        builder.append(generateEndSVG());
        return builder.toString();
    }
}
