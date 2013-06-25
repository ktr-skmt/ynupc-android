package jp.ac.ynu.pc.maps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * 留学生センター2Fロビー
 * T.svg
 */
public class InternationalStudentCenter extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 650;

    private static final float RECT_WIDTH = 40.8f;
    private static final float RECT_HEIGHT = 26f;

    private RoomInfo roomInfo;

    public InternationalStudentCenter(RoomInfo roomInfo){
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

        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 118.38f, 76.052f, roomInfo.isPCAvailable(6)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 185.18f, 76.052f, roomInfo.isPCAvailable(7)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 251.98f, 75.391f, roomInfo.isPCAvailable(8)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 318.78f, 75.391f, roomInfo.isPCAvailable(9)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 385.58f, 75.391f, roomInfo.isPCAvailable(10)));
        builder.append(generatePCRect(RECT_HEIGHT, RECT_WIDTH, 74f, 119.44f, roomInfo.isPCAvailable(5)));
        builder.append(generatePCRect(RECT_HEIGHT, RECT_WIDTH, 74f, 191.24f, roomInfo.isPCAvailable(4)));
        builder.append(generatePCRect(RECT_HEIGHT, RECT_WIDTH, 74f, 263.04f, roomInfo.isPCAvailable(3)));
        builder.append(generatePCRect(RECT_HEIGHT, RECT_WIDTH, 74f, 334.84f, roomInfo.isPCAvailable(2)));
        builder.append(generatePCRect(RECT_HEIGHT, RECT_WIDTH, 74f, 406.641f, roomInfo.isPCAvailable(1)));

        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"36.455\" y1=\"43.188\" x2=\"36.455\" y2=\"508.35\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"36.455\" y1=\"566.791\" x2=\"36.455\" y2=\"587.57\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"452.035\" y1=\"587.57\" x2=\"452.035\" y2=\"43.208\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"452.035\" y1=\"44.714\" x2=\"36.455\" y2=\"44.714\"/>");

        builder.append(generateEndSVG());
        return builder.toString();
    }
}
