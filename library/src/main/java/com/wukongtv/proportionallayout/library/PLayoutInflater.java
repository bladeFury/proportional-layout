package com.wukongtv.proportionallayout.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Proportional Layout Inflater
 * Created by zhangge on 14-9-15.
 */
public class PLayoutInflater implements LayoutInflater.Factory, LayoutInflater.Factory2 {

    private LayoutInflater mDelegate;

    private PLayoutInflater(LayoutInflater l) {
        mDelegate = l;
        mDelegate.setFactory2(this);
    }
    /**
     * Obtains the LayoutInflater from the given context.
     * @param context context
     * @return the PLayoutInflater
     */
    public static PLayoutInflater from(Context context) {
        LayoutInflater layoutInflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (layoutInflater == null) {
            throw new AssertionError("LayoutInflater not found.");
        }
        return new PLayoutInflater(layoutInflater);
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return null;
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return null;
    }
}
