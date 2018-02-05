package com.example.sachi.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestrurantsFragment extends Fragment {

    public RestrurantsFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.moti),getString(R.string.moti_detail),R.drawable.rest_motimahal));
        places.add(new Place(getString(R.string.chill),getString(R.string.chill_detail),R.drawable.rest_chill));
        places.add(new Place(getString(R.string.kaventers),getString(R.string.kaventers_detail),R.drawable.rest_kev));
        places.add(new Place(getString(R.string.cage),getString(R.string.cage_detail),R.drawable.rest_cage));


        PlaceAdapter itemAdapter = new PlaceAdapter(getActivity(),places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;

    }

}
