package com.example.uasmobileprogramming;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.uasmobileprogramming.fragment.history_fragment;
import com.example.uasmobileprogramming.fragment.home_fragment;
import com.example.uasmobileprogramming.fragment.profile_fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Main_Activity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener{
    // Views
    private BottomNavigationView NavView;

    // Fragment
    private home_fragment home_fragment = new home_fragment();
    private profile_fragment profile_fragment = new profile_fragment();
    private history_fragment history_fragment = new history_fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiateviews();
    }

    private void initiateviews(){
        NavView = (BottomNavigationView) findViewById(R.id.BottomNavigation);
        NavView.setOnItemSelectedListener(this);
        NavView.setSelectedItemId(R.id.Home);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.Home){
            getSupportFragmentManager().beginTransaction().replace(R.id.flfragment, home_fragment).commit();
            return true;
        } else if (item.getItemId() == R.id.History){
            getSupportFragmentManager().beginTransaction().replace(R.id.flfragment, history_fragment).commit();
            return true;
        } else if (item.getItemId() == R.id.Profile){
            getSupportFragmentManager().beginTransaction().replace(R.id.flfragment, profile_fragment).commit();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        // Don't do Anything
    }
}