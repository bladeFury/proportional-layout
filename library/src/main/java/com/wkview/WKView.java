package com.wkview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import com.global.GlobalLayoutCalculator;

/**
 * View
 * Created by zhangge on 14-10-22.
 */
public class WKView extends View {
    public WKView(Context context) {
        this(context, null);
    }

    public WKView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public WKView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        // now change padding
        int paddingLeft = GlobalLayoutCalculator.getScaledLength(getPaddingLeft());
        int paddingRight = GlobalLayoutCalculator.getScaledLength(getPaddingRight());
        int paddingTop = GlobalLayoutCalculator.getScaledLength(getPaddingTop());
        int paddingBottom = GlobalLayoutCalculator.getScaledLength(getPaddingBottom());
        if (Build.VERSION.SDK_INT >= 17) {
            //:TODO paddingStart and paddingEnd need to be handled
            int paddingStart = GlobalLayoutCalculator.getScaledLength(getPaddingStart());
            int paddingEnd = GlobalLayoutCalculator.getScaledLength(getPaddingEnd());
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);

        int minHeight = 0;
        int minWidth = 0;
        if (Build.VERSION.SDK_INT >= 16) {
            minHeight = getMinimumHeight();
            minWidth = getMinimumWidth();
            setMinimumHeight(GlobalLayoutCalculator.getScaledLength(minHeight));
            setMinimumWidth(GlobalLayoutCalculator.getScaledLength(minWidth));
        }


    }
}
