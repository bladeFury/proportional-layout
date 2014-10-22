package com.global;

/**
 * GlobalLayoutData
 * Created by zhangge on 14-10-22.
 */
public class GlobalLayoutCalculator {

    public static final int TARGET_WIDTH_IN_DP = 1280;
    public static final int TARGET_HEIGHT_IN_DP = 720;

    private static int sMultipleFactor = 2;
    private static int sDivideFactor = 1;

    public static int getScaledLength(int length) {
        return length * sMultipleFactor / sDivideFactor;
    }

    public static int getScaledHeight(int height) {
        return height * sMultipleFactor / sDivideFactor;
    }


}
