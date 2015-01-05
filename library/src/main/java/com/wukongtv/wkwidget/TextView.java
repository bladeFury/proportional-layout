package com.wukongtv.wkwidget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;

import com.wukongtv.utils.LC;

/**
 * TextView
 * Created by zhangge on 14-10-27.
 */
public class TextView extends android.widget.TextView {

    public TextView(Context context) {
        this(context, null);
    }

    public TextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LC.resizeView(this);
        resizeTextView(this);
    }

    public static void resizeTextView(android.widget.TextView tv) {
        // textsize
        tv.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                LC.getScaledLength(tv.getTextSize()));

        // drawable padding
        int drawablePadding = LC.getScaledLength(tv.getCompoundDrawablePadding());
        tv.setCompoundDrawablePadding(drawablePadding);

        // :TODO max height
    }

}
