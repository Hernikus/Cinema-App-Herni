package com.herni.hk_nomat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ScifiFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView movieRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_scifi, container, false);

        String[] Names = new String[MovieDetail.sci_fi.length];
        for (int i = 0; i < Names.length; i++) {
            Names[i] = MovieDetail.sci_fi[i].getName();
        }

        int[] Images = new int[MovieDetail.sci_fi.length];
        for (int i = 0; i < Images.length; i++) {
            Images[i] = MovieDetail.sci_fi[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(Names, Images);
        movieRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        movieRecycler.setLayoutManager(layoutManager);
        return movieRecycler;
    }
}