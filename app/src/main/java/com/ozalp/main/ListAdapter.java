package com.ozalp.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ozalp.main.databinding.RowBinding;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListHolder> {

    ArrayList<String> arrayList;

    public ListAdapter (ArrayList<String> arrayList){
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowBinding rowBinding = RowBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false);
        return new ListHolder(rowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ListHolder holder, int position) {
        holder.rowBinding.text.setText(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ListHolder extends RecyclerView.ViewHolder {
        RowBinding rowBinding;
        public ListHolder(RowBinding rowBinding){
            super(rowBinding.getRoot());
            this.rowBinding = rowBinding;
        }
    }
}
