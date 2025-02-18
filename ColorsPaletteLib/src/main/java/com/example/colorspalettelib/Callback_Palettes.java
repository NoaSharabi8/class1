package com.example.colorspalettelib;

import java.util.List;

public interface Callback_Palettes {

    void ready(List<Palette> features);

    void failed(String message);
}
