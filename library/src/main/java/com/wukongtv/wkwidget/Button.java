package com.wukongtv.wkwidget;

import android.content.Context;
import android.util.AttributeSet;

import com.wukongtv.utils.LC;

/**
 * Auto Button
 * Created by zhangge on 15-1-5.
 */
public class Button extends android.widget.Button {
    public Button(Context context) {
        this(context, null);
    }

    public Button(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Button(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LC.resizeView(this);
        setTextSize(LC.getScaledLength(getTextSize()));
        setCompoundDrawablePadding(getCompoundDrawablePadding());
    }
}
