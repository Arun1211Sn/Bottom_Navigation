package com.kevin.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivityCustom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_custom);
        CustomBottomNavigation curvedBottomNavigationView = findViewById(R.id.customBottomBar);
        curvedBottomNavigationView.inflateMenu(R.menu.bottom_nav_menu);
    }
}