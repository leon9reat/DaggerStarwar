package com.medialink.daggerstarwar.retrofit;

import com.medialink.daggerstarwar.pojo.Films;
import com.medialink.daggerstarwar.pojo.People;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ApiInterface {
    String BASE_URL = "https://swapi.co/api/";

    @GET("people/")
    Call<People> getPeople(@Query("page") int page);

    @GET
    Call<Films> getFilmData(@Url String url);
}
