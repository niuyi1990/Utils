package com.niuyi.utils.utils;

import android.content.Context;

/**
 * 作者：${牛毅} on 2016/04/07 10:10
 * 邮箱：niuyi19900923@hotmail.com
 * Utils初始化相关
 */
public class Utils {

    private static Context context;

    private Utils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        Utils.context = context.getApplicationContext();
    }

    /**
     * 获取ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        if (context != null) return context;
        throw new NullPointerException("u should init first");
    }
}