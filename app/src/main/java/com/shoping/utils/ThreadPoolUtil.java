package com.shoping.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池工具，如果任务要在子线程操作需要，可以使用此线程池
 * Created by qf on 2016/12/25.
 */

public class ThreadPoolUtil {
    private static ExecutorService executorService;
    /**
     * 提供一个最大15条线程的线程池
     *
     * @param task 实现接口Runnable
     */
    public static void execute(Runnable task) {
        if (executorService == null) {
//            executorService = Executors.newFixedThreadPool(CommonConst.THREAD_AMOUNT);
        }
        executorService.execute(task);
    }
}
