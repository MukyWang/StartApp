package com.ambiesoft.startapp.utility;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ambiesoft.startapp.R;

/**
 * Created by Zelta on 25/08/16.
 */
public class ViewHolder extends RecyclerView.ViewHolder{

    public CardView cv;
    public TextView name;
    public TextView category;
    public TextView date;
    public TextView time;

    public ViewHolder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView);
        name = (TextView) itemView.findViewById(R.id.nameView);
        category = (TextView) itemView.findViewById(R.id.categoryView);
        date = (TextView) itemView.findViewById(R.id.dateView);
        time = (TextView) itemView.findViewById(R.id.timeView);
    }
}
