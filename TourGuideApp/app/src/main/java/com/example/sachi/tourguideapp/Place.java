package com.example.sachi.tourguideapp;

public class Place {
    private String mPlaceName;
    private String mPlaceDetail;
    private int mImageResource;


    public Place(String mPlaceName, String mPlaceDetail) {
        this.mPlaceName = mPlaceName;
        this.mPlaceDetail = mPlaceDetail;
    }

    public Place(String mPlaceName, String mPlaceDetail, int mImageResource) {
        this.mPlaceName = mPlaceName;
        this.mPlaceDetail = mPlaceDetail;
        this.mImageResource = mImageResource;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public String getmPlaceDetail() {
        return mPlaceDetail;
    }

    public int getmImageResource() {
        return mImageResource;
    }
}
