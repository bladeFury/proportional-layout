package com.wukongtv.wkview;

import android.view.LayoutInflater;
import android.view.View;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Some Reflections
 * Created by zhangge on 14-10-4.
 */
public class Reflections {
    public static void reflectView_onFinishInflate(View object) {
        try {
            Method m = View.class.getMethod("onFinishInflate");
            m.setAccessible(true);
            m.invoke(object);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static LayoutInflater.Factory2 reflectLayoutInflater_getPrivateFactory(LayoutInflater object) {
        try {
            Field f = LayoutInflater.class.getField("mPrivateFactory");
            f.setAccessible(true);
            Object obj = f.get(object);
            if (obj instanceof LayoutInflater.Factory2) {
                return (LayoutInflater.Factory2) obj;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }
}
