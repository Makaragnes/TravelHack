package com.example.travelassistant.downloadServices;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.travelassistant.request.InputStreamVolleyRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Arrays;

public class DownloadAudio implements Runnable {

    static String url;
    private static final String TAG = "log";
    SharedPreferences sharedPreferences;
    private String mJSONURLString = "https://myrik8333.github.io/moscow.json";

    static private boolean isDownloading =true;
    static Context context;

    static String fileName;

    public DownloadAudio(String url, String fileName, Context context, boolean isDownloading){
        this.url = url;
        this.fileName = fileName;
        this.context = context;
        this.isDownloading=isDownloading;
    }


    @Override
    public void run() {
        Log.d("good game", "Well played");
        String mUrl= url.toString();

        InputStreamVolleyRequest request = new InputStreamVolleyRequest(Request.Method.GET, mJSONURLString,
                new Response.Listener<byte[]>() {
                    @Override
                    public void onResponse(byte[] response) {
                        Log.d("good game", "Well played");
                        Log.d("TAG", Arrays.toString(response));
                        // TODO handle the response
                        try {
                            if (response!=null) {
                                //sharedPreferences.

//                                FileOutputStream outputStream;
//                                String name=fileName;
//                            //changed the  name  of  the  expression to  txt, file-name  should  not  contain path separatos
//                                outputStream = context.openFileOutput("ffff.txt", Context.MODE_PRIVATE);
//                                outputStream.write(response);
//                                outputStream.close();
                              //  Toast.makeText(this, "Download complete.", Toast.LENGTH_LONG).show();
                                Log.d("good game", "Well played");
                                String baseFolder;
                                FileInputStream inStream;
                             //   inStream= context.openFileInput("ffff.txt", Context.MODE_PRIVATE);;
                                baseFolder = context.getExternalFilesDir(null).getAbsolutePath();
                                Log.d("good game folder ", baseFolder);
                            }
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            Log.d("KEY_ERROR", "UNABLE TO DOWNLOAD FILE");
                            e.printStackTrace();
                        }
                    }
                } ,new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO handle the error
                error.printStackTrace();
            }
        }, null);
        RequestQueue mRequestQueue = Volley.newRequestQueue(context, new HurlStack());
        mRequestQueue.add(request);
    }

    public void startDownloading(String url) {
        if (!isDownloading) {
            isDownloading = true;
            run();
        }
    }

    public static void stopDownloading() {
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
