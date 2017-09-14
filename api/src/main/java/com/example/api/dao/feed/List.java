
package com.example.api.dao.feed;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class List implements Serializable, Parcelable
{

    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("user_image")
    @Expose
    private String userImage;
    @SerializedName("route_id")
    @Expose
    private String routeId;
    @SerializedName("route_title")
    @Expose
    private String routeTitle;
    @SerializedName("route_detail")
    @Expose
    private String routeDetail;
    @SerializedName("diffDate")
    @Expose
    private String diffDate;
    @SerializedName("route_activity")
    @Expose
    private String routeActivity;
    @SerializedName("route_city")
    @Expose
    private String routeCity;
    @SerializedName("route_travel_method")
    @Expose
    private String routeTravelMethod;
    @SerializedName("route_budgetmin")
    @Expose
    private String routeBudgetmin;
    @SerializedName("route_budgetmax")
    @Expose
    private String routeBudgetmax;
    @SerializedName("route_suggestion")
    @Expose
    private String routeSuggestion;
    @SerializedName("route_img")
    @Expose
    private java.util.List<RouteImg> routeImg = null;
    public final static Creator<List> CREATOR = new Creator<List>() {


        @SuppressWarnings({
            "unchecked"
        })
        public List createFromParcel(Parcel in) {
            List instance = new List();
            instance.userId = ((String) in.readValue((String.class.getClassLoader())));
            instance.userName = ((String) in.readValue((String.class.getClassLoader())));
            instance.userImage = ((String) in.readValue((String.class.getClassLoader())));
            instance.routeId = ((String) in.readValue((String.class.getClassLoader())));
            instance.routeTitle = ((String) in.readValue((String.class.getClassLoader())));
            instance.routeDetail = ((String) in.readValue((String.class.getClassLoader())));
            instance.diffDate = ((String) in.readValue((String.class.getClassLoader())));
            instance.routeActivity = ((String) in.readValue((String.class.getClassLoader())));
            instance.routeCity = ((String) in.readValue((String.class.getClassLoader())));
            instance.routeTravelMethod = ((String) in.readValue((String.class.getClassLoader())));
            instance.routeBudgetmin = ((String) in.readValue((String.class.getClassLoader())));
            instance.routeBudgetmax = ((String) in.readValue((String.class.getClassLoader())));
            instance.routeSuggestion = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.routeImg, (com.example.api.dao.feed.RouteImg.class.getClassLoader()));
            return instance;
        }

        public List[] newArray(int size) {
            return (new List[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6512171110711631824L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRouteTitle() {
        return routeTitle;
    }

    public void setRouteTitle(String routeTitle) {
        this.routeTitle = routeTitle;
    }

    public String getRouteDetail() {
        return routeDetail;
    }

    public void setRouteDetail(String routeDetail) {
        this.routeDetail = routeDetail;
    }

    public String getDiffDate() {
        return diffDate;
    }

    public void setDiffDate(String diffDate) {
        this.diffDate = diffDate;
    }

    public String getRouteActivity() {
        return routeActivity;
    }

    public void setRouteActivity(String routeActivity) {
        this.routeActivity = routeActivity;
    }

    public String getRouteCity() {
        return routeCity;
    }

    public void setRouteCity(String routeCity) {
        this.routeCity = routeCity;
    }

    public String getRouteTravelMethod() {
        return routeTravelMethod;
    }

    public void setRouteTravelMethod(String routeTravelMethod) {
        this.routeTravelMethod = routeTravelMethod;
    }

    public String getRouteBudgetmin() {
        return routeBudgetmin;
    }

    public void setRouteBudgetmin(String routeBudgetmin) {
        this.routeBudgetmin = routeBudgetmin;
    }

    public String getRouteBudgetmax() {
        return routeBudgetmax;
    }

    public void setRouteBudgetmax(String routeBudgetmax) {
        this.routeBudgetmax = routeBudgetmax;
    }

    public String getRouteSuggestion() {
        return routeSuggestion;
    }

    public void setRouteSuggestion(String routeSuggestion) {
        this.routeSuggestion = routeSuggestion;
    }

    public java.util.List<RouteImg> getRouteImg() {
        return routeImg;
    }

    public void setRouteImg(java.util.List<RouteImg> routeImg) {
        this.routeImg = routeImg;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(userId);
        dest.writeValue(userName);
        dest.writeValue(userImage);
        dest.writeValue(routeId);
        dest.writeValue(routeTitle);
        dest.writeValue(routeDetail);
        dest.writeValue(diffDate);
        dest.writeValue(routeActivity);
        dest.writeValue(routeCity);
        dest.writeValue(routeTravelMethod);
        dest.writeValue(routeBudgetmin);
        dest.writeValue(routeBudgetmax);
        dest.writeValue(routeSuggestion);
        dest.writeList(routeImg);
    }

    public int describeContents() {
        return  0;
    }

}
