package com.tianshaokai.video;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.GET;

public interface VideoService {
    @GET("oldertct.js")
    Call<ResponseBody> getJson();
}
