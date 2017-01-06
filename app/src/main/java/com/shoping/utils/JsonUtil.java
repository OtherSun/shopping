package com.shoping.utils;

import com.google.gson.Gson;
import com.shoping.bean.Refresh_New;

/**
 * json解析存放处
 * <p>
 * Created by qf on 2016/12/26.
 */

public class JsonUtil {
    public static Refresh_New parseZhiJson(String json) {
        Gson gson = new Gson();
        Refresh_New refresh_new = null;
        if (json != null) {
            refresh_new = gson.fromJson(json, Refresh_New.class);
        }
        return refresh_new;
    }

}
