package com.company.informationbook.ui.main;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.company.informationbook.CategoriesData;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private final CategoriesData category = new CategoriesData();
    private final Context mContext;
    private static String mKey;

    public SectionsPagerAdapter(Context context, FragmentManager fm, String key) {
        super(fm);
        category.startCategory(key);
        mContext = context;
        mKey = key;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1, mKey);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return category.getTabPlaceholder() + " " + (position + 1);
    }

    @Override
    public int getCount() {
        return category.getCategorySize();
    }
}