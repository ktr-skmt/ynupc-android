package jp.ac.ynu.pc.maps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import jp.ac.ynu.pc.enums.Room;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/18
 * Time: 20:25
 * To change this template use File | Settings | File Templates.
 */
public class MachineShopCD extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 750;

    private static final float RECT_WIDTH = 24.553f;
    private static final float RECT_HEIGHT = 22.633f;

    private RoomInfo roomCD;

    public MachineShopCD(RoomInfo roomCD){
        this.roomCD = roomCD;
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

        // C教室
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 339.24f, roomCD.isPCAvailable(1, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 311.61f, roomCD.isPCAvailable(2, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 283.98f, roomCD.isPCAvailable(3, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 339.24f, roomCD.isPCAvailable(4, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 311.61f, roomCD.isPCAvailable(5, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 283.98f, roomCD.isPCAvailable(6, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 181.61f, 339.24f, roomCD.isPCAvailable(7, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 181.61f, 311.61f, roomCD.isPCAvailable(8, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 181.61f, 283.98f, roomCD.isPCAvailable(9, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 339.24f, roomCD.isPCAvailable(10, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 311.61f, roomCD.isPCAvailable(11, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 283.98f, roomCD.isPCAvailable(12, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 339.24f, roomCD.isPCAvailable(13, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 311.61f, roomCD.isPCAvailable(14, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 283.98f, roomCD.isPCAvailable(15, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 339.24f, roomCD.isPCAvailable(16, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 311.61f, roomCD.isPCAvailable(17, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 283.98f, roomCD.isPCAvailable(18, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 228.76f, roomCD.isPCAvailable(19, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 201.13f, roomCD.isPCAvailable(20, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 173.5f, roomCD.isPCAvailable(21, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 228.76f, roomCD.isPCAvailable(22, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 201.13f, roomCD.isPCAvailable(23, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 173.5f, roomCD.isPCAvailable(24, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 228.76f, roomCD.isPCAvailable(25, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 201.13f, roomCD.isPCAvailable(26, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 173.5f, roomCD.isPCAvailable(27, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 228.76f, roomCD.isPCAvailable(28, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 201.13f, roomCD.isPCAvailable(29, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 173.5f, roomCD.isPCAvailable(30, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 228.76f, roomCD.isPCAvailable(31, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 201.13f, roomCD.isPCAvailable(32, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 173.5f, roomCD.isPCAvailable(33, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 124.43f, roomCD.isPCAvailable(34, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 96.799f, roomCD.isPCAvailable(35, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 69.166f, roomCD.isPCAvailable(36, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 124.43f, roomCD.isPCAvailable(37, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 96.799f, roomCD.isPCAvailable(38, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 69.166f, roomCD.isPCAvailable(39, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 181.61f, 124.43f, roomCD.isPCAvailable(40, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 181.61f, 96.799f, roomCD.isPCAvailable(41, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 181.61f, 69.166f, roomCD.isPCAvailable(42, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 124.43f, roomCD.isPCAvailable(43, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 96.799f, roomCD.isPCAvailable(44, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 69.166f, roomCD.isPCAvailable(45, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 124.43f, roomCD.isPCAvailable(46, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 96.799f, roomCD.isPCAvailable(47, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 69.166f, roomCD.isPCAvailable(48, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 110.62f, roomCD.isPCAvailable(49, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 82.982f, roomCD.isPCAvailable(50, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 404.86f, 110.62f, roomCD.isPCAvailable(51, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 404.86f, 82.982f, roomCD.isPCAvailable(52, Room.MACHINE_SHOP_C)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 39f, 201.13f, roomCD.isPCAvailable(53, Room.MACHINE_SHOP_C)));


        // D教室
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 660.05f, roomCD.isPCAvailable(1, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 632.42f, roomCD.isPCAvailable(2, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 604.78f, roomCD.isPCAvailable(3, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 660.05f, roomCD.isPCAvailable(4, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 632.42f, roomCD.isPCAvailable(5, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 604.78f, roomCD.isPCAvailable(6, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 181.61f, 660.05f, roomCD.isPCAvailable(7, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 181.61f, 632.42f, roomCD.isPCAvailable(8, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 181.61f, 604.78f, roomCD.isPCAvailable(9, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 660.05f, roomCD.isPCAvailable(10, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 632.42f, roomCD.isPCAvailable(11, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 604.78f, roomCD.isPCAvailable(12, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 660.05f, roomCD.isPCAvailable(13, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 632.42f, roomCD.isPCAvailable(14, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 604.78f, roomCD.isPCAvailable(15, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 551.07f, roomCD.isPCAvailable(16, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 523.44f, roomCD.isPCAvailable(17, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 495.81f, roomCD.isPCAvailable(18, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 551.07f, roomCD.isPCAvailable(19, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 523.44f, roomCD.isPCAvailable(20, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 495.81f, roomCD.isPCAvailable(21, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 551.07f, roomCD.isPCAvailable(22, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 523.44f, roomCD.isPCAvailable(23, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 495.81f, roomCD.isPCAvailable(24, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 551.07f, roomCD.isPCAvailable(25, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 523.44f, roomCD.isPCAvailable(26, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 495.81f, roomCD.isPCAvailable(27, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 551.07f, roomCD.isPCAvailable(28, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 523.44f, roomCD.isPCAvailable(29, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 495.81f, roomCD.isPCAvailable(30, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 404.86f, 551.07f, roomCD.isPCAvailable(31, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 404.86f, 523.44f, roomCD.isPCAvailable(32, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 404.86f, 495.81f, roomCD.isPCAvailable(33, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 450.89f, roomCD.isPCAvailable(34, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 423.25f, roomCD.isPCAvailable(35, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 69.993f, 395.62f, roomCD.isPCAvailable(36, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 450.89f, roomCD.isPCAvailable(37, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 423.25f, roomCD.isPCAvailable(38, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 125.8f, 395.62f, roomCD.isPCAvailable(39, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 181.61f, 450.89f, roomCD.isPCAvailable(40, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 181.61f, 423.25f, roomCD.isPCAvailable(41, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 181.61f, 395.62f, roomCD.isPCAvailable(42, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 450.89f, roomCD.isPCAvailable(43, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 423.25f, roomCD.isPCAvailable(44, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 237.42f, 395.62f, roomCD.isPCAvailable(45, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 450.89f, roomCD.isPCAvailable(46, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 423.25f, roomCD.isPCAvailable(47, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 293.24f, 395.62f, roomCD.isPCAvailable(48, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 437.07f, roomCD.isPCAvailable(49, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 349.05f, 409.439f, roomCD.isPCAvailable(50, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 404.86f, 437.07f, roomCD.isPCAvailable(51, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 404.86f, 409.439f, roomCD.isPCAvailable(52, Room.MACHINE_SHOP_D)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 39f, 523.44f, roomCD.isPCAvailable(53, Room.MACHINE_SHOP_D)));

        // 外枠
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"30.46\" y1=\"47.667\" x2=\"30.46\" y2=\"705.21\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"30.46\" y1=\"703.692\" x2=\"449.54\" y2=\"703.692\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"449.54\" y1=\"705.21\" x2=\"449.54\" y2=\"604.78\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"449.54\" y1=\"563.387\" x2=\"449.54\" y2=\"187.503\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"449.54\" y1=\"151.14\" x2=\"449.54\" y2=\"47.629\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"30.46\" y1=\"49.132\" x2=\"449.54\" y2=\"49.132\"/>");

        builder.append(generateEndSVG());
        return builder.toString();
    }

//    <text transform="matrix(1 0 0 1 410.5996 595)" font-family="'KozGoPr6N-Regular-83pv-RKSJ-H'" font-size="14">入口</text>
//    <text transform="matrix(1 0 0 1 408.9102 172.5498)" font-family="'KozGoPr6N-Regular-83pv-RKSJ-H'" font-size="14">入口</text>
//    <g id="english_words" display="none">
//    <text transform="matrix(1 0 0 1 405.5996 595)" display="inline" font-family="'KozGoPr6N-Regular-83pv-RKSJ-H'" font-size="14">Entrance</text>
//
//    <text transform="matrix(1 0 0 1 403.9102 172.5498)" display="inline" font-family="'KozGoPr6N-Regular-83pv-RKSJ-H'" font-size="14">Entrance</text>
//    </g>
}
