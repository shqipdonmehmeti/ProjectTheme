package com.example.testprojcetfortheme;

import android.content.Context;

import androidx.core.content.ContextCompat;

import org.jetbrains.annotations.NotNull;

public class DarkTheme implements MyAppTheme {
    public int id() { // set unique iD for each theme
        return 2;
    }

    public int firstActivityBackgroundColor(@NotNull Context context) {
        return ContextCompat.getColor(context, R.color.black);
    }

    public int firstActivityTextColor(@NotNull Context context) {
        return ContextCompat.getColor(context,  R.color.teal_200);
    }

    public int firstActivityIconColor(@NotNull Context context) {
        return ContextCompat.getColor(context, R.color.black);
    }

}