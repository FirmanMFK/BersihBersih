package id.firman.app.cleancode.networking;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Firman on 4/28/2017.
 */

public class Response {
    @SerializedName("status")
    public String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @SuppressWarnings({"unused", "used by Retrofit"})
    public Response() {

    }

    public Response(String status) {
        this.status = status;
    }
}
