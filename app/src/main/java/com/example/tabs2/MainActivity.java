package com.example.tabs2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tabs2.controller.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tabItem1;
    TabItem tabItem2;
    TabItem tabItem3;

    Button bntEliminarEmpleado;
    EditText editId;
    TextView textViewButton;

    PagerController pagerAdapter;


    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabItem1 = findViewById(R.id.tabInsertar);
        tabItem2 = findViewById(R.id.tabConsultar);
        tabItem3 = findViewById(R.id.tabEliminar);


        bntEliminarEmpleado = findViewById(R.id.btnDeleteEmpleado);
        editId = findViewById(R.id.edtId);
        textViewButton = findViewById(R.id.textViewButton);





        pagerAdapter = new PagerController(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if ( tab.getPosition() == 0 )
                {
                    pagerAdapter.notifyDataSetChanged();
                }
                if( tab.getPosition() == 1 )
                {
                    pagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition() == 2)
                {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));






    }


}
