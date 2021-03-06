package com.example.productivitybooster;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubItemAdapter extends RecyclerView.Adapter<SubItemAdapter.SubItemViewHolder> {


    List<String> items;

    public SubItemAdapter(List<String> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public SubItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View todoView = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new SubItemViewHolder(todoView);
    }

    @Override
    public void onBindViewHolder(@NonNull SubItemViewHolder subItemViewHolder, int position) {
        String item = items.get(position);
        subItemViewHolder.bind(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class SubItemViewHolder extends RecyclerView.ViewHolder{

        TextView tvItem;

        public SubItemViewHolder(@NonNull View itemView) {
            super(itemView);
            tvItem = itemView.findViewById(android.R.id.text1);
        }

        public void bind(String item) {
            tvItem.setText(item);
        }
    }
}