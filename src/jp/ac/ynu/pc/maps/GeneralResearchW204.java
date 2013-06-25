package jp.ac.ynu.pc.maps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * 総合研究棟W204
 * O.svg
 */
public class GeneralResearchW204 extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 650;

    private static final float RECT_WIDTH = 22.664f;
    private static final float RECT_HEIGHT = 23.111f;

    private RoomInfo roomInfo;

    public GeneralResearchW204(RoomInfo roomInfo){
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

        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 170.32f, 161.97f, roomInfo.isPCAvailable(51)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 102.99f, 204.08f, roomInfo.isPCAvailable(1)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 136.65f, 204.08f, roomInfo.isPCAvailable(2)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 170.32f, 204.08f, roomInfo.isPCAvailable(3)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 203.98f, 204.08f, roomInfo.isPCAvailable(4)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 102.99f, 246.19f, roomInfo.isPCAvailable(5)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 136.65f, 246.19f, roomInfo.isPCAvailable(6)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 170.32f, 246.19f, roomInfo.isPCAvailable(7)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 203.98f, 246.19f, roomInfo.isPCAvailable(8)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 102.99f, 288.3f, roomInfo.isPCAvailable(9)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 136.65f, 288.3f, roomInfo.isPCAvailable(10)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 170.32f, 288.3f, roomInfo.isPCAvailable(11)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 203.98f, 288.3f, roomInfo.isPCAvailable(12)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 102.99f, 330.41f, roomInfo.isPCAvailable(13)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 136.65f, 330.41f, roomInfo.isPCAvailable(14)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 170.32f, 330.41f, roomInfo.isPCAvailable(15)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 203.98f, 330.41f, roomInfo.isPCAvailable(16)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 102.99f, 372.52f, roomInfo.isPCAvailable(17)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 136.65f, 372.52f, roomInfo.isPCAvailable(18)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 170.32f, 372.52f, roomInfo.isPCAvailable(19)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 203.98f, 372.52f, roomInfo.isPCAvailable(20)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 136.65f, 414.641f, roomInfo.isPCAvailable(21)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 170.32f, 414.641f, roomInfo.isPCAvailable(22)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 203.98f, 414.641f, roomInfo.isPCAvailable(23)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 272.93f, 174.8f, roomInfo.isPCAvailable(24)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 306.59f, 174.8f, roomInfo.isPCAvailable(25)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 340.26f, 174.8f, roomInfo.isPCAvailable(26)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 373.92f, 174.8f, roomInfo.isPCAvailable(27)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 272.93f, 216.91f, roomInfo.isPCAvailable(28)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 306.59f, 216.91f, roomInfo.isPCAvailable(29)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 340.26f, 216.91f, roomInfo.isPCAvailable(30)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 373.92f, 216.91f, roomInfo.isPCAvailable(31)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 272.93f, 259.02f, roomInfo.isPCAvailable(32)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 306.59f, 259.02f, roomInfo.isPCAvailable(33)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 340.26f, 259.02f, roomInfo.isPCAvailable(34)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 373.92f, 259.02f, roomInfo.isPCAvailable(35)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 272.92f, 301.13f, roomInfo.isPCAvailable(36)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 306.24f, 301.13f, roomInfo.isPCAvailable(37)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 339.56f, 301.13f, roomInfo.isPCAvailable(38)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 272.93f, 343.24f, roomInfo.isPCAvailable(39)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 306.59f, 343.24f, roomInfo.isPCAvailable(40)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 340.26f, 343.24f, roomInfo.isPCAvailable(41)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 373.92f, 343.24f, roomInfo.isPCAvailable(42)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 272.93f, 385.35f, roomInfo.isPCAvailable(43)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 306.59f, 385.35f, roomInfo.isPCAvailable(44)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 340.26f, 385.35f, roomInfo.isPCAvailable(45)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 373.92f, 385.35f, roomInfo.isPCAvailable(46)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 272.93f, 427.46f, roomInfo.isPCAvailable(47)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 306.59f, 427.46f, roomInfo.isPCAvailable(48)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 340.26f, 427.46f, roomInfo.isPCAvailable(49)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 373.92f, 427.46f, roomInfo.isPCAvailable(50)));

        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"62.429\" y1=\"50.188\" x2=\"62.429\" y2=\"446.96\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"428.659\" y1=\"50.172\" x2=\"428.659\" y2=\"560.969\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"428.659\" y1=\"559.479\" x2=\"62.429\" y2=\"559.479\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"62.429\" y1=\"560.969\" x2=\"62.429\" y2=\"487.22\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"62.429\" y1=\"51.688\" x2=\"428.659\" y2=\"51.688\"/>");


        builder.append(generateEndSVG());
        return builder.toString();
    }
}
