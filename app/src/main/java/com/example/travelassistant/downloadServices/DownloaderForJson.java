package com.example.travelassistant.downloadServices;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.UrlQuerySanitizer;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;

public class DownloaderForJson implements Runnable {

    URL url;
    private static final String TAG = "log";
    SharedPreferences sharedPreferences;
    private String mJSONURLString = "https://myrik8333.github.io/moscow.json";

    boolean isDownloading;
    Context context;


    @Override
    public void run() {


        RequestQueue requestQueue = Volley.newRequestQueue(context);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET,
                mJSONURLString,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(final JSONObject response) {

                        Log.d(TAG, "sfdfsdf");
                        try {
                            final JSONObject object = new JSONObject(response.toString());

                            //sharedPreferences = getSharedPreferences("pref", MODE_PRIVATE);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString("responce", object.toString());
                            Log.d(TAG, object.toString());
                            edit.apply();

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                    }
                }
        );
        requestQueue.add(jsonObjectRequest);
        Log.d("TAG", jsonObjectRequest.toString());
    }

    public void startDownloading(URL url) {
        if (!isDownloading) {
            isDownloading = true;
            run();
        }
    }

    void stopDownloading() {
        if (isDownloading) {
            isDownloading = false;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
