package com.wukongtv.wkview;

import android.content.Context;
import android.util.AttributeSet;

import com.wukongtv.global.LayoutCalculator;

/**
 * ViewGroup
 * Created by zhangge on 14-10-22.
 */
public abstract class ViewGroup extends android.view.ViewGroup {

    public ViewGroup(Context context) {
        super(context);
    }

    public ViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroup(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LayoutCalculator.resizeView(this);
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        LayoutParams p =  super.generateLayoutParams(attrs);
        LayoutCalculator.resizeLayoutParams(p);
        return p;
    }
}
