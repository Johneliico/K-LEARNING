package com.example.kids_learning;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ScoreAdapter extends RecyclerView.Adapter<ScoreAdapter.ScoreViewAdapter> {

    List<answerclass> lists;
    Context context;

    public ScoreAdapter(List<answerclass> lists, Context context) {
        this.lists = lists;
        this.context = context;
    }

    @NonNull
    @Override
    public ScoreViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new ScoreViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScoreViewAdapter holder, int position) {
        answerclass currentItem = lists.get(position);
        holder.answerid.setText(String.valueOf(currentItem.getAnswerid()));

    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class ScoreViewAdapter extends RecyclerView.ViewHolder {

        TextView answerid;

        public ScoreViewAdapter(@NonNull View itemView) {
            super(itemView);

            answerid = itemView.findViewById(R.id.tvscole);
        }
    }
}
