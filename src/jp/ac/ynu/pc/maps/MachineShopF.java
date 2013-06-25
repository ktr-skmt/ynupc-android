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
public class MachineShopF extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 650;

    private static final float RECT_WIDTH = 38.223f;
    private static final float RECT_HEIGHT = 21.79f;

    private RoomInfo roomInfo;

    public MachineShopF(RoomInfo roomInfo){
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

        builder.append("<path id=\"wall\" d=\"m400 543h40v-500h-400v500h280\" stroke=\"#000\" stroke-width=\"3\" fill=\"none\"/>");
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 79.11f, 159.62f, roomInfo.isPCAvailable(1)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 123.33f, 159.62f, roomInfo.isPCAvailable(2)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 199.11f, 159.62f, roomInfo.isPCAvailable(7)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 243.33f, 159.62f, roomInfo.isPCAvailable(8)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 318.34f, 159.62f, roomInfo.isPCAvailable(15)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 362.56f, 159.62f, roomInfo.isPCAvailable(16)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 79.11f, 222.41f, roomInfo.isPCAvailable(3)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 123.33f, 222.41f, roomInfo.isPCAvailable(4)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 199.11f, 222.41f, roomInfo.isPCAvailable(9)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 243.33f, 222.8f, roomInfo.isPCAvailable(10)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 318.75f, 222.41f, roomInfo.isPCAvailable(17)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 362.97f, 222.41f, roomInfo.isPCAvailable(18)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 123.33f, 285.2f, roomInfo.isPCAvailable(5)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 199.11f, 285.59f, roomInfo.isPCAvailable(11)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 243.33f, 285.98f, roomInfo.isPCAvailable(12)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 318.53f, 285.2f, roomInfo.isPCAvailable(19)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 362.75f, 285.2f, roomInfo.isPCAvailable(20)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 123.33f, 347.99f, roomInfo.isPCAvailable(6)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 199.11f, 348.77f, roomInfo.isPCAvailable(13)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 243.33f, 349.16f, roomInfo.isPCAvailable(14)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 318.95f, 347.99f, roomInfo.isPCAvailable(21)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 363.17f, 347.99f, roomInfo.isPCAvailable(22)));
        builder.append(generatePCRect(RECT_WIDTH, RECT_HEIGHT, 221.22f, 96.828f, roomInfo.isPCAvailable(23)));

        builder.append(generateEndSVG());
        return builder.toString();
    }
}

//<g id="japanese_words">
//<text font-size="14" font-family="&apos;KozGoPr6N-Regular-83pv-RKSJ-H&apos;" transform="translate(320 530)" fill="#0000FF">↓2F ＰＣプラザ</text>
//</g>
//<g id="english_words" display="none">
//<text font-size="14" fill="#0000FF" transform="translate(320 567)" font-family="&apos;KozGoPr6N-Regular-83pv-RKSJ-H&apos;" display="inline">↓2F PC Plaza</text>
//</g>