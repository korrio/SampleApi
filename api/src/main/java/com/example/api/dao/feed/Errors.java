
package com.example.api.dao.feed;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Errors implements Serializable, Parcelable
{

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("detail")
    @Expose
    private String detail;
    public final static Creator<Errors> CREATOR = new Creator<Errors>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Errors createFromParcel(Parcel in) {
            Errors instance = new Errors();
            instance.status = ((String) in.readValue((String.class.getClassLoader())));
            instance.source = ((String) in.readValue((String.class.getClassLoader())));
            instance.title = ((String) in.readValue((String.class.getClassLoader())));
            instance.detail = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Errors[] newArray(int size) {
            return (new Errors[size]);
        }

    }
    ;
    private final static long serialVersionUID = -5952474627549816509L;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(source);
        dest.writeValue(title);
        dest.writeValue(detail);
    }

    public int describeContents() {
        return  0;
    }

}
