package com.wukongtv.wkwidget;

import android.content.Context;
import android.util.AttributeSet;

import com.wukongtv.global.LayoutCalculator;

/**
 * TextView
 * Created by zhangge on 14-10-27.
 */
public class TextView extends android.widget.TextView {

    public TextView(Context context) {
        this(context, null);
    }

    public TextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LayoutCalculator.resizeView(this);

        // drawable padding
        int drawablePadding = LayoutCalculator.getScaledLength(getCompoundDrawablePadding());
        setCompoundDrawablePadding(drawablePadding);

    }
}
