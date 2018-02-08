package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sunfeiswag on 2018/2/9.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt_d")

        public String info;
    }

    public class Temperature{

        public String max;

        public String min;

    }
}
