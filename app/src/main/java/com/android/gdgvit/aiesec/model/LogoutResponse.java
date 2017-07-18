package com.android.gdgvit.aiesec.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Shuvam Ghosh on 4/17/2017.
 */

public class LogoutResponse {

    @SerializedName("token")
    private String status;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
