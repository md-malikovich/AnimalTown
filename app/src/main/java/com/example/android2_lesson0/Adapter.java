package com.example.android2_lesson0;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    ArrayList <Task> task;

    public Adapter() {
        task = new ArrayList<>();
        task.add(new Task("Task #1", "Description #1"));
        task.add(new Task("Task #2", "Description #2"));
        task.add(new Task("Task #3", "Description #3"));
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_task, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //holder.onBind(task.get(position));
    }

    @Override
    public int getItemCount() {
        return task.size();
    }

    public void addNewTask(Task tasks) {
        task.add(tasks);
        notifyDataSetChanged();
        Log.d("ololo", "add New Task");
    }
}
