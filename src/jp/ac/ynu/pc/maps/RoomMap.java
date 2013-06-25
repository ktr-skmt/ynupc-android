package jp.ac.ynu.pc.maps;

import android.graphics.Bitmap;
import jp.ac.ynu.pc.Config;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/18
 * Time: 20:16
 * To change this template use File | Settings | File Templates.
 */
public abstract class RoomMap {
    public abstract Bitmap createMap();

    protected String generateHeader(int width, int height){
        StringBuilder builder = new StringBuilder();

        builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
        builder.append("<!DOCTYPE svg  PUBLIC '-//W3C//DTD SVG 1.1//EN'  'http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd'>");
        builder.append("<svg xmlns=\"http://www.w3.org/2000/svg\" xml:space=\"preserve\" version=\"1.1\" y=\"0px\" x=\"0px\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"");
        builder.append(width);
        builder.append("px\" height=\"");
        builder.append(height);
        builder.append("px\" viewBox=\"0 0 ");
        builder.append(width);
        builder.append(' ');
        builder.append(height);
        builder.append("\" enable-background=\"new 0 0 ");
        builder.append(width);
        builder.append(' ');
        builder.append(height);
        builder.append("\">");

        return builder.toString();
    }

    protected String generateEndSVG(){
        return "</svg>";
    }

    protected String generatePCRect(float width, float height, float x, float y, boolean isOn){
        final String color;
        if(isOn){
            color = Config.COLOR_STATE_ON;
        }else {
            color = Config.COLOR_STATE_OFF;
        }

        StringBuilder builder = new StringBuilder();
        builder.append("<rect x=\"");
        builder.append(x);
        builder.append("\" y=\"");
        builder.append(y);
        builder.append("\" width=\"");
        builder.append(width);
        builder.append("\" height=\"");
        builder.append(height);
        builder.append("\" stroke=\"");
        builder.append(color);
        builder.append("\" stroke-miterlimit=\"10\" fill=\"");
        builder.append(color);
        builder.append("\"/>");
        return builder.toString();
    }

}
