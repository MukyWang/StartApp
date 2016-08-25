package com.ambiesoft.startapp.fragment;

import android.app.Fragment;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Zelta on 25/08/16.
 */
public class HomeFragment extends Fragment{

    private HomeFragmentPresenter presenter;
    // Firebase link for the performance root
    private final static String DB_URL = "https://start-c9adf.firebaseio.com/performance";

    public RecyclerView recyclerView;
    public RecyclerViewAdapter adapter;

}
