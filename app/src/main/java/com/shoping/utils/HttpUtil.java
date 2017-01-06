package com.shoping.utils;


import android.util.Log;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 网络下载工具集合，json、图片、音乐等下载
 * Created by qf on 2016/12/25.
 */

public class HttpUtil {

    public static String getRefreshJsom(String path) {
        String json = null;
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(path).tag("navTabItem").build();
        try {
            Response response = okHttpClient.newCall(request).execute();
            if (response.isSuccessful()) {
                json = response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}
