package com.wukongtv.wkwidget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

import com.wukongtv.global.LC;

/**
 * ImageView
 * Created by zhangge on 14-10-31.
 */
public class ImageView extends android.widget.ImageView {
    public ImageView(Context context) {
        this(context, null);
    }

    public ImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LC.resizeView(this);
        if (Build.VERSION.SDK_INT >= 16) {
            setMaxHeight(LC.getScaledLength(getMaxHeight()));
            setMaxWidth(LC.getScaledLength(getMaxWidth()));
            setBaseline(LC.getScaledLength(getBaseline()));
        }
    }
}
