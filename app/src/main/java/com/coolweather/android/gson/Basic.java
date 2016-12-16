package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fenghao on 2016/12/16.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    private String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}