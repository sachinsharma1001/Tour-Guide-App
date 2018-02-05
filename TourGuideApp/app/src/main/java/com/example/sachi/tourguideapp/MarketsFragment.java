package com.example.sachi.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MarketsFragment extends Fragment {

    public MarketsFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.chandnichowk),getString(R.string.chandni_detail)));
        places.add(new Place(getString(R.string.tradefair),getString(R.string.tradefair_detail)));
        places.add(new Place(getString(R.string.delhihaat),getString(R.string.delhihaat_detail)));
        places.add(new Place(getString(R.string.delhihaat2),getString(R.string.delhihaat2_detail)));
        places.add(new Place(getString(R.string.delhihaat3),getString(R.string.delhihaat3_detail)));
        places.add(new Place(getString(R.string.palika),getString(R.string.palika_detail)));
        places.add(new Place(getString(R.string.karolbagh),getString(R.string.karolbagh_detail)));


        PlaceAdapter itemAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;
    }

}
