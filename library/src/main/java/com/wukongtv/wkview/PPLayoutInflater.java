package com.wukongtv.wkview;


import android.content.Context;


import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import android.view.View;

import com.wukongtv.utils.L;

public class PPLayoutInflater extends LayoutInflater{

    private static final String[] sClassPrefixList = {
            "com.wukongtv.wkview.",
            "com.wukongtv.wkwidget.",
            "android.widget.",
            "android.webkit.",
            "android.app."
    };

    protected PPLayoutInflater(Context context) {
        super(context);
    }

    protected PPLayoutInflater(LayoutInflater original, Context newContext) {
        super(original, newContext);
    }

    public static LayoutInflater from(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return new PPLayoutInflater(inflater, context);
    }

    @Override
    public LayoutInflater cloneInContext(Context newContext) {
        return new PPLayoutInflater(this, newContext);
    }

    /** Override onCreateView to instantiate names that correspond to the
     widgets known to the Widget factory. If we don't find a match,
     call through to our super class.
     */
    @Override protected View onCreateView(String name, AttributeSet attrs) throws ClassNotFoundException {
        for (String prefix : sClassPrefixList) {
            try {
                View view = createView(name, prefix, attrs);
                if (view != null) {
                    L.d("inflating from custom class : " + prefix + name);
                    return view;
                }
            } catch (ClassNotFoundException e) {
                // In this case we want to let the base class take a crack
                // at it.
            }
        }

        return super.onCreateView(name, attrs);
    }

}
