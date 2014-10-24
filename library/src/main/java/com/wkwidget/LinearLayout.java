package com.wkwidget;

import android.content.Context;
import android.util.AttributeSet;

import com.global.LayoutCalculator;

/**
 * WKLinearLayout
 * Created by zhangge on 14-10-24.
 */
public class LinearLayout extends android.widget.LinearLayout {
    public LinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LayoutCalculator.resizeView(this);
        setDividerPadding(LayoutCalculator.getScaledLength(getDividerPadding()));
    }
}
