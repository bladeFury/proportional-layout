package com.wukongtv.wkwidget;

import android.content.Context;
import android.util.AttributeSet;

import com.wukongtv.utils.LC;

/**
 * Created by zhangge on 14-10-28.
 */
public class ListView extends android.widget.ListView {
    public ListView(Context context) {
        this(context, null);
    }

    public ListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LC.resizeView(this);
        setDividerHeight(LC.getScaledLength(getDividerHeight()));
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        LayoutParams lp = super.generateLayoutParams(attrs);
        LC.resizeLayoutParams(lp);
        return lp;
    }
}
