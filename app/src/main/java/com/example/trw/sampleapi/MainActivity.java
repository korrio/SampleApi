package com.example.trw.sampleapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.api.dao.smodel.AddRoute;
import com.example.api.dao.response.AddRouteResponse;
import com.example.api.dao.response.ListRouteFeedHomeResponse;
import com.example.api.http.HttpManager;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        loadData();
    }

    private void loadData() {
        //String API_KEY = "AIzaSyBDJ-humCFVkDiwM3c0nl2w0rjZV7J3Q7M";
        //String URL = "http://chavel.me/api/public/v1";

        Call<AddRouteResponse> call = HttpManager.getInstance().getService().AddRoute(
                AddRoute.user_id,
                AddRoute.route_detail,
                AddRoute.route_create,
                AddRoute.route_like,
                AddRoute.route_title,
                AddRoute.route_activity,
                AddRoute.route_city,
                AddRoute.route_travel_method,
                AddRoute.route_budgetmin,
                AddRoute.route_budgetmax,
                AddRoute.route_suggestion,
                AddRoute.route_latitude,
                AddRoute.route_longitude);
        call.enqueue(new Callback<AddRouteResponse>() {
            @Override
            public void onResponse(Call<AddRouteResponse> call, Response<AddRouteResponse> response) {
                if (response.isSuccessful()) {
                    AddRouteResponse dao = response.body();
                    String route_id = dao.getRoute_id();
                    Log.e("ROUTE_ID",route_id);
                    textView.setText(route_id);
                } else {
                    textView.setText(response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<AddRouteResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this
                        , t.toString()
                        , Toast.LENGTH_SHORT)
                        .show();
                textView.setText(t.toString());
            }
        });

        Call<ListRouteFeedHomeResponse> call2 = HttpManager.getInstance().getService().ListRouteFeedHome(2,30.1,100.1);
        call2.enqueue(new Callback<ListRouteFeedHomeResponse>() {
            @Override
            public void onResponse(Call<ListRouteFeedHomeResponse> call, Response<ListRouteFeedHomeResponse> response) {
                ListRouteFeedHomeResponse dao = response.body();
                List<ListRouteFeedHomeResponse.RouteList> list = dao.getList();
                int listSize = list.size();

                String route_ids = "";

                for(int i = 0 ; i < listSize ; i++) {
                    String route_id = list.get(i).getRoute_id();
                    route_ids += route_id + ",";
                }

                Toast.makeText(MainActivity.this
                        , route_ids
                        , Toast.LENGTH_LONG)
                        .show();
            }

            @Override
            public void onFailure(Call<ListRouteFeedHomeResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this
                        , t.toString()
                        , Toast.LENGTH_SHORT)
                        .show();
                textView.setText(t.toString());
            }
        });



    }
}
