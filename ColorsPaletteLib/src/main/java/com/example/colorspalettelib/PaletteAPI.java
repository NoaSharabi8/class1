package com.example.colorspalettelib;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;
public interface PaletteAPI {

    @GET("/feature-toggles")
    Call<List<Palette>> loadActiveFeatures(
            @Path(value= "package_name", encoded = true) String _package_name
    );

}
