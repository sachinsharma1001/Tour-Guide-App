package com.example.sachi.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.redfort),getString(R.string.redfort_detail), R.drawable.historical_redfort));
        places.add(new Place(getString(R.string.firozshahkotlafort),getString(R.string.firozshahkotlafort_detail), R.drawable.historical_firozshah));
        places.add(new Place(getString(R.string.hauzkhas),getString(R.string.hauzkhas_detail), R.drawable.historical_hauzkhas));
        places.add(new Place(getString(R.string.indiagate),getString(R.string.indiagate_detail), R.drawable.historical_indiagate));
        places.add(new Place(getString(R.string.safdarjungtomb),getString(R.string.safdarjungtomb_detail), R.drawable.historical_safdarjung));
        places.add(new Place(getString(R.string.qutabminar),getString(R.string.qutabminar_detail), R.drawable.historical_qminar));
        places.add(new Place(getString(R.string.humayuntomb),getString(R.string.humayuntomb_detail), R.drawable.historical_safdarjung));
        places.add(new Place(getString(R.string.puranaquila),getString(R.string.puranaquila_detail), R.drawable.historical_purana));
        places.add(new Place(getString(R.string.tuglakabadfort),getString(R.string.tuglokabadfort_detail), R.drawable.historical_tfort));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
