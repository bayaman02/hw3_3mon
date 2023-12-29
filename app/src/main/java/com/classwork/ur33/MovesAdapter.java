package com.classwork.ur33;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovesAdapter extends RecyclerView.Adapter<ViewHolder>{

    private ArrayList<String> movesNameList;

    public MovesAdapter(ArrayList<String> movesNameList) {
        this.movesNameList = movesNameList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder
                (LayoutInflater.from(parent.getContext()).inflate(R.layout.item_moves, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(movesNameList.get(position));
    }

    @Override
    public int getItemCount() {
        return movesNameList.size();
    }
}
