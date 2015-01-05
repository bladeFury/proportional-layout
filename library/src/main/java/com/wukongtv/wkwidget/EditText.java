package com.wukongtv.wkwidget;

import android.content.Context;
import android.util.AttributeSet;

import com.wukongtv.utils.LC;

/**
 * Auto EditText
 * Created by zhangge on 15-1-5.
 */
public class EditText extends android.widget.EditText {
    public EditText(Context context) {
        this(context, null);
    }

    public EditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public EditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LC.resizeView(this);
        TextView.resizeTextView(this);
    }
}
