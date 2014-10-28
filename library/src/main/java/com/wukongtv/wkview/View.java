package com.wukongtv.wkview;

import android.content.Context;
import android.util.AttributeSet;

import com.wukongtv.global.LC;


/**
 * View
 * Created by zhangge on 14-10-22.
 */
public class View extends android.view.View {
    public View(Context context) {
        this(context, null);
    }

    public View(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public View(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LC.resizeView(this);
    }

}
