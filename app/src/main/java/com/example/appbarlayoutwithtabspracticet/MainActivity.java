package com.example.appbarlayoutwithtabspracticet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = { R.drawable.apple, R.drawable.orange,R.drawable.grapes,
            R.drawable.banana,R.drawable.banana,R.drawable.banana,R.drawable.banana };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        viewPager = findViewById(R.id.viewpager);
        addTabs(viewPager);
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setUpIcons();

    }

    private void setUpIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
        tabLayout.getTabAt(5).setIcon(tabIcons[5]);
        tabLayout.getTabAt(6).setIcon(tabIcons[6]);
    }

    private void addTabs(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new AppleFragement(),"APPLE");
        adapter.addFrag(new OrangeFragment(),"ORANGE");
        adapter.addFrag(new BananaFragment(),"BANANA");
        adapter.addFrag(new GrapesFragment(),"GRAPES");
        adapter.addFrag(new GrapesFragment(),"GRAPES");
        adapter.addFrag(new GrapesFragment(),"GRAPES");
        adapter.addFrag(new GrapesFragment(),"GRAPES");
        viewPager.setAdapter(adapter);
    }
}