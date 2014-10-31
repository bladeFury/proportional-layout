package com.wukongtv.wkwidget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

import com.wukongtv.global.LC;

/**
 * GridView
 * Created by zhangge on 14-10-28.
 */
public class GridView extends android.widget.GridView {
    public GridView(Context context) {
        this(context, null);
    }

    public GridView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LC.resizeView(this);
        // :TODO reflect set these value when < 16
        if (Build.VERSION.SDK_INT >= 16) {
            setColumnWidth(LC.getScaledLength(getColumnWidth()));
            setHorizontalSpacing(LC.getScaledLength(getHorizontalSpacing()));
            setVerticalSpacing(LC.getScaledLength(getVerticalSpacing()));
        }
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        LayoutParams lp = super.generateLayoutParams(attrs);
        LC.resizeLayoutParams(lp);
        return lp;
    }
}
