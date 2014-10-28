package com.wukongtv.wkwidget;

import android.content.Context;
import android.util.AttributeSet;

import com.wukongtv.global.LC;

/**
 * Created by zhangge on 14-10-28.
 */
public class RelativeLayout extends android.widget.RelativeLayout {
    public RelativeLayout(Context context) {
        this(context, null);
    }

    public RelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RelativeLayout(Context context, AttributeSet attrs, int defStyle) {
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
