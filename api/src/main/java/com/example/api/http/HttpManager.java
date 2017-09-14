package com.example.api.http;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpManager {

    private static HttpManager instances;

    public static HttpManager getInstance() {
        if (instances == null)
            instances = new HttpManager();
        return instances;
    }
    private ApiService service;

    private HttpManager() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://chavel.me/api/public/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(ApiService.class);
    }

    public  ApiService getService() {
        return service;
    }
}
