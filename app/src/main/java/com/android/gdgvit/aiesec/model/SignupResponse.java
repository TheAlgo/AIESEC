package com.android.gdgvit.aiesec.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Shuvam Ghosh on 3/26/2017.
 */

public class SignupResponse {


    @SerializedName("code")
    private String code;

    public String getStatus() {
        return code;
    }

    public void setStatus(String status) {
        this.code = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }





}

