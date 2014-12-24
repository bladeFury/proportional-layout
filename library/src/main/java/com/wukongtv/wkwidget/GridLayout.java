package com.wukongtv.wkwidget;

import android.content.Context;
import android.util.AttributeSet;

import com.wukongtv.utils.LC;

/**
 * Created by zhangge on 14-10-28.
 */
public class GridLayout extends android.widget.GridLayout {
    public GridLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public GridLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GridLayout(Context context) {
        this(context, null);
        LC.resizeView(this);
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        LayoutParams lp = super.generateLayoutParams(attrs);
        LC.resizeLayoutParams(lp);
        lp.leftMargin = LC.getScaledLength(lp.leftMargin);
        lp.rightMargin = LC.getScaledLength(lp.rightMargin);
        lp.topMargin = LC.getScaledLength(lp.topMargin);
        lp.bottomMargin = LC.getScaledLength(lp.bottomMargin);
        return lp;
    }
}
