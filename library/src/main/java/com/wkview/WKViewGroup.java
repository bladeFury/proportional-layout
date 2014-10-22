package com.wkview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * ViewGroup
 * Created by zhangge on 14-10-22.
 */
public abstract class WKViewGroup extends ViewGroup {

    public WKViewGroup(Context context) {
        super(context);
    }

    public WKViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WKViewGroup(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
