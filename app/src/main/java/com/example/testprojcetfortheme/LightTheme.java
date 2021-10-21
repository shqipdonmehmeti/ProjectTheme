package com.example.testprojcetfortheme;

import android.content.Context;

import androidx.core.content.ContextCompat;

import org.jetbrains.annotations.NotNull;

public class LightTheme implements MyAppTheme {
    public int id() { // set unique iD for each theme
        return 1;
    }

    public int firstActivityBackgroundColor(@NotNull Context context) {
        return ContextCompat.getColor(context, R.color.white);
    }

    public int firstActivityTextColor(@NotNull Context context) {
        return ContextCompat.getColor(context, R.color.purple_200);
    }

    public int firstActivityIconColor(@NotNull Context context) {
        return ContextCompat.getColor(context, R.color.white);
    }
}

