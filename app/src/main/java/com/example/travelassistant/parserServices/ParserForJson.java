package com.example.travelassistant.parserServices;

import android.os.Parcel;
import android.os.Parcelable;

public class ParserForJson implements Parcelable {

    protected ParserForJson(Parcel in) {
    }

    public static final Creator<ParserForJson> CREATOR = new Creator<ParserForJson>() {
        @Override
        public ParserForJson createFromParcel(Parcel in) {
            return new ParserForJson(in);
        }

        @Override
        public ParserForJson[] newArray(int size) {
            return new ParserForJson[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }


}
