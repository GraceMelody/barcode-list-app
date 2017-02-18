package com.example.grace.barcodelistapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Grace on 2/11/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    public ArrayList<String> arrayViewed = new ArrayList<>();

    public static class ViewHolder extends RecyclerView.ViewHolder {


        public TextView text;

        public ViewHolder(View v, int viewType) {
            super(v);
            text = (TextView) v.findViewById(R.id.textView);

        }

    }

    //first: make a constructor to pass the arraylist
    public RecyclerViewAdapter(ArrayList inputedArray){
        arrayViewed = inputedArray;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = View.inflate(parent.getContext(), R.layout.list_layout, null);
        ViewHolder vh = new ViewHolder(v, viewType);

        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
            holder.text.setText(arrayViewed.get(position));
    }



    @Override
    public int getItemCount() {
        return ChooseListActivity.listName.size();
    }
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access

//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        // Your holder should contain a member variable
//        // for any view that will be set as you render a row
//        public TextView nameTextView;
//
//        // We also create a constructor that accepts the entire item row
//        // and does the view lookups to find each subview
//        public ViewHolder(View itemView) {
//            // Stores the itemView in a public final member variable that can be used
//            // to access the context from any ViewHolder instance.
//            super(itemView);
//
//            nameTextView = (TextView) itemView.findViewById(R.id.textView);
//
//
//        }
//    }
}