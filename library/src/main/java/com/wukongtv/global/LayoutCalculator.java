package com.wukongtv.global;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/**
 * GlobalLayoutData
 * Created by zhangge on 14-10-22.
 */
public class LayoutCalculator {

    public static final int TARGET_WIDTH_IN_DP = 1280;
    public static final int TARGET_HEIGHT_IN_DP = 720;

    private static int sMultipleFactor = 2;
    private static int sDivideFactor = 1;

    public static int getScaledLength(int length) {
        return length * sMultipleFactor / sDivideFactor;
    }

    public static void resizeView(View v) {
        // now change padding
        int paddingLeft = getScaledLength(v.getPaddingLeft());
        int paddingRight = getScaledLength(v.getPaddingRight());
        int paddingTop = getScaledLength(v.getPaddingTop());
        int paddingBottom = getScaledLength(v.getPaddingBottom());
        if (Build.VERSION.SDK_INT >= 17) {
            //:TODO paddingStart and paddingEnd need to be handled
            int paddingStart = getScaledLength(v.getPaddingStart());
            int paddingEnd = getScaledLength(v.getPaddingEnd());
        }
        v.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);

        int minHeight = 0;
        int minWidth = 0;
        if (Build.VERSION.SDK_INT >= 16) {
            minHeight = v.getMinimumHeight();
            minWidth = v.getMinimumWidth();
            v.setMinimumHeight(getScaledLength(minHeight));
            v.setMinimumWidth(getScaledLength(minWidth));
        }

        //:TODO scrollBarSize and fadingEdgeLength need to be handled
    }

    private static boolean isWrapContentOrMatchParent(int dimenSize) {
        return dimenSize < 0;
    }

    public static void resizeLayoutParams(ViewGroup.LayoutParams p) {
        if (!isWrapContentOrMatchParent(p.width)) {
            p.width = getScaledLength(p.width);
        }
        if (!isWrapContentOrMatchParent(p.height)) {
            p.height = getScaledLength(p.height);
        }
    }

    public static void resizeMarginLayoutParams(ViewGroup.MarginLayoutParams p) {
        p.leftMargin = getScaledLength(p.leftMargin);
        p.rightMargin = getScaledLength(p.rightMargin);
        p.topMargin = getScaledLength(p.topMargin);
        p.bottomMargin = getScaledLength(p.bottomMargin);
        // :TODO margin start and margin end
        //p.setMarginStart(getScaledLength(p.getMarginStart()));
        //p.setMarginEnd(getScaledLength(p.getMarginEnd()));
    }

}
