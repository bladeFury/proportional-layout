package com.wukongtv.wkwidget;

import android.content.Context;
import android.util.AttributeSet;

import com.wukongtv.global.LC;

/**
 * FrameLayout
 * Created by zhangge on 14-10-28.
 */
public class FrameLayout extends android.widget.FrameLayout {
    public FrameLayout(Context context) {
        this(context, null);
    }

    public FrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FrameLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LC.resizeView(this);
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        LayoutParams lp = super.generateLayoutParams(attrs);
        LC.resizeMarginLayoutParams(lp);
        return lp;
    }
}
