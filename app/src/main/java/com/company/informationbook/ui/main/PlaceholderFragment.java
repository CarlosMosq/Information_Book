package com.company.informationbook.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.company.informationbook.databinding.FragmentCategoryViewerBinding;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    private static String mKey;

    private PageViewModel pageViewModel;
    private FragmentCategoryViewerBinding binding;

    public static PlaceholderFragment newInstance(int index, String key) {
        mKey = key;
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = new ViewModelProvider(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setKey(mKey);
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        binding = FragmentCategoryViewerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView titleView = binding.itemTitle;
        final ImageView imageView = binding.itemImageView;
        final TextView description = binding.descriptionView;
        pageViewModel.getTitle().observe(getViewLifecycleOwner(), titleView::setText);
        pageViewModel.getImage().observe(getViewLifecycleOwner(), imageView::setImageResource);
        pageViewModel.getDescription().observe(getViewLifecycleOwner(), description::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}