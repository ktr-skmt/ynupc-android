package jp.ac.ynu.pc.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;


public class ImageMapView extends ImageView {
    public ImageMapView(Context context) {
        super(context);
    }

    public ImageMapView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageMapView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getDrawable() == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            int width = MeasureSpec.getSize(widthMeasureSpec);
            int height = width * getDrawable().getIntrinsicHeight() / getDrawable().getIntrinsicWidth();
            setMeasuredDimension(width, height);
        }
    }
}
