package com.example.testprojcetfortheme;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dolatkia.animatedThemeManager.AppTheme;
import com.dolatkia.animatedThemeManager.ThemeFragment;

public class TestFragment extends ThemeFragment {
        View view;
        LinearLayout linearLayout;
        TextView tv1,tv2;

    public TestFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_test, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        linearLayout = view.findViewById(R.id.linLayoutFragment);
        tv1 = view.findViewById(R.id.tv1);
        tv2 = view.findViewById(R.id.tv2);
    }

    @Override
    public void syncTheme(@NonNull AppTheme appTheme) {
            MyAppTheme myAppTheme = (MyAppTheme) appTheme;
            linearLayout.setBackgroundColor(myAppTheme.firstActivityBackgroundColor(requireActivity()));
            tv1.setTextColor(myAppTheme.firstActivityTextColor(requireActivity()));

    }
}