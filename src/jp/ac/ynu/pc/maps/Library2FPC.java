package jp.ac.ynu.pc.maps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
import jp.ac.ynu.pc.models.RoomInfo;

/**
 * 中央図書館2FPCプラザ
 * P-1.svg
 */
public class Library2FPC extends RoomMap {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 720;

    private RoomInfo roomInfo;

    public Library2FPC(RoomInfo roomInfo){
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
        builder.append(generatePCRect(24.674f, 16.51f, 83.208f, 130.69f, roomInfo.isPCAvailable(34)));
        builder.append(generatePCRect(24.672f, 12.264f, 229.47f, 165.03f, roomInfo.isPCAvailable(16)));
        builder.append(generatePCRect(25.617f, 14.354f, 368.67f, 53.909f, roomInfo.isPCAvailable(64)));
        builder.append(generatePCRect(25.618f, 14.354f, 214.2f, 53.909f, roomInfo.isPCAvailable(60)));
        builder.append(generatePCRect(20.091f, 19.811f, 202.14f, 554.47f, roomInfo.isPCAvailable(52)));
        builder.append(generatePCRect(20.091f, 19.811f, 226.3f, 554.47f, roomInfo.isPCAvailable(55)));
        builder.append(generatePCRect(25.618f, 14.354f, 407.29f, 53.909f, roomInfo.isPCAvailable(65)));
        builder.append(generatePCRect(20.091f, 19.811f, 202.14f, 578.28f, roomInfo.isPCAvailable(53)));
        builder.append(generatePCRect(25.618f, 14.354f, 175.58f, 53.909f, roomInfo.isPCAvailable(59)));
        builder.append(generatePCRect(25.618f, 14.354f, 330.05f, 53.909f, roomInfo.isPCAvailable(63)));
        builder.append(generatePCRect(25.616f, 14.354f, 291.439f, 53.909f, roomInfo.isPCAvailable(62)));
        builder.append(generatePCRect(25.618f, 14.354f, 98.349f, 53.909f, roomInfo.isPCAvailable(57)));
        builder.append(generatePCRect(20.091f, 19.811f, 226.29f, 578.28f, roomInfo.isPCAvailable(54)));
        builder.append(generatePCRect(25.618f, 14.354f, 136.97f, 53.909f, roomInfo.isPCAvailable(58)));
        builder.append(generatePCRect(25.617f, 14.354f, 252.82f, 53.909f, roomInfo.isPCAvailable(61)));
        builder.append(generatePCRect(25.618f, 14.354f, 59.731f, 53.909f, roomInfo.isPCAvailable(56)));

        builder.append(generatePCRect(24.675f, 12.265f, 97.947f, 151.763f, roomInfo.isPCAvailable(35), "matrix(0.5839 -0.8118 0.8118 0.5839 -82.2943 155.2299)"));
        builder.append(generatePCRect(24.674f, 12.262f, 69.364f, 150.453f, roomInfo.isPCAvailable(36), "matrix(-0.6913 -0.7225 0.7225 -0.6913 25.0454 323.8669)"));
        builder.append(generatePCRect(24.674f, 12.264f, 77.719f, 226.125f, roomInfo.isPCAvailable(39), "matrix(0.9967 0.0806 -0.0806 0.9967 19.0133 -6.503)"));
        builder.append(generatePCRect(24.676f, 12.265f, 64.737f, 203.93f, roomInfo.isPCAvailable(37), "matrix(-0.5349 0.8449 -0.8449 -0.5349 295.7868 257.3057)"));
        builder.append(generatePCRect(24.672f, 12.265f, 93.121f, 207.535f, roomInfo.isPCAvailable(38), "matrix(0.6308 0.7759 -0.7759 0.6308 204.7199 -2.9473)"));
        builder.append(generatePCRect(24.673f, 12.264f, 83.132f, 294.701f, roomInfo.isPCAvailable(41), "matrix(0.9406 -0.3394 0.3394 0.9406 -96.4359 50.2589)"));
        builder.append(generatePCRect(24.674f, 12.264f, 62.116f, 279.889f, roomInfo.isPCAvailable(42), "matrix(-0.0023 1 -1 -0.0023 360.6443 212.2242)"));
        builder.append(generatePCRect(24.674f, 12.265f, 84.219f, 271.42f, roomInfo.isPCAvailable(40), "matrix(0.8955 0.445 -0.445 0.8955 133.6044 -13.9707)"));
        builder.append(generatePCRect(24.675f, 12.264f, 78.661f, 368.666f, roomInfo.isPCAvailable(44), "matrix(0.0068 -1 1 0.0068 -284.4083 463.2514)"));
        builder.append(generatePCRect(24.674f, 12.263f, 57.503f, 383.272f, roomInfo.isPCAvailable(45), "matrix(0.8821 0.471 -0.471 0.8821 191.6501 13.0059)"));
        builder.append(generatePCRect(24.679f, 12.267f, 59f, 354.717f, roomInfo.isPCAvailable(43), "matrix(0.7272 -0.6864 0.6864 0.7272 -228.2295 147.4001)"));
        builder.append(generatePCRect(24.672f, 12.265f, 83.514f, 431.349f, roomInfo.isPCAvailable(46), "matrix(-0.8481 -0.5299 0.5299 -0.8481 -54.6925 859.2792)"));
        builder.append(generatePCRect(24.674f, 12.264f, 84.849f, 457.011f, roomInfo.isPCAvailable(47), "matrix(0.8635 -0.5043 0.5043 0.8635 -220.3033 112.2201)"));
        builder.append(generatePCRect(24.676f, 12.266f, 61.298f, 440.777f, roomInfo.isPCAvailable(48), "matrix(-0.2034 -0.9791 0.9791 -0.2034 -348.9552 609.907)"));
        builder.append(generatePCRect(24.676f, 12.264f, 86.448f, 538.798f, roomInfo.isPCAvailable(50), "matrix(0.0068 -1 1 0.0068 -446.8033 640.0043)"));
        builder.append(generatePCRect(21.103f, 12.265f, 68.546f, 554.399f, roomInfo.isPCAvailable(51), "matrix(0.8267 0.5626 -0.5626 0.8267 329.0728 52.6296)"));
        builder.append(generatePCRect(24.676f, 12.266f, 66.759f, 524.854f, roomInfo.isPCAvailable(49), "matrix(0.7273 -0.6863 0.6863 0.7273 -342.8524 199.0801)"));
        builder.append(generatePCRect(24.674f, 12.264f, 259.294f, 134.72f, roomInfo.isPCAvailable(9), "matrix(0.9967 0.0806 -0.0806 0.9967 12.2366 -21.4357)"));
        builder.append(generatePCRect(24.678f, 12.267f, 246.287f, 112.514f, roomInfo.isPCAvailable(7), "matrix(-0.6718 0.7407 -0.7407 -0.6718 520.2542 6.7778)"));
        builder.append(generatePCRect(24.673f, 12.264f, 274.686f, 116.139f, roomInfo.isPCAvailable(8), "matrix(0.6308 0.7759 -0.7759 0.6308 200.8343 -177.5687)"));
        builder.append(generatePCRect(24.672f, 12.263f, 338.031f, 124.578f, roomInfo.isPCAvailable(2), "matrix(0.9406 -0.3394 0.3394 0.9406 -23.5658 126.6807)"));
        builder.append(generatePCRect(24.679f, 12.268f, 317.023f, 109.764f, roomInfo.isPCAvailable(3), "matrix(0.1806 0.9836 -0.9836 0.1806 383.8725 -228.9794)"));
        builder.append(generatePCRect(24.672f, 12.267f, 339.153f, 101.285f, roomInfo.isPCAvailable(1), "matrix(0.8396 0.5432 -0.5432 0.8396 114.7312 -173.7025)"));
        builder.append(generatePCRect(24.679f, 12.263f, 244.192f, 186.091f, roomInfo.isPCAvailable(17), "matrix(0.465 -0.8853 0.8853 0.465 -32.9323 329.9477)"));
        builder.append(generatePCRect(24.675f, 12.264f, 215.614f, 184.796f, roomInfo.isPCAvailable(18), "matrix(-0.6913 -0.7225 0.7225 -0.6913 247.5939 487.6257)"));
        builder.append(generatePCRect(24.677f, 12.263f, 249.681f, 244.708f, roomInfo.isPCAvailable(19), "matrix(-0.9695 0.2451 -0.2451 -0.9695 577.5277 429.8075)"));
        builder.append(generatePCRect(24.676f, 12.267f, 271.115f, 259.512f, roomInfo.isPCAvailable(20), "matrix(0.2338 -0.9723 0.9723 0.2338 -41.1051 479.1296)"));
        builder.append(generatePCRect(24.678f, 12.267f, 244.1f, 267.26f, roomInfo.isPCAvailable(21), "matrix(-0.8474 -0.531 0.531 -0.8474 328.5787 641.2266)"));
        builder.append(generatePCRect(24.673f, 12.266f, 339.846f, 267.808f, roomInfo.isPCAvailable(11), "matrix(0.9194 -0.3933 0.3933 0.9194 -79.3596 160.5937)"));
        builder.append(generatePCRect(24.674f, 12.265f, 315.837f, 253.959f, roomInfo.isPCAvailable(12), "matrix(-0.0023 1 -1 -0.0023 589.0181 -67.4854)"));
        builder.append(generatePCRect(24.675f, 12.266f, 337.951f, 245.514f, roomInfo.isPCAvailable(10), "matrix(0.8955 0.445 -0.445 0.8955 148.5892 -129.595)"));
        builder.append(generatePCRect(24.677f, 12.265f, 277.311f, 326.391f, roomInfo.isPCAvailable(22), "matrix(0.9961 -0.088 0.088 0.9961 -28.1363 26.777)"));
        builder.append(generatePCRect(24.679f, 12.267f, 260.777f, 306.68f, roomInfo.isPCAvailable(24), "matrix(-0.4673 0.8841 -0.8841 -0.4673 677.3058 217.5451)"));
        builder.append(generatePCRect(24.677f, 12.264f, 289.39f, 305.502f, roomInfo.isPCAvailable(23), "matrix(0.7522 0.6589 -0.6589 0.7522 280.1059 -121.5964)"));
        builder.append(generatePCRect(24.672f, 12.264f, 351.559f, 331.097f, roomInfo.isPCAvailable(14), "matrix(0.9406 -0.3394 0.3394 0.9406 -92.8593 143.5321)"));
        builder.append(generatePCRect(24.674f, 12.264f, 327.548f, 316.313f, roomInfo.isPCAvailable(15), "matrix(-0.0023 1 -1 -0.0023 663.1087 -16.6991)"));
        builder.append(generatePCRect(24.676f, 12.266f, 349.645f, 307.843f, roomInfo.isPCAvailable(13), "matrix(0.8955 0.445 -0.445 0.8955 177.5413 -128.2837)"));
        builder.append(generatePCRect(24.676f, 12.263f, 301.059f, 383.634f, roomInfo.isPCAvailable(25), "matrix(0.9785 -0.2061 0.2061 0.9785 -73.6044 72.9616)"));
        builder.append(generatePCRect(24.671f, 12.262f, 284.933f, 370.575f, roomInfo.isPCAvailable(27), "matrix(-0.2873 0.9578 -0.9578 -0.2873 743.497 200.1969)"));
        builder.append(generatePCRect(24.674f, 12.265f, 309.963f, 361.67f, roomInfo.isPCAvailable(26), "matrix(0.817 0.5766 -0.5766 0.817 271.0572 -118.5413)"));
        builder.append(generatePCRect(24.676f, 12.262f, 305.881f, 442.346f, roomInfo.isPCAvailable(29), "matrix(0.9786 -0.206 0.206 0.9786 -85.5584 75.169)"));
        builder.append(generatePCRect(24.67f, 12.261f, 288.776f, 426.244f, roomInfo.isPCAvailable(30), "matrix(-0.2873 0.9578 -0.9578 -0.2873 801.7739 268.2033)"));
        builder.append(generatePCRect(24.678f, 12.265f, 314.767f, 420.352f, roomInfo.isPCAvailable(28), "matrix(0.817 0.5767 -0.5767 0.817 305.8184 -110.5765)"));
        builder.append(generatePCRect(24.677f, 12.265f, 312.529f, 498.345f, roomInfo.isPCAvailable(33), "matrix(0.9992 -0.0409 0.0409 0.9992 -20.3708 13.7159)"));
        builder.append(generatePCRect(24.675f, 12.264f, 297.282f, 479.643f, roomInfo.isPCAvailable(31), "matrix(-0.5385 0.8426 -0.8426 -0.5385 885.6765 486.4812)"));
        builder.append(generatePCRect(24.678f, 12.263f, 324.924f, 479.118f, roomInfo.isPCAvailable(32), "matrix(0.6373 0.7706 -0.7706 0.6373 496.2668 -83.9006)"));
        builder.append(generatePCRect(23.378f, 12.698f, 335.865f, 163.867f, roomInfo.isPCAvailable(5), "matrix(-0.8422 -0.5391 0.5391 -0.8422 548.5115 500.9472)"));
        builder.append(generatePCRect(23.374f, 12.695f, 314.929f, 172.639f, roomInfo.isPCAvailable(4), "matrix(0.1443 0.9895 -0.9895 0.1443 456.5967 -170.0396)"));
        builder.append(generatePCRect(23.377f, 12.699f, 337.889f, 187.233f, roomInfo.isPCAvailable(6), "matrix(-0.9226 0.3858 -0.3858 -0.9226 746.7742 237.3163)"));

        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"29.979\" y1=\"37.5\" x2=\"451.86\" y2=\"37.5\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"451.86\" y1=\"37.5\" x2=\"451.86\" y2=\"75.273\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"29.979\" y1=\"37.5\" x2=\"29.979\" y2=\"69.494\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"29.979\" y1=\"109.75\" x2=\"29.979\" y2=\"474.04\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"29.979\" y1=\"514.3\" x2=\"29.979\" y2=\"673.7\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"29.979\" y1=\"673.7\" x2=\"315.68\" y2=\"673.7\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"315.68\" y1=\"673.7\" x2=\"343.398\" y2=\"562.301\"/>");
        builder.append("<line fill=\"none\" stroke=\"#000000\" stroke-width=\"3\" stroke-miterlimit=\"10\" x1=\"355.255\" y1=\"524.5\" x2=\"451.86\" y2=\"127.996\"/>");


        builder.append(generateEndSVG());
        return builder.toString();
    }

}
