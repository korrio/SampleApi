package com.example.api.dao.response;

/**
 * Created by korrio on 9/14/2017 AD.
 */

public class AddRouteResponse {

    /**
     * route_id : 204
     * errors : {"status":"200","source":"/addRoute","title":"Success","detail":"route_id: 204"}
     */

    private String route_id;
    private ErrorsBean errors;

    public String getRoute_id() {
        return route_id;
    }

    public void setRoute_id(String route_id) {
        this.route_id = route_id;
    }

    public ErrorsBean getErrors() {
        return errors;
    }

    public void setErrors(ErrorsBean errors) {
        this.errors = errors;
    }

    public static class ErrorsBean {
        /**
         * status : 200
         * source : /addRoute
         * title : Success
         * detail : route_id: 204
         */

        private String status;
        private String source;
        private String title;
        private String detail;

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
    }
}
