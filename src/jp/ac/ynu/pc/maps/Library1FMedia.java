package jp.ac.ynu.pc.maps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * 中央図書館1Fメディアブース
 * U.svg
 */
public class Library1FMedia extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 700;

    private static final float RECT_WIDTH = 12.688f;
    private static final float RECT_HEIGHT = 12.041f;

    private RoomInfo roomInfo;

    public Library1FMedia(RoomInfo roomInfo){
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

        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 231.91f, 48.08f, roomInfo.isPCAvailable(1)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 231.91f, 66.08f, roomInfo.isPCAvailable(2)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 286.5f, 142.08f, roomInfo.isPCAvailable(3)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 286.5f, 236.08f, roomInfo.isPCAvailable(4)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 286.5f, 331.08f, roomInfo.isPCAvailable(5)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 286.5f, 425.08f, roomInfo.isPCAvailable(6)));

        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"40.703\" x2=\"226.35\" y2=\"78.583\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"94.583\" x2=\"226.35\" y2=\"98.844\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"98.359\" x2=\"306.871\" y2=\"98.359\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"306.871\" y1=\"98.844\" x2=\"306.871\" y2=\"40.719\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"306.871\" y1=\"41.216\" x2=\"226.35\" y2=\"41.216\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"135.006\" x2=\"226.35\" y2=\"172.886\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"188.886\" x2=\"226.35\" y2=\"193.146\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"192.662\" x2=\"306.871\" y2=\"192.662\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"306.871\" y1=\"193.146\" x2=\"306.871\" y2=\"135.021\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"306.871\" y1=\"135.519\" x2=\"226.35\" y2=\"135.519\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"230.573\" x2=\"226.35\" y2=\"268.453\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"284.453\" x2=\"226.35\" y2=\"288.713\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"288.229\" x2=\"306.871\" y2=\"288.229\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"306.871\" y1=\"288.713\" x2=\"306.871\" y2=\"230.588\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"306.871\" y1=\"231.085\" x2=\"226.35\" y2=\"231.085\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"323.571\" x2=\"226.35\" y2=\"361.451\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"377.451\" x2=\"226.35\" y2=\"381.712\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"381.227\" x2=\"306.871\" y2=\"381.227\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"306.871\" y1=\"381.712\" x2=\"306.871\" y2=\"323.587\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"306.871\" y1=\"324.084\" x2=\"226.35\" y2=\"324.084\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"417.857\" x2=\"226.35\" y2=\"455.737\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"471.737\" x2=\"226.35\" y2=\"475.998\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"475.514\" x2=\"306.871\" y2=\"475.514\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"306.871\" y1=\"475.998\" x2=\"306.871\" y2=\"417.873\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"306.871\" y1=\"418.37\" x2=\"226.35\" y2=\"418.37\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"511.984\" x2=\"226.35\" y2=\"556.847\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"572.847\" x2=\"226.35\" y2=\"593.126\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"226.35\" y1=\"592.623\" x2=\"306.871\" y2=\"592.623\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"306.871\" y1=\"593.084\" x2=\"306.871\" y2=\"511.959\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-miterlimit=\"10\" x1=\"306.871\" y1=\"512.479\" x2=\"226.35\" y2=\"512.479\"/>");

        builder.append(generateEndSVG());
        return builder.toString();
    }
}
