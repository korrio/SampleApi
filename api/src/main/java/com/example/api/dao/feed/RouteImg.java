
package com.example.api.dao.feed;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RouteImg implements Serializable, Parcelable
{

    @SerializedName("img_text")
    @Expose
    private String imgText;
    public final static Creator<RouteImg> CREATOR = new Creator<RouteImg>() {


        @SuppressWarnings({
            "unchecked"
        })
        public RouteImg createFromParcel(Parcel in) {
            RouteImg instance = new RouteImg();
            instance.imgText = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public RouteImg[] newArray(int size) {
            return (new RouteImg[size]);
        }

    }
    ;
    private final static long serialVersionUID = 15613267772452491L;

    public String getImgText() {
        return imgText;
    }

    public void setImgText(String imgText) {
        this.imgText = imgText;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(imgText);
    }

    public int describeContents() {
        return  0;
    }

}
