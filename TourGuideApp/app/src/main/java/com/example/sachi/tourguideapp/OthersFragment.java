package com.example.sachi.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class OthersFragment extends Fragment {

    public OthersFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.zoo),getString(R.string.zoo_detail),R.drawable.others_zoo));
        places.add(new Place(getString(R.string.centralpark),getString(R.string.centralpark_detail),R.drawable.others_park));
        places.add(new Place(getString(R.string.bird),getString(R.string.bird_detail),R.drawable.others_birds));
        places.add(new Place(getString(R.string.bangla),getString(R.string.bangla_detail),R.drawable.others_bangla));
        places.add(new Place(getString(R.string.aksardham),getString(R.string.aksardham_detail),R.drawable.others_akshardham));
        places.add(new Place(getString(R.string.lotus),getString(R.string.lotus_detail),R.drawable.others_lotus));
        places.add(new Place(getString(R.string.cmandir),getString(R.string.cmandir_detail),R.drawable.others_chattarpur));
        places.add(new Place(getString(R.string.garden),getString(R.string.garden_detail),R.drawable.others_garden));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(),places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
