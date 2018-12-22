package com.yeafel.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by kangyifan on 2018/8/15 10:47
 */
public class JsonUtil {

    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
