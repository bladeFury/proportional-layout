package com.wukongtv.utils;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/**
 * LC stands for Layout Calculator
 * Created by zhangge on 14-10-22.
 */
public class LC {

    public static final int TARGET_WIDTH_IN_PX = 1280;
    public static final int TARGET_HEIGHT_IN_PX = 720;

    private static float sScaleFactor = 0;

    public static int getScaledLength(int length) {
        return (int) (length * sScaleFactor);
    }

    public static float getScaledLength(float length) {
        return length * sScaleFactor;
    }

    public static void init(Context c) {
        WindowManager wm = (WindowManager) c.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics metrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(metrics);
        final int currentScreenWidth = metrics.widthPixels;
        L.d(metrics.toString());
        sScaleFactor = (float)currentScreenWidth / TARGET_WIDTH_IN_PX;
    }

    public static void resizeView(View v) {
        // now change padding
        int paddingLeft = getScaledLength(v.getPaddingLeft());
        int paddingRight = getScaledLength(v.getPaddingRight());
        int paddingTop = getScaledLength(v.getPaddingTop());
        int paddingBottom = getScaledLength(v.getPaddingBottom());
        if (Build.VERSION.SDK_INT >= 17) {
            int paddingStart = getScaledLength(v.getPaddingStart());
            int paddingEnd = getScaledLength(v.getPaddingEnd());
            Reflections.setField(v, "paddingStart", paddingStart);
            Reflections.setField(v, "paddingEnd", paddingEnd);
        }
        v.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);

        int minHeight;
        int minWidth;
        if (Build.VERSION.SDK_INT >= 16) {
            minHeight = v.getMinimumHeight();
            minWidth = v.getMinimumWidth();
            v.setMinimumHeight(getScaledLength(minHeight));
            v.setMinimumWidth(getScaledLength(minWidth));
        }

        // :TODO scrollBarSize and fadingEdgeLength need to be handled
        // currently not supported
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
        resizeLayoutParams(p);
        p.leftMargin = getScaledLength(p.leftMargin);
        p.rightMargin = getScaledLength(p.rightMargin);
        p.topMargin = getScaledLength(p.topMargin);
        p.bottomMargin = getScaledLength(p.bottomMargin);
        // :TODO we do not support startMargin and endMargin for now
//        int startMargin = Reflections.getField(p, "startMargin");
//        int endMargin = Reflections.getField(p, "endMargin");
//        Reflections.setField(p, "startMargin", getScaledLength(p.getMarginStart()));
//        Reflections.setField(p, "endMargin", getScaledLength(p.getMarginEnd()));
    }

}
