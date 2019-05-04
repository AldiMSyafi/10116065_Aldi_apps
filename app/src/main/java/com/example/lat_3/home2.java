package com.example.lat_3;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.lat_3.fragment.Activity;
import com.example.lat_3.fragment.Gallery;
import com.example.lat_3.fragment.Homef;
import com.example.lat_3.fragment.Music;
import com.example.lat_3.fragment.Profile;

/*
 10116065
 Aldi Muhamamd Syafi
 AKB-2 / IF-2

 CHANGELOG
 membuat splash screen 25-04-2019 16:44

 membuat slide adapter 26-04-2019 15:00

 membuat view pager 26-04-2019 19:24

 membuat tampilan utama 29-04-2019  16:42

 membuat fragment about,Activity,Galler,Homef,music,profile,Ig_fragment 02-04-2019 12:30

 membuat model,model_kontak,model_musik 03-04-2019 10:40

 membuat adapter daily,gambar,kontak,music 04-05-2019 10:10

*/
public class home2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.draw_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            FragmentManager manager = getSupportFragmentManager();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new Homef()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {

            case R.id.nav_home :
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Homef()).commit();
                break;
            case R.id.nav_activ :
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Activity()).commit();
                break;
            case R.id.nav_gallery :
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Gallery()).commit();
                break;
            case R.id.nav_music :
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Music()).commit();
                break;
            case R.id.nav_profile :
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Profile()).commit();
                break;

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }


}
