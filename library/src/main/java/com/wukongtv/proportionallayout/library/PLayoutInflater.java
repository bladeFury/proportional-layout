package com.wukongtv.proportionallayout.library;

import android.content.Context;
import android.view.LayoutInflater;

/**
 * Proportional Layout Inflater
 * Created by zhangge on 14-9-15.
 */
public class PLayoutInflater extends LayoutInflater{
    protected PLayoutInflater(Context context) {
        super(context);
    }

    protected PLayoutInflater(LayoutInflater original, Context newContext) {
        super(original, newContext);
    }

    @Override
    public LayoutInflater cloneInContext(Context newContext) {
        return null;
    }
}
