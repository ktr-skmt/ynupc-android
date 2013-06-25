package jp.ac.ynu.pc.maps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * 生産工学科1号棟305
 * N.svg
 */
public class MechanicalEngineering305 extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 700;

    private static final float RECT_WIDTH = 29.946f;
    private static final float RECT_HEIGHT = 12.132f;

    private RoomInfo roomInfo;

    public MechanicalEngineering305(RoomInfo roomInfo) {
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

        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 55.82f, roomInfo.isPCAvailable(27)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 55.82f, roomInfo.isPCAvailable(54)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 72.952f, roomInfo.isPCAvailable(26)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 72.952f, roomInfo.isPCAvailable(53)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 90.083f, roomInfo.isPCAvailable(25)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 90.083f, roomInfo.isPCAvailable(52)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 107.22f, roomInfo.isPCAvailable(24)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 107.22f, roomInfo.isPCAvailable(51)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 124.35f, roomInfo.isPCAvailable(23)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 124.35f, roomInfo.isPCAvailable(50)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 141.48f, roomInfo.isPCAvailable(22)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 141.48f, roomInfo.isPCAvailable(49)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 158.61f, roomInfo.isPCAvailable(21)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 158.61f, roomInfo.isPCAvailable(48)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 175.74f, roomInfo.isPCAvailable(20)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 175.74f, roomInfo.isPCAvailable(47)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 192.88f, roomInfo.isPCAvailable(19)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 192.88f, roomInfo.isPCAvailable(46)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 224.01f, roomInfo.isPCAvailable(18)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 224.01f, roomInfo.isPCAvailable(45)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 241.14f, roomInfo.isPCAvailable(17)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 241.14f, roomInfo.isPCAvailable(44)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 258.27f, roomInfo.isPCAvailable(16)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 258.27f, roomInfo.isPCAvailable(43)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 275.4f, roomInfo.isPCAvailable(15)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 275.4f, roomInfo.isPCAvailable(42)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 292.53f, roomInfo.isPCAvailable(14)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 292.53f, roomInfo.isPCAvailable(41)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.29f, 309.67f, roomInfo.isPCAvailable(13)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.24f, 309.67f, roomInfo.isPCAvailable(40)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.48f, 340.8f, roomInfo.isPCAvailable(12)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.43f, 340.8f, roomInfo.isPCAvailable(39)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.48f, 357.93f, roomInfo.isPCAvailable(11)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.43f, 357.93f, roomInfo.isPCAvailable(38)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.48f, 375.061f, roomInfo.isPCAvailable(10)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.43f, 375.061f, roomInfo.isPCAvailable(37)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.48f, 392.189f, roomInfo.isPCAvailable(9)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.43f, 392.189f, roomInfo.isPCAvailable(36)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.48f, 409.32f, roomInfo.isPCAvailable(8)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.43f, 409.32f, roomInfo.isPCAvailable(35)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.48f, 426.46f, roomInfo.isPCAvailable(7)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.43f, 426.46f, roomInfo.isPCAvailable(34)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.54f, 457.59f, roomInfo.isPCAvailable(6)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.49f, 457.59f, roomInfo.isPCAvailable(33)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.54f, 474.72f, roomInfo.isPCAvailable(5)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.49f, 474.72f, roomInfo.isPCAvailable(32)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.54f, 491.85f, roomInfo.isPCAvailable(4)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.49f, 491.85f, roomInfo.isPCAvailable(31)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.54f, 508.98f, roomInfo.isPCAvailable(3)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.49f, 508.98f, roomInfo.isPCAvailable(30)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.54f, 526.12f, roomInfo.isPCAvailable(2)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.49f, 526.12f, roomInfo.isPCAvailable(29)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 112.54f, 543.25f, roomInfo.isPCAvailable(1)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 148.49f, 543.25f, roomInfo.isPCAvailable(28)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 55.82f, roomInfo.isPCAvailable(81)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 55.82f, roomInfo.isPCAvailable(108)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 72.952f, roomInfo.isPCAvailable(80)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 72.952f, roomInfo.isPCAvailable(107)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 90.083f, roomInfo.isPCAvailable(79)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 90.083f, roomInfo.isPCAvailable(106)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 107.22f, roomInfo.isPCAvailable(78)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 107.22f, roomInfo.isPCAvailable(105)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 124.35f, roomInfo.isPCAvailable(77)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 124.35f, roomInfo.isPCAvailable(104)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 141.48f, roomInfo.isPCAvailable(76)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 141.48f, roomInfo.isPCAvailable(103)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 158.61f, roomInfo.isPCAvailable(75)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 158.61f, roomInfo.isPCAvailable(102)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 175.74f, roomInfo.isPCAvailable(74)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 175.74f, roomInfo.isPCAvailable(101)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 192.88f, roomInfo.isPCAvailable(73)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 192.88f, roomInfo.isPCAvailable(100)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.471f, 224.01f, roomInfo.isPCAvailable(72)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.42f, 224.01f, roomInfo.isPCAvailable(99)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.471f, 241.14f, roomInfo.isPCAvailable(71)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.42f, 241.14f, roomInfo.isPCAvailable(98)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.471f, 258.27f, roomInfo.isPCAvailable(70)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.42f, 258.27f, roomInfo.isPCAvailable(97)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.471f, 275.4f, roomInfo.isPCAvailable(69)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.42f, 275.4f, roomInfo.isPCAvailable(96)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.471f, 292.53f, roomInfo.isPCAvailable(68)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.42f, 292.53f, roomInfo.isPCAvailable(95)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.471f, 309.67f, roomInfo.isPCAvailable(67)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.42f, 309.67f, roomInfo.isPCAvailable(94)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 340.8f, roomInfo.isPCAvailable(66)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 340.8f, roomInfo.isPCAvailable(93)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 357.93f, roomInfo.isPCAvailable(65)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 357.93f, roomInfo.isPCAvailable(92)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 375.061f, roomInfo.isPCAvailable(64)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 375.061f, roomInfo.isPCAvailable(91)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 392.189f, roomInfo.isPCAvailable(63)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 392.189f, roomInfo.isPCAvailable(90)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 409.32f, roomInfo.isPCAvailable(62)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 409.32f, roomInfo.isPCAvailable(89)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.67f, 426.46f, roomInfo.isPCAvailable(61)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.62f, 426.46f, roomInfo.isPCAvailable(88)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.721f, 457.59f, roomInfo.isPCAvailable(60)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.67f, 457.59f, roomInfo.isPCAvailable(87)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.721f, 474.72f, roomInfo.isPCAvailable(59)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.67f, 474.72f, roomInfo.isPCAvailable(86)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.721f, 491.85f, roomInfo.isPCAvailable(58)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.67f, 491.85f, roomInfo.isPCAvailable(85)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.721f, 508.98f, roomInfo.isPCAvailable(57)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.67f, 508.98f, roomInfo.isPCAvailable(84)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.721f, 526.12f, roomInfo.isPCAvailable(56)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.67f, 526.12f, roomInfo.isPCAvailable(83)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 266.721f, 543.25f, roomInfo.isPCAvailable(55)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 302.67f, 543.25f, roomInfo.isPCAvailable(82)));

        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"29.513\" y1=\"30.875\" x2=\"29.513\" y2=\"581.25\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"29.513\" y1=\"579.78\" x2=\"448.593\" y2=\"579.78\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"448.593\" y1=\"581.281\" x2=\"448.59\" y2=\"105.77\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"448.593\" y1=\"60.47\" x2=\"448.593\" y2=\"30.874\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"448.593\" y1=\"32.38\" x2=\"29.513\" y2=\"32.38\"/>");


        builder.append(generateEndSVG());
        return builder.toString();
    }
}
