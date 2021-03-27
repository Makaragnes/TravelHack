package com.example.travelassistant;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelassistant.routings.AdapterForRoutings;
import com.example.travelassistant.routings.ResursesForRoutings;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class RoutingActivity extends AppCompatActivity implements AdapterForRoutings.OnNoteListener {
    private static final String TAG = "LOG";
    public ArrayList<ResursesForRoutings> resorsesForUnivers = new ArrayList<>();
    public ArrayList<String> ides = new ArrayList<String>();
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_routing);

        RecyclerView recyclerView = findViewById(R.id.list2);
        AdapterForRoutings adapter = new AdapterForRoutings(this, resorsesForUnivers, this);
        recyclerView.setAdapter(adapter);

        sharedPreferences = getSharedPreferences("pref", MODE_PRIVATE);
        final String string1 = sharedPreferences.getString("responce", "");
        final String string2 = sharedPreferences.getString("responce2", "");
        final String string3 = sharedPreferences.getString("responce3", "");
        final String mos = sharedPreferences.getString("mos", "");
        final String pit = sharedPreferences.getString("pit", "");
        final String kas = sharedPreferences.getString("kas", "");

//        if(mos.equals("1")) {
//            try {
//                final JSONObject object = new JSONObject(string1);
//                final JSONObject object1 = object.getJSONObject("response");
//
//                String count = object1.getString("count");
//                Log.d(TAG, count);
//                JSONArray array = object1.getJSONArray("items");
//
//                for (int i = 0; i < array.length(); ++i) {
//
//                    JSONObject item = array.getJSONObject(i);
//                    //Log.d(TAG, item.toString());
//                    String id = item.getString("id");
//                    ides.add(id);
//
//                    String title = item.getString("title"); // Название вуза
//                    Log.d(TAG, title);
//                    resorsesForUnivers.add(new AdapterForRoutings(title));
//                    adapter.notifyDataSetChanged();
//                }
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//        }

//        if(pit.equals("0")) {
//            try {
//                final JSONObject object = new JSONObject(string2);
//                final JSONObject object1 = object.getJSONObject("response");
//
//                String count = object1.getString("count");
//                Log.d(TAG, count);
//                JSONArray array = object1.getJSONArray("items");
//
//                for (int i = 0; i < array.length(); ++i) {
//
//                    JSONObject item = array.getJSONObject(i);
//                    //Log.d(TAG, item.toString());
//                    String id = item.getString("id");
//                    ides.add(id);
//
//                    String title = item.getString("title"); // Название вуза
//                    Log.d(TAG, title);
//                    resorsesForUnivers.add(new ResursesForRoutings(title));
//                    adapter.notifyDataSetChanged();
//                }
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//        }

//        if(kas.equals("2")) {
//            try {
//                final JSONObject object = new JSONObject(string3);
//                final JSONObject object1 = object.getJSONObject("response");
//
//                String count = object1.getString("count");
//                Log.d(TAG, count);
//                JSONArray array = object1.getJSONArray("items");
//
//                for (int i = 0; i < array.length(); ++i) {
//
//                    JSONObject item = array.getJSONObject(i);
//                    //Log.d(TAG, item.toString());
//                    String id = item.getString("id");
//                    ides.add(id);
//
//                    String title = item.getString("title"); // Название вуза
//                    Log.d(TAG, title);
//                    resorsesForUnivers.add(new ResorsesForUnivers(title));
//                    adapter.notifyDataSetChanged();
//                }
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//        }
//
    }

    @Override
    public void onNoteClick(int position) {
        resorsesForUnivers.get(position);
        //Intent intent = new Intent(this, Vus.class);
        //intent.putParcelableArrayListExtra("list", ides);
        //intent.putExtra("id", String.valueOf(resorsesForUnivers.get(position)));
        //startActivity(intent);
    }


}
