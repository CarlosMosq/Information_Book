package com.company.informationbook.ui.main;

import android.content.Intent;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.company.informationbook.CategoriesData;

public class PageViewModel extends ViewModel {
    private String mKey;
    private final CategoriesData categories = new CategoriesData();

    private final MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private final LiveData<String> mTitle = Transformations.map(mIndex, input -> {
        categories.startCategory(mKey);

        return categories.itemNamesList.get(input - 1);
    });
    private final LiveData<Integer> mImage = Transformations.map(mIndex, input -> {
        categories.startCategory(mKey);

        return categories.itemImageList.get(input - 1);
    });
    private final LiveData<String> mDescription = Transformations.map(mIndex, input -> {
        categories.startCategory(mKey);

        return categories.itemDescriptionList.get(input - 1);
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public void setKey(String key) {mKey = key;}

    public LiveData<String> getTitle() {
        return mTitle;
    }
    public LiveData<Integer> getImage() {
        return mImage;
    }
    public LiveData<String> getDescription() {
        return mDescription;
    }




}