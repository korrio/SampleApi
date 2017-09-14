
package com.example.api.dao.feed;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Feed implements Serializable, Parcelable
{

    @SerializedName("list")
    @Expose
    private java.util.List<com.example.api.dao.feed.List> list = null;
    @SerializedName("errors")
    @Expose
    private Errors errors;
    public final static Creator<Feed> CREATOR = new Creator<Feed>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Feed createFromParcel(Parcel in) {
            Feed instance = new Feed();
            in.readList(instance.list, (com.example.api.dao.feed.List.class.getClassLoader()));
            instance.errors = ((Errors) in.readValue((Errors.class.getClassLoader())));
            return instance;
        }

        public Feed[] newArray(int size) {
            return (new Feed[size]);
        }

    }
    ;
    private final static long serialVersionUID = -3694025849295952100L;

    public java.util.List<com.example.api.dao.feed.List> getList() {
        return list;
    }

    public void setList(java.util.List<com.example.api.dao.feed.List> list) {
        this.list = list;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(list);
        dest.writeValue(errors);
    }

    public int describeContents() {
        return  0;
    }

}
