package com.android.gdgvit.aiesec.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Shuvam Ghosh on 3/29/2017.
 */

public class UploadResponse {



    @SerializedName("code")
    String code;
    @SerializedName("msg")
    String msg;
    @SerializedName("files")
    String files;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }
}
