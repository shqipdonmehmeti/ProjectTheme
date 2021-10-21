package com.example.testprojcetfortheme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.hardware.lights.Light;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dolatkia.animatedThemeManager.AppTheme;
import com.dolatkia.animatedThemeManager.ThemeActivity;
import com.dolatkia.animatedThemeManager.ThemeManager;

public class MainActivity extends ThemeActivity {
    LinearLayout linearLayout;
    TextView helloWorld;
    Button btnDarkTheme,btnLightTheme,btnGoToFragmentTheme;
    public static boolean isNighThemeOn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.linLayout);
        btnDarkTheme = findViewById(R.id.btnDarkTheme);
        btnLightTheme = findViewById(R.id.btnLightTheme);
        btnGoToFragmentTheme = findViewById(R.id.btnGoToFragment);
        helloWorld = findViewById(R.id.helloWorld);

        btnDarkTheme.setOnClickListener(view -> {
            ThemeManager.Companion.getInstance().changeTheme(new DarkTheme(), view, 1800);
            isNighThemeOn = true;
        });
        btnLightTheme.setOnClickListener(view -> {
            ThemeManager.Companion.getInstance().changeTheme(new LightTheme(), view, 1800);
            isNighThemeOn = false;
        });

        btnGoToFragmentTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(android.R.id.content, new TestFragment()).commit();
            }
        });
    }

    @NonNull
    @Override
    public AppTheme getStartTheme() {
        return new DarkTheme();
    }

    @Override
    public void syncTheme(@NonNull AppTheme appTheme) {
        MyAppTheme myAppTheme = (MyAppTheme) appTheme;

        linearLayout.setBackgroundColor(myAppTheme.firstActivityBackgroundColor(this));
        helloWorld.setTextColor(myAppTheme.firstActivityTextColor(this));

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "onRestart: ");

    }
}