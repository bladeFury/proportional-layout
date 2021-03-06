package com.wukongtv.utils;


import java.lang.reflect.Field;

/**
 * Some Reflections
 * Created by zhangge on 14-10-4.
 */
public class Reflections {

    public static void setField(Object target, String fieldName, Object value) {
        Class<?> clazz = target.getClass();
        Field f = null;
        try {
            f = clazz.getDeclaredField(fieldName);
            f.setAccessible(true);
            f.set(target, value);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Object getField(Object target, String fieldName)
            throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = target.getClass();
        Field f = clazz.getDeclaredField(fieldName);
        f.setAccessible(true);
        return f.get(target);
    }
}
