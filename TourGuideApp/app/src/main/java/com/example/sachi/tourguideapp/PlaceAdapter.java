package com.example.sachi.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public  PlaceAdapter(Activity context, ArrayList<Place> places) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeName = (TextView) listItemView.findViewById(R.id.place_textview);
        placeName.setText(currentPlace.getmPlaceName());

        TextView placeDetail = (TextView) listItemView.findViewById(R.id.detail_textview);
        placeDetail.setText(currentPlace.getmPlaceDetail());

        ImageView placeImage = (ImageView) listItemView.findViewById(R.id.image_textview);
        placeImage.setImageResource(currentPlace.getmImageResource());

        return listItemView;
    }
}
