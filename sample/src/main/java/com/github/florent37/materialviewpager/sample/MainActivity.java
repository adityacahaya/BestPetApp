package com.github.florent37.materialviewpager.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.crashlytics.android.Crashlytics;
import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;
import com.github.florent37.materialviewpager.sample.fragment.RecyclerViewFragment;
import com.github.florent37.materialviewpager.sample.fragment.ScrollFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends DrawerActivity {

    @BindView(R.id.materialViewPager)
    MaterialViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Best Pet App");
        ButterKnife.bind(this);

        final Toolbar toolbar = mViewPager.getToolbar();
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }

        mViewPager.getViewPager().setAdapter(new InformationFragmentPagerAdapter(getSupportFragmentManager(),this));

        mViewPager.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {
                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorResAndUrl(
                            R.color.green,
                            "http://cdn1.damianpuppies.com/resize/2017/04/20/medium-anjing-pasangan-anak-anjing-anjing-manis-wallpaper-background.jpg");
                    case 1:
                        return HeaderDesign.fromColorResAndUrl(
                            R.color.blue,
                            "http://www.maniakucing.com/wp-content/uploads/2016/10/foto-anak-kucing-lucu-sedang-berjalan-dirumput-1.jpg");
                    case 2:
                        return HeaderDesign.fromColorResAndUrl(
                            R.color.cyan,
                            "http://3.bp.blogspot.com/-9xVOWDYSTi0/UgnTFfGGNxI/AAAAAAAAGt4/hd_wMUWYDF8/s1600/binatang.jpg");
                    case 3:
                        return HeaderDesign.fromColorResAndUrl(
                            R.color.red,
                            "http://www.cool-small-pets.com/image-files/pet_hamster.jpg");
                    case 4:
                        return HeaderDesign.fromColorResAndUrl(
                                R.color.lime,
                                "http://2.bp.blogspot.com/-P4fW6qdmTZ0/UCYGGHzRJfI/AAAAAAAAEaA/FmSwlCAJCJ8/s1600/Fish-wallpapers-atoz.blog-All-Fish-Wallpapers-11.jpg");
                }
                return null;
            }
        });

        mViewPager.getViewPager().setOffscreenPageLimit(mViewPager.getViewPager().getAdapter().getCount());
        mViewPager.getPagerTitleStrip().setViewPager(mViewPager.getViewPager());

        final View logo = findViewById(R.id.logo_white);
        if (logo != null) {
            logo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mViewPager.notifyHeaderChanged();
                    Toast.makeText(getApplicationContext(), "Yuk kita mengenal hewan peliharaan !", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
