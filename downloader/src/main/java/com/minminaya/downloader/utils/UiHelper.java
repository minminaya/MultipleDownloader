package com.minminaya.downloader.utils;

import android.os.Handler;
import android.os.Looper;

/**
 * 在异步线程中,可通过此帮助类直接向主线程发送消息
 *
 * @author minminaya
 * @email minminaya@gmail.com
 * @time Created by 2019/1/22 20:03
 */
public class UiHelper {

    private volatile static Handler sHandler = null;

    private static Handler getInstance() {
        if (sHandler == null) {
            synchronized (UiHelper.class) {
                if (sHandler == null) {
                    sHandler = new Handler(Looper.getMainLooper());
                }
            }
        }
        return sHandler;
    }

    /**
     * 防止内存泄漏
     */
    public static void removeAll() {
        if (null != sHandler) {
            sHandler.removeCallbacksAndMessages(null);
        }
    }

    public static void removeCallback(Runnable runnable) {
        if (null != sHandler) {
            sHandler.removeCallbacks(runnable);
        }
    }

    /**
     * 在主线程中执行
     *
     * @param runnable 任务
     */
    public static void runOnUiThread(Runnable runnable) {
        if (runningMainThread()) {
            runnable.run();
        } else {
            getInstance().post(runnable);
        }
    }

    /**
     * 在主线程中延时执行
     *
     * @param runnable    任务
     * @param delayMillis 毫秒延迟
     */
    public static void runOnUiThreadDelay(Runnable runnable, long delayMillis) {
        getInstance().postDelayed(runnable, delayMillis);
    }

    public static boolean runningMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
