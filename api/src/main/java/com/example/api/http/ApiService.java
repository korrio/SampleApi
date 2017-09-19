package com.example.api.http;

import com.example.api.dao.AddRoute;
import com.example.api.dao.AddRouteResponse;
import com.example.api.dao.Collection;
import com.example.api.dao.ListRouteFeedHomeResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @GET("byurl")
    Call<Collection> Repos(@Query("url") String url
            , @Query("key") String Key);

    @FormUrlEncoded
    @POST("addRoute")
    Call<AddRouteResponse> AddRoute(
            @Field("user_id") String user_id,
            @Field("route_detail") String route_detail,
            @Field("route_create") String route_create,
            @Field("route_like") String route_like,
                    @Field("route_title") String route_title,
                    @Field("route_activity") String route_activity,
                    @Field("route_city") String route_city,
                    @Field("route_travel_method") String route_travel_method,
                    @Field("route_budgetmin") String route_budgetmin,
                    @Field("route_budgetmax") String route_budgetmax,
                    @Field("route_suggestion") String route_suggestion,
                    @Field("route_latitude") String route_latitude,
                    @Field("route_longitude") String route_longitude

    );

    @FormUrlEncoded
    @POST("listRoutesFeedHome")
    Call<ListRouteFeedHomeResponse> ListRouteFeedHome(
            @Field("user_id") int user_id,
            @Field("latitude") Double route_detail,
            @Field("longitude") Double route_create
    );



//    public static String user_id;
//    public static String route_detail;
//    public static String route_create;
//    public static String route_like;
//    public static String route_title;
//    public static String route_activity;
//    public static String route_city;
//    public static String route_travel_method;
//    public static String route_budgetmin;
//    public static String route_budgetmax;
//    public static String route_suggestion;
//    public static String route_latitude;
//    public static String route_longitude;
}
