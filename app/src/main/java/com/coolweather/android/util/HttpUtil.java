package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by fenghao on 2016/12/16.
 */

public class HttpUtil {
    public static void sendOkHtpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall( request).enqueue( callback);
    }
}
