/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.florent37.materialviewpager.sample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.webkit.WebViewFragment;

import com.github.florent37.materialviewpager.sample.fragment.AnjingFragment;
import com.github.florent37.materialviewpager.sample.fragment.BurungFragment;
import com.github.florent37.materialviewpager.sample.fragment.HamsterFragment;
import com.github.florent37.materialviewpager.sample.fragment.IkanFragment;
import com.github.florent37.materialviewpager.sample.fragment.KucingFragment;
import com.github.florent37.materialviewpager.sample.fragment.RecyclerViewFragment;
import com.github.florent37.materialviewpager.sample.fragment.ScrollFragment;

public class InformationFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private String tabTitles[];

    public InformationFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabTitles = new String[] {
                "Anjing",
                "Kucing",
                "Burung",
                "Hamster",
                "Ikan"
        };
    }

    @Override
    public Fragment getItem(int position) {
        switch (position % 5) {
            case 0:
                return new AnjingFragment();
            case 1:
                return new KucingFragment();
            case 2:
                return new BurungFragment();
            case 3:
                return new HamsterFragment();
            case 4:
                return new IkanFragment();
            default:
                return new AnjingFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
