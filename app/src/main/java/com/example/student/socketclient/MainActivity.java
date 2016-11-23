package com.example.student.socketclient;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    MyPagerAdapter myPagerAdapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);

        //툴바에 프로젝트 이름이 나오게 함.
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //회전 애니메이션 효과 주기
    public void setRotate(View view){
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim_config);
        view.startAnimation(anim);
    }

    //메뉴를 선택하면
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_chat:
                viewPager.setCurrentItem(0);
                break;
            case R.id.menu_config:
                viewPager.setCurrentItem(1);
                setRotate(item.getActionView());
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
