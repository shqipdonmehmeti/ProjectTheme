package com.example.testprojcetfortheme;

import android.content.Context;

import com.dolatkia.animatedThemeManager.AppTheme;

import org.jetbrains.annotations.NotNull;

interface MyAppTheme extends AppTheme {
    int firstActivityBackgroundColor(@NotNull Context context);
    int firstActivityTextColor(@NotNull Context context);
    int firstActivityIconColor(@NotNull Context context);
    // any other methods for other elements
}