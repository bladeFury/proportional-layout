package com.wkview;

import android.content.Context;
import android.util.AttributeSet;

import com.global.LayoutCalculator;


/**
 * View
 * Created by zhangge on 14-10-22.
 */
public class View extends View {
    public View(Context context) {
        this(context, null);
    }

    public View(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public View(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutCalculator.resizeView(this);
    }

}
