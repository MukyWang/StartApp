package com.ambiesoft.startapp.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ambiesoft.startapp.R;
import com.ambiesoft.startapp.utility.RecyclerViewAdapter;

/**
 * Created by Zelta on 25/08/16.
 */
public class HomeFragment extends Fragment{

    private HomeFragmentPresenter presenter;
    // Firebase link for the performance root
    private final static String DB_URL = "https://start-c9adf.firebaseio.com/performance";

    public RecyclerView recyclerView;
    public RecyclerViewAdapter adapter;

    //TODO: Floating Action

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        // display menu of the top action bar
        setHasOptionsMenu(true);
//        // initialize performance ArrayList
//        performances = new ArrayList<>();
//        filteredPerformances = new ArrayList<>();
        // recycleView to hold all the cardview
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        setRecyclerViewAdapter();
        // setting up the floating action button, to access from home to map fragment
        fab = (FloatingActionButton) view.findViewById(R.id.fab);

        return view;
    }



}
