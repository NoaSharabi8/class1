package com.example.colorspalettelib;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class PaletteController {

    private static final String BASE_URL = "https://api-flask-mobile-seminar.vercel.app/";

    private PaletteAPI getAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(
                        GsonConverterFactory.create(
                                new GsonBuilder()
                                        .setLenient()
                                        .create()
                        )
                )
                .build();

        return retrofit.create(PaletteAPI.class);
    }

    public void fetchAllActiveFeatures(String package_name, Callback_Palettes callbackFeatures) {
        Call<List<Palette>> call = getAPI().loadActiveFeatures(package_name);
        call.enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<List<Palette>> call, Response<List<Palette>> response) {
                callbackFeatures.ready(response.body());
            }

            @Override
            public void onFailure(Call<List<Palette>> call, Throwable throwable) {
                callbackFeatures.failed(throwable.getMessage());
            }
        });
    }
}
