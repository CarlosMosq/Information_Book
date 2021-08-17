package com.company.informationbook;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CategoryViewHolder>{

    private final ArrayList<String> categoryList;
    private final ArrayList<Integer> imageList;
    private final Context context;

    public RecyclerAdapter(ArrayList<String> categoryList, ArrayList<Integer> imageList, Context context) {
        this.categoryList = categoryList;
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.category_name, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.CategoryViewHolder holder, int position) {
        holder.categoryName.setText(categoryList.get(position));
        holder.categoryImage.setImageResource(imageList.get(position));
        holder.cardView.setOnClickListener(item -> {
            Intent intent = new Intent(context, CategoryViewer.class);
            intent.putExtra("categoryName", categoryList.get(position));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder {
        private final ImageView categoryImage;
        private final TextView categoryName;
        private final CardView cardView;

        public CategoryViewHolder(View itemView) {
            super(itemView);

            categoryImage = itemView.findViewById(R.id.imageView);
            categoryName = itemView.findViewById(R.id.textTitle);
            cardView = itemView.findViewById(R.id.cardLayout);
        }
    }

}
