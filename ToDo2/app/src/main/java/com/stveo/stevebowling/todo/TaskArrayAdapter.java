package com.stveo.stevebowling.todo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by stevebowling on 10/18/16.
 */

public class TaskArrayAdapter extends ArrayAdapter<Task>{

    private int resource;
    private ArrayList<Task> tasks;
    private LayoutInflater inflater;
    private SimpleDateFormat formatter;



    public TaskArrayAdapter(Context context, int resource, ArrayList<Task> object){
     super(context, resource,object);
        this.resource=resource;
        this.tasks =object;

        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        formatter= new SimpleDateFormat("MM/dd/yyyy");
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View notesRow = inflater.inflate(resource, parent, false);

        TextView noteTitle = (TextView)notesRow.findViewById(R.id.taskName);
        TextView noteText = (TextView)notesRow.findViewById(R.id.taskDetail);
        TextView noteDate = (TextView)notesRow.findViewById(R.id.dateModified);
        TextView noteCategory = (TextView)notesRow.findViewById(R.id.category);
        TextView noteDueDate = (TextView)notesRow.findViewById(R.id.dueDate);

        Task task = tasks.get(position);

        noteDueDate.setText(task.getDueDate());
        noteCategory.setText(task.getCategory());
        noteTitle.setText(task.getName());
        noteText.setText(task.getText());
        noteDate.setText(formatter.format(task.getDateModified()));

        return notesRow;
    }
    public void updateAdapter(ArrayList<Task> tasks){
        this.tasks = tasks;
        super.notifyDataSetChanged();
    }


}
