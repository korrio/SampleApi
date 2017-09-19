package com.example.api.dao.response;

/**
 * Created by korrio on 9/19/2017 AD.
 */

public class AddPinResponse {

    /**
     * place_id : 210
     * errors : {"status":"200","source":"/addPlace","title":"Success","detail":"place_id: 210","place_id":"210"}
     * place_name : 2
     * place_latitude : 30
     * place_longitude : 100
     */

    private String place_id;
    private ErrorsBean errors;
    private String place_name;
    private String place_latitude;
    private String place_longitude;

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public ErrorsBean getErrors() {
        return errors;
    }

    public void setErrors(ErrorsBean errors) {
        this.errors = errors;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getPlace_latitude() {
        return place_latitude;
    }

    public void setPlace_latitude(String place_latitude) {
        this.place_latitude = place_latitude;
    }

    public String getPlace_longitude() {
        return place_longitude;
    }

    public void setPlace_longitude(String place_longitude) {
        this.place_longitude = place_longitude;
    }

    public static class ErrorsBean {
        /**
         * status : 200
         * source : /addPlace
         * title : Success
         * detail : place_id: 210
         * place_id : 210
         */

        private String status;
        private String source;
        private String title;
        private String detail;
        private String place_id;

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

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }
    }
}
