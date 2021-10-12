package com.example.bannerfestivalactivity.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.bannerfestivalactivity.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.RoundedCornerTreatment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navigationView;
    FloatingActionButton gallaryFloatingbtn;
    BottomAppBar bottomAppBar;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bindingView();
        navigationView.setBackground(null);

        setBottomnav();

    }

    private void setBottomnav() {


        MaterialShapeDrawable bottomBarBackground = (MaterialShapeDrawable) bottomAppBar.getBackground();
        bottomBarBackground.setShapeAppearanceModel(
                bottomBarBackground.getShapeAppearanceModel()
                        .toBuilder()
                        .setAllCorners(new RoundedCornerTreatment()).setAllCornerSizes(new RelativeCornerSize(0.5f))
                        .build());


        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.menu_tv:
                        Toast.makeText(MainActivity.this, "yess toasa", Toast.LENGTH_SHORT).show();
//                drawerLayout.openDrawer(Gravity.RIGHT);
                }

                return true;
            }
        });
    }

    private void bindingView() {

        navigationView = findViewById(R.id.nav_view);
        bottomAppBar = findViewById(R.id.bottom_bar);
        gallaryFloatingbtn = findViewById(R.id.btnAdd);


    }
}