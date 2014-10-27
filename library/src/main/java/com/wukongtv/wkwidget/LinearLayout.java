package com.wukongtv.wkwidget;

import android.content.Context;
import android.util.AttributeSet;

import com.wukongtv.global.LayoutCalculator;

/**
 * WKLinearLayout
 * Created by zhangge on 14-10-24.
 */
public class LinearLayout extends android.widget.LinearLayout {

    public LinearLayout(Context context) {
        this(context, null);
    }

    public LinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LayoutCalculator.resizeView(this);
        setDividerPadding(LayoutCalculator.getScaledLength(getDividerPadding()));
    }
}
