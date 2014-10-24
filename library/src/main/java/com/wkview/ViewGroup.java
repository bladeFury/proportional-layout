package com.wkview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

import com.global.LayoutCalculator;

/**
 * ViewGroup
 * Created by zhangge on 14-10-22.
 */
public abstract class ViewGroup extends ViewGroup {

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
        return LayoutCalculator.resizeLayoutParams(p);
    }
}
